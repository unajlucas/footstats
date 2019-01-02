package pl.lr.apps.fstats.rest.controller;

import pl.lr.apps.fstats.rest.ImportsRequestResponse;
import pl.lr.apps.fstats.rest.RequestResponseFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/imports")
public class ImportsController {

    private static final Logger logger = LoggerFactory.getLogger(ImportsController.class);

    private static final String CONTROLLER_NAME = "{ ImportsController }";

    @Autowired
    private RequestResponseFactory requestResponseFactory;

    @RequestMapping(value = "/view")
    public ModelAndView getImportsView(){
        logger.info("START: {}, getImportsView", CONTROLLER_NAME);

        ImportsRequestResponse importsRequestResponse = requestResponseFactory.makeImportsRequestResponseGetView();

        logger.info("END: {}, getImportsView", CONTROLLER_NAME);

        return importsRequestResponse.getModelAndViewResponse();
    }

    @RequestMapping(value = "/csv/{competition}", method = RequestMethod.GET)
    public ModelAndView importMatches(@PathVariable("competition") String competition) {
        logger.info("START: {}, importMatches", CONTROLLER_NAME);
        ImportsRequestResponse importsRequestResponse
                = requestResponseFactory.makeImportsRequestResponseImportMatches(competition);

        importsRequestResponse.processRequest();

        logger.info("END: {}, importMatches", CONTROLLER_NAME);
        return importsRequestResponse.getModelAndViewResponse();
    }

}
