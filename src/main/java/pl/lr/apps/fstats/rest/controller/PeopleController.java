package pl.lr.apps.fstats.rest.controller;

import pl.lr.apps.fstats.services.PeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PeopleController {
    private static final Logger logger = LoggerFactory.getLogger(PeopleController.class);

    @Autowired
    PeopleService peopleService;

    int page = 0;
    int size = 20;
    //@RequestMapping("/players")
    //public Page<>

    @RequestMapping("/players")
    public ModelAndView getAllPlayers() {
        logger.info("start method: getAllPlayers() in PeopleController class");
        page = 0;
        return peopleService.getAllPlayers(page, size);
    }

    @RequestMapping("/players/prev")
    public ModelAndView getPrevPlayers() {
        logger.info("start method: getPrevPlayers() in PeopleController class");
        if (page != 0) {
            page -= 1;
        }
        return peopleService.getAllPlayers(page, size);
    }

    @RequestMapping("/players/next")
    public ModelAndView getNextPlayers() {
        logger.info("start method: getNextPlayers() in PeopleController class");
        page += 1;
        return peopleService.getAllPlayers(page, size);
    }

    @RequestMapping("/players/edit--{pId}")
    public ModelAndView editPlayer(@PathVariable("pId") Integer pId) {
        logger.info("start method: editPlayer() in PeopleController class");
        return peopleService.editPlayer(pId);
    }

    //@RequestMapping("/")
    public ModelAndView updatePlayer() {
        return null;
    }

    @RequestMapping("/managers")
    public ModelAndView getAllManagers() {
        logger.info("start method: getAllManagers() in PeopleController class");
        return peopleService.getAllManagers();
    }

    @RequestMapping("/referee")
    public ModelAndView getAllReferee() {
        logger.info("start method: getAllReferee() in PeopleController class");
        return peopleService.getAllReferee();
    }
}
