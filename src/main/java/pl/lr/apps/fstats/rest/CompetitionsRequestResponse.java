package pl.lr.apps.fstats.rest;

import org.springframework.web.servlet.ModelAndView;
import pl.lr.apps.fstats.entities.CompetitionTab;
import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.services.CompetitionService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Getter
@Setter
public class CompetitionsRequestResponse extends ViewResponse implements RequestResponse {

    private static final Logger logger = LoggerFactory.getLogger(CompetitionsRequestResponse.class);

    private static final String CLASS_NAME = " [CompetitionsRequestResponse] ";

    private CompetitionService competitionService;

    public CompetitionsRequestResponse(Integer season){
        super(Views.competitions.name());
        this.sid = season;
        logger.info("{} initialized", CLASS_NAME);
    }

    @Override
    public void processRequest() {
        logger.info("{} processRequest() started.", CLASS_NAME);
        List<CompetitionTab> competitionList = competitionService.getAllCompetitions();
        modelAndViewResponse.addObject("competitionList", competitionList);
        modelAndViewResponse.addObject("season", sid);
        modelAndViewResponse.addObject("competitions", "competitions");
        logger.info("{} processRequest() finished.", CLASS_NAME);
    }

}
