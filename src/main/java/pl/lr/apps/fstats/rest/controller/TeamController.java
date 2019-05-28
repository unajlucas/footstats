package pl.lr.apps.fstats.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.lr.apps.fstats.rest.models.Team;
import pl.lr.apps.fstats.rest.models.Teams;

@Controller
public class TeamController extends Main {

    private static final Logger logger = LoggerFactory.getLogger(TeamController.class);

    private static final String CONTROLLER_NAME = "{ TeamController }";

    @RequestMapping(value = {"/teams"}, method = RequestMethod.GET)
    public ModelAndView getAllTeamsBySeason(
            @RequestParam(value = "season", required = false, defaultValue="${default.s_id}") Integer season) {
        logger.info("START: {}, getAllTeamsBySeason ", CONTROLLER_NAME);

        Teams teamsRequestResponse = restRequestResponseFactory.makeTeamsRequestResponse(season);

        teamsRequestResponse.processRequest();

        logger.info("END: {}, getAllTeamsBySeason ", CONTROLLER_NAME);
        return teamsRequestResponse.getModelAndViewResponse();
    }

    @RequestMapping(value = {"/teams/{team}"}, method = RequestMethod.GET)
    public ModelAndView getTeam(@PathVariable("team") String team,
            @RequestParam(value = "s_id", required = false, defaultValue="${default.s_id}") int s_id) {
        logger.info("START: {}, getTeam", CONTROLLER_NAME);

        Team teamRequestResponse = restRequestResponseFactory.makeTeamRequestResponse(team, s_id);

        teamRequestResponse.processRequest();

        logger.info("END: {}, getTeam", CONTROLLER_NAME);
        return teamRequestResponse.getModelAndViewResponse();
    }
}
