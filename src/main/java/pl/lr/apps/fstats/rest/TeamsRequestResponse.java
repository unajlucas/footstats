package pl.lr.apps.fstats.rest;

import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.services.TeamService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter
public class TeamsRequestResponse extends RequestResponseComponents implements Request {

    private static final Logger logger = LoggerFactory.getLogger(TeamsRequestResponse.class);

    private static final String CLASS_NAME = " [TeamsRequestResponse] ";

    private TeamService teamService;

    public TeamsRequestResponse(int s_id){
        super(Views.teams.name());
        setSid(s_id);
        logger.info("{} initialized", CLASS_NAME);
    }

    @Override
    public void processRequest() {
        logger.info("{} processRequest() started.", CLASS_NAME);
        modelAndViewResponse.addObject("teamList", teamService.getAllTeamsBySeason(sid));
        modelAndViewResponse.addObject("season", sid);
        modelAndViewResponse.addObject("teams", "teams");
        logger.info("{} processRequest() finished.", CLASS_NAME);
    }
}
