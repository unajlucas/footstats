package pl.lr.apps.fstats.rest.models;

import pl.lr.apps.fstats.entities.CompetitionTab;
import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.model.CompetitionsVM;
import pl.lr.apps.fstats.rest.RequestI;
import pl.lr.apps.fstats.rest.ResponseI;
import pl.lr.apps.fstats.services.CompetitionService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Competitions extends BasicComponents implements RequestI, ResponseI {

    private static final Logger logger = LoggerFactory.getLogger(Competitions.class);

    private static final String CLASS_NAME = " [Competitions] ";

    private final CompetitionService competitionService;
    private List<CompetitionsVM> competitionsVMList;

    public Competitions(CompetitionService competitionService, Integer season){
        super(Views.competitions.name(), season);
        this.competitionService = competitionService;
        this.competitionsVMList = new ArrayList<>();
        logger.info("{} initialized", CLASS_NAME);
    }

    @Override
    public void processRequest() {
        logger.info("{} processRequest() started.", CLASS_NAME);
        List<CompetitionTab> competitionList = competitionService.getAllCompetitions();
        for (CompetitionTab competition : competitionList){
            competitionsVMList.add(CompetitionsVM.convertToV(competition));
        }
        logger.info("{} processRequest() finished.", CLASS_NAME);
    }

    @Override
    public void processResponse() {
        logger.info("{} processResponse() started.", CLASS_NAME);
        modelAndViewResponse.addObject("competitionList", competitionsVMList);
        modelAndViewResponse.addObject("season", sid);
        //modelAndViewResponse.addObject("competitions", "competitions");
        logger.info("{} processResponse() finished.", CLASS_NAME);
    }
}
