package pl.lr.apps.fstats.rest.models;

import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.rest.RequestI;
import pl.lr.apps.fstats.services.MatchService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter
public class Match {

    private static final Logger logger = LoggerFactory.getLogger(Match.class);

    private static final String CLASS_NAME = " [Match] ";
//
//    private MatchService matchService;
//
//    public Match(){
//        super(Views.match.name());
//        logger.info("{} initialized", CLASS_NAME);
//    }
//
//    @Override
//    public void processRequest() {
//        logger.info("{} processRequest() started.", CLASS_NAME);
//        modelAndViewResponse.addObject("matches", matchService.getAllMatchesBySeasonId(sid));
//        logger.info("{} processRequest() finished.", CLASS_NAME);
//    }
}
