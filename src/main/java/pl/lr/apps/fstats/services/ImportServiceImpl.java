package pl.lr.apps.fstats.services;

import java.sql.Timestamp;

import pl.lr.apps.fstats.entities.MatchTab;
import pl.lr.apps.fstats.entities.MatchV;
import pl.lr.apps.fstats.mappers.MatchVFieldSetMapper;
import pl.lr.apps.fstats.repositories.CompetitionTabRepository;
import pl.lr.apps.fstats.repositories.SeasonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service("importService")
public class ImportServiceImpl extends ViewAbstract implements ImportService {

    private static final Logger logger = LoggerFactory.getLogger(ImportServiceImpl.class);
    //private boolean success;

//    @Autowired
//    StakeService stakeService;

    @Autowired
    private CompetitionTabRepository competitionTabRepository;

    @Autowired
    private Environment environment;

    @Autowired
    private MatchService matchService;

    @Autowired
    private SeasonRepository seasonRepository;

    @Autowired
    private TeamService teamService;

//    @Override
//    public ModelAndView importBets() {
//
//        setView("redirect:/imports/view");
//
//        success = stakeService.importBets("bets.file");
//        return model;
//    }

    @Override
    public void importMatches(String competition) {
        //setView("redirect:/competitions");
        String propertySourceValue = getSourceValue(competition);
        int c_id = 0;//= competitionTabRepository
        if ("all".equals(competition)) {
            String[] sources = propertySourceValue.split(",");
            for (String source : sources) {
                importMatchesFromCsv(source, c_id);
            }
        } else {
            importMatchesFromCsv(propertySourceValue, c_id);
        }
    }

    private String getSourceValue(String competition) {
        return environment.getProperty(competition + ".csv.file");
    }

    private void importMatchesFromCsv(String source, int competition)
            throws UnexpectedInputException, ParseException {
        logger.info("importMatchesFromCSV start");
        Resource resource = getFileFromResource(source);

        FlatFileItemReader<MatchV> itemReader = setItemReader(resource);
        itemReader.open(new ExecutionContext());
        processMatch(itemReader);
        itemReader.close();

        logger.info("importMatchesFromCSV end");
    }

    private void processMatch(FlatFileItemReader<MatchV> reader) {
        MatchV matchVCsvEntry;
        int sId = 0;
        int ht_id = 0;
        int at_id = 0;
        MatchTab matchTabEntry;
        try {
            while ((matchVCsvEntry = reader.read()) != null) {
                logger.info(matchVCsvEntry.getDiv());
                if (sId == 0) {
                    //sId = setSeasonId(matchVCsvEntry.getDate());
                }
                ht_id = teamService.findTeamIdByName(matchVCsvEntry.getHome_team());
                at_id = teamService.findTeamIdByName(matchVCsvEntry.getAway_team());

                matchTabEntry = matchService.findMatchBySeasonIdAndHomeTeamIdAndAwayTeamId(sId, ht_id, at_id);
                if (matchTabEntry == null) {
                    logger.info("match not founded.. ");
                    addMatch(sId, ht_id, at_id, matchTabEntry, matchVCsvEntry);
                    //matchService.getMatchTabRepository().save(entity)
                } else {
                    logger.info("match founded ");
                    if (matchTabEntry.getFt() != 1) {
                        matchTabEntry = updateMatchEntry(matchVCsvEntry, matchTabEntry);
                        updateMatch(matchTabEntry);
                    }
                    //validateMatch(match,matchTab);
                }
            }
            logger.info("sId " + sId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateMatch(MatchTab matchTabEntry) {

        //updateMatch
    }

    private MatchTab updateMatchEntry(MatchV matchVCsvEntry, MatchTab matchTabEntry) {
        if (!matchVCsvEntry.getDate().equals(matchTabEntry.getDate())) {
            //matchTabEntry.setDate(matchVCsvEntry.getDate());
        }
        if (!(matchVCsvEntry.getHg() == matchTabEntry.getHg())) {
            matchTabEntry.setHg(matchVCsvEntry.getHg());
        }
        if (!(matchVCsvEntry.getAg() == matchTabEntry.getAg())) {
            matchTabEntry.setAg(matchVCsvEntry.getAg());
        }

        return matchTabEntry;
    }

    private void addMatch(int s_id, int ht_id, int at_id, MatchTab matchTabEntry, MatchV matchVCsvEntry) {
        //matchTabEntry.setDate(matchVCsvEntry.getDate());
        matchTabEntry.setS_id(s_id);
        matchTabEntry.setHt_id(ht_id);
        matchTabEntry.setAt_id(at_id);
        matchTabEntry.setHg(matchVCsvEntry.getHg());
        matchTabEntry.setAg(matchVCsvEntry.getAg());

        //addMatch
    }

    private int setSeasonId(Timestamp date) {
        String year = date.toString().substring(0, 4);
        logger.info("year " + year);
        int sId = seasonRepository.findSeasonIdByYear(year);
        return sId;
    }

    private void processMatch(MatchV match, int sId) {
        logger.info("----------");
        logger.info(match.toString());
    }

    private FlatFileItemReader<MatchV> setItemReader(Resource resource) {
        FlatFileItemReader<MatchV> itemReader = new FlatFileItemReader<>();
        itemReader.setResource(resource);
        itemReader.setLineMapper(setLineMapper());
        itemReader.setLinesToSkip(1);
        return itemReader;
    }

    private DefaultLineMapper<MatchV> setLineMapper() {
        DefaultLineMapper<MatchV> lineMapper = new DefaultLineMapper<MatchV>();
        lineMapper.setLineTokenizer(setDelimitedLineTokenizer());
        lineMapper.setFieldSetMapper(new MatchVFieldSetMapper());
        return lineMapper;
    }

    private Resource getFileFromResource(String source) {
        return new FileSystemResource(source);
    }

    private DelimitedLineTokenizer setDelimitedLineTokenizer(){
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        delimitedLineTokenizer.setNames(new String[] {"Div", "HomeTeam"});
        delimitedLineTokenizer.setIncludedFields(0,2);
        return delimitedLineTokenizer;
    }


//    private void processTest(FlatFileItemReader<TestCSV> reader){
//        try {
//            TestCSV testCSV = reader.read();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    private FlatFileItemReader<TestCSV> setTestItemReader(Resource resource) {
//        FlatFileItemReader<TestCSV> itemReader = new FlatFileItemReader<>();
//        itemReader.setResource(resource);
//        itemReader.setLineMapper(setTestLineMapper());
//        itemReader.setLinesToSkip(1);
//        return itemReader;
//    }

//    private DefaultLineMapper<TestCSV> setTestLineMapper() {
//        DefaultLineMapper<TestCSV> lineMapper = new DefaultLineMapper<>();
//        lineMapper.setLineTokenizer(setDelimitedLineTokenizer());
//        //lineMapper.setFieldSetMapper(new MatchVFieldSetMapper());
//        BeanWrapperFieldSetMapper<TestCSV> beanWrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
//        beanWrapperFieldSetMapper.setTargetType(TestCSV.class);
//        lineMapper.setFieldSetMapper(beanWrapperFieldSetMapper);
//        return lineMapper;
//    }
}
