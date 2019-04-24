package pl.lr.apps.fstats.rest.models;

import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.rest.RequestI;
import pl.lr.apps.fstats.services.TeamService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter
public class Teams extends BasicComponents implements RequestI {

    private static final Logger logger = LoggerFactory.getLogger(Teams.class);

    private static final String CLASS_NAME = " [Teams] ";

    private TeamService teamService;

    public Teams(TeamService teamService, int s_id){
        super(Views.teams.name(), s_id);
        this.teamService = teamService;
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
