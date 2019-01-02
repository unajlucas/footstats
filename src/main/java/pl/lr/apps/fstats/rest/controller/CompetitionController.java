package pl.lr.apps.fstats.rest.controller;

import pl.lr.apps.fstats.rest.CompetitionRequestResponse;
import pl.lr.apps.fstats.rest.CompetitionsRequestResponse;
import pl.lr.apps.fstats.rest.RequestResponseFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CompetitionController {

    private static final Logger logger = LoggerFactory.getLogger(CompetitionController.class);

    private static final String CONTROLLER_NAME = "{ CompetitionController }";

    @Autowired
    private RequestResponseFactory requestResponseFactory;

    @RequestMapping(value = "/competitions")
    public ModelAndView getAllCompetitions() {
        logger.info("START: {}, getAllCompetitions ", CONTROLLER_NAME);

        CompetitionsRequestResponse competitionsRequestResponse = requestResponseFactory.makeCompetitionsRequestResponse();

        competitionsRequestResponse.processRequest();

        logger.info("END: {}, getAllCompetitions ", CONTROLLER_NAME);
        return competitionsRequestResponse.getModelAndViewResponse();
    }

    @RequestMapping("/competitions/{competition}/{season}")
    public ModelAndView getCompetitionDetails(
            @PathVariable("competition") String competition,
            @RequestParam(value = "season", required = false, defaultValue="${default.s_id}") Integer sid) {
        logger.info("START: {}, getCompetitionDetails ", CONTROLLER_NAME);

        CompetitionRequestResponse competitionRequestResponse
                = requestResponseFactory.makeCompetitionRequestResponse(competition, sid);

        competitionRequestResponse.processRequest();

        logger.info("END: {}, getCompetitionDetails ", CONTROLLER_NAME);
        return competitionRequestResponse.getModelAndViewResponse();
    }
}
