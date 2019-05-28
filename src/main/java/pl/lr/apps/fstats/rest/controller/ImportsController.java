package pl.lr.apps.fstats.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.lr.apps.fstats.rest.RequestResponseFactoryI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.lr.apps.fstats.rest.models.Imports;

@Controller
@RequestMapping("/imports")
public class ImportsController extends Main {

    private static final Logger logger = LoggerFactory.getLogger(ImportsController.class);

    private static final String CONTROLLER_NAME = "{ ImportsController }";

    @RequestMapping(value = "/csv/{competition}", method = RequestMethod.GET)
    public ModelAndView importMatches(@PathVariable("competition") String competition) {
        logger.info("START: {}, importMatches", CONTROLLER_NAME);
        Imports importsRequestResponse
                = restRequestResponseFactory.makeImportsRequestResponseImportMatches(competition);

        importsRequestResponse.processRequest();

        logger.info("END: {}, importMatches", CONTROLLER_NAME);
        return importsRequestResponse.getModelAndViewResponse();
    }

}
