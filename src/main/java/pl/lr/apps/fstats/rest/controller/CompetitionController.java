package pl.lr.apps.fstats.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import pl.lr.apps.fstats.rest.models.Competition;
import pl.lr.apps.fstats.rest.models.Competitions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CompetitionController extends Main {

    private static final Logger logger = LoggerFactory.getLogger(CompetitionController.class);

    private static final String CONTROLLER_NAME = "{ CompetitionController }";

    @RequestMapping(value = "/competitions")
    public ModelAndView getCompetitionList(
            @RequestParam(value = "season", required = false, defaultValue="${default.s_id}") Integer season){

        logger.info("START: {}, getCompetitionList ", CONTROLLER_NAME);

        Competitions competitionsRequestResponse = restRequestResponseFactory.makeCompetitionsRequestResponse(season);
        competitionsRequestResponse.processRequest();
        competitionsRequestResponse.processResponse();

        logger.info("END: {}, getCompetitionList ", CONTROLLER_NAME);
        return competitionsRequestResponse.getModelAndViewResponse();
    }

    @RequestMapping("/competitions/{competition}")
    public ModelAndView getCompetitionDetails(
            @PathVariable("competition") String competition,
            @RequestParam(value = "season", required = false, defaultValue="${default.s_id}") Integer sid) {
        logger.info("START: {}, getCompetitionDetails ", CONTROLLER_NAME);

        Competition competitionRequestResponse
                = restRequestResponseFactory.makeCompetitionRequestResponse(competition, sid);

        competitionRequestResponse.processRequest();
        competitionRequestResponse.processResponse();

        logger.info("END: {}, getCompetitionDetails ", CONTROLLER_NAME);
        return competitionRequestResponse.getModelAndViewResponse();
    }
}
