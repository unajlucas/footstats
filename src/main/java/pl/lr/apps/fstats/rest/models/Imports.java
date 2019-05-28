package pl.lr.apps.fstats.rest.models;

import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.rest.RequestI;
import pl.lr.apps.fstats.rest.ResponseI;
import pl.lr.apps.fstats.services.ImportService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter
public class Imports extends BasicComponents implements RequestI, ResponseI {

    private static final Logger logger = LoggerFactory.getLogger(Imports.class);

    private static final String CLASS_NAME = " [Imports] ";

    private ImportService importService;
    private String competition;

    public Imports(ImportService importService, String competition){
        this.importService = importService;
        this.competition = competition;
    }

    @Override
    public void processRequest() {
        logger.info("{} processRequest() started.", CLASS_NAME);
        importService.importMatches(competition);
        logger.info("{} processRequest() finished.", CLASS_NAME);
    }

    @Override
    public void processResponse() {
        logger.info("{} processResponse() started.", CLASS_NAME);


        logger.info("{} processResponse() finished.", CLASS_NAME);
    }
    //
//    private ImportService importService;
//    private String competition;
//
//    public Imports(){
//        super(Views.imports.name());
//    }
//
//    public Imports(String competition){
//        super("redirect:/competitions");
//        this.competition = competition;
//    }
//
//    @Override
//    public void processRequest() {
//        logger.info("{} processRequest() started.", CLASS_NAME);
//        importService.importMatches(competition);
//        logger.info("{} processRequest() finished.", CLASS_NAME);
//    }

}
