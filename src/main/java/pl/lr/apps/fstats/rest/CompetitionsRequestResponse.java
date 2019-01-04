package pl.lr.apps.fstats.rest;

import pl.lr.apps.fstats.entities.CompetitionTab;
import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.model.CompetitionsVM;
import pl.lr.apps.fstats.services.CompetitionService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CompetitionsRequestResponse extends RequestResponseComponents implements Request, Response {

    private static final Logger logger = LoggerFactory.getLogger(CompetitionsRequestResponse.class);

    private static final String CLASS_NAME = " [CompetitionsRequestResponse] ";

    private CompetitionService competitionService;
    private List<CompetitionsVM> competitionsVMList;

    public CompetitionsRequestResponse(Integer season){
        super(Views.competitions.name());
        this.sid = season;
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
