package pl.lr.apps.fstats.rest.controller;

import pl.lr.apps.fstats.rest.MatchRequestResponse;
import pl.lr.apps.fstats.rest.RequestResponseFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MatchController {

    private static final Logger logger = LoggerFactory.getLogger(MatchController.class);

    private static final String CONTROLLER_NAME = "{ Match.Controller }";

    @Autowired
    private RequestResponseFactory requestResponseFactory;

    @RequestMapping(value = {"/matches"}, method = RequestMethod.GET)
    public ModelAndView getAllMatchesBySeason(
            @RequestParam(value = "s_id", required = false, defaultValue="${default.s_id}") int s_id) {
        logger.info("START: {}, getAllMatchesBySeason ", CONTROLLER_NAME);

        MatchRequestResponse matchRequestResponse = requestResponseFactory.makeMatchRequestResponse(s_id);

        matchRequestResponse.processRequest();

        logger.info("END: {}, getAllMatchesBySeason ", CONTROLLER_NAME);

        return matchRequestResponse.getModelAndViewResponse();
    }
}
