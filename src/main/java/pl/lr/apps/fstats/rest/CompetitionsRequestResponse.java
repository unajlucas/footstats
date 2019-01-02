package pl.lr.apps.fstats.rest;

import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.services.CompetitionService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter
public class CompetitionsRequestResponse extends ViewResponse implements RequestResponse {

    private static final Logger logger = LoggerFactory.getLogger(CompetitionsRequestResponse.class);

    private static final String CLASS_NAME = " [CompetitionsRequestResponse] ";

    private CompetitionService competitionService;

    public CompetitionsRequestResponse(){
        super(Views.competitions.name());
    }

    @Override
    public void processRequest() {
        logger.info("{} processRequest() started.", CLASS_NAME);
        modelAndViewResponse.addObject("competitions", competitionService.getAllCompetitions());
        logger.info("{} processRequest() finished.", CLASS_NAME);
    }

}
