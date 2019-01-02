package pl.lr.apps.fstats.rest;

import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.services.ImportService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter
public class ImportsRequestResponse extends ViewResponse implements RequestResponse {

    private static final Logger logger = LoggerFactory.getLogger(ImportsRequestResponse.class);

    private static final String CLASS_NAME = " [ImportsRequestResponse] ";

    private ImportService importService;
    private String competition;

    public ImportsRequestResponse(){
        super(Views.imports.name());
    }

    public ImportsRequestResponse(String competition){
        super("redirect:/competitions");
        this.competition = competition;
    }

    @Override
    public void processRequest() {
        logger.info("{} processRequest() started.", CLASS_NAME);
        importService.importMatches(competition);
        logger.info("{} processRequest() finished.", CLASS_NAME);
    }

}
