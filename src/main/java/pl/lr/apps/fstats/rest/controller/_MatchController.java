package pl.lr.apps.fstats.rest.controller;

import pl.lr.apps.fstats.rest.RequestResponseFactoryI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class _MatchController {

    private static final Logger logger = LoggerFactory.getLogger(_MatchController.class);

    private static final String CONTROLLER_NAME = "{ Match.Controller }";

    @Autowired
    private RequestResponseFactoryI requestResponseFactory;

//    @RequestMapping(value = {"/matches"}, method = RequestMethod.GET)
//    public ModelAndView getAllMatchesBySeason(
//            @RequestParam(value = "s_id", required = false, defaultValue="${default.s_id}") int s_id) {
//        logger.info("START: {}, getAllMatchesBySeason ", CONTROLLER_NAME);
//
//        Match matchRequestResponse = requestResponseFactory.makeMatchRequestResponse(s_id);
//
//        matchRequestResponse.processRequest();
//
//        logger.info("END: {}, getAllMatchesBySeason ", CONTROLLER_NAME);
//
//        return matchRequestResponse.getModelAndViewResponse();
//    }
}
