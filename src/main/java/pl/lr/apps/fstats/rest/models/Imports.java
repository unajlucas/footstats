package pl.lr.apps.fstats.rest.models;

import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.rest.RequestI;
import pl.lr.apps.fstats.services.ImportService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter
public class Imports {

    private static final Logger logger = LoggerFactory.getLogger(Imports.class);

    private static final String CLASS_NAME = " [Imports] ";
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
