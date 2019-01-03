package pl.lr.apps.fstats.rest;

import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.services.TeamService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter
public class TeamRequestResponse extends ViewResponse implements RequestResponse {

    private static final Logger logger = LoggerFactory.getLogger(TeamRequestResponse.class);

    private static final String CLASS_NAME = " [TeamRequestResponse] ";

    private TeamService teamService;
    private String teamName;

    public TeamRequestResponse(String team, int s_id){
        super(Views.team.name());
        setSid(s_id);
        this.teamName = team;
        logger.info("{} initialized", CLASS_NAME);
    }

    @Override
    public void processRequest() {
        logger.info("{} processRequest() started.", CLASS_NAME);
        modelAndViewResponse.addObject("team", teamService.getTeam(teamName, sid));
        logger.info("{} processRequest() finished.", CLASS_NAME);
    }
}
