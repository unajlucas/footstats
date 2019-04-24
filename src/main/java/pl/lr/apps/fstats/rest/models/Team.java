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
public class Team extends BasicComponents implements RequestI {

    private static final Logger logger = LoggerFactory.getLogger(Team.class);

    private static final String CLASS_NAME = " [Team] ";

    private TeamService teamService;
    private String teamName;

    public Team(TeamService teamService, String team, int s_id){
        super(Views.team.name(), s_id);
        this.teamService = teamService;
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
