package pl.lr.apps.fstats.rest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pl.lr.apps.fstats.rest.models.Competition;
import pl.lr.apps.fstats.rest.models.Competitions;
import org.springframework.stereotype.Service;
import pl.lr.apps.fstats.rest.models.Imports;
import pl.lr.apps.fstats.rest.models.Team;
import pl.lr.apps.fstats.rest.models.Teams;
import pl.lr.apps.fstats.services.CompetitionService;
import pl.lr.apps.fstats.services.ImportService;
import pl.lr.apps.fstats.services.MatchService;
import pl.lr.apps.fstats.services.TeamService;

@Service
public class RequestResponseFactoryImpl implements RequestResponseFactoryI {

    @Autowired
    private BeanFactory beanFactory;

    private static final String competitionServiceName = "competitionService";
    private static final String matchServiceName = "matchService";
    private static final String teamServiceName = "teamService";
    private static final String importServiceName = "importService";

    @Override
    public Competitions makeCompetitionsRequestResponse(Integer season) {
        return new Competitions((CompetitionService)beanFactory.getBean(competitionServiceName), season);
    }

    @Override
    public Competition makeCompetitionRequestResponse(String competition, Integer sid) {
        return new Competition(
                (CompetitionService)beanFactory.getBean(competitionServiceName),
                (MatchService)beanFactory.getBean(matchServiceName), competition, sid);
    }

    @Override
    public Teams makeTeamsRequestResponse(Integer season) {
        return new Teams((TeamService)beanFactory.getBean(teamServiceName), season);
    }

    @Override
    public Team makeTeamRequestResponse(String team, int s_id) {
        return new Team((TeamService)beanFactory.getBean(teamServiceName), team, s_id);
    }

    @Override
    public Imports makeImportsRequestResponseImportMatches(String competition) {
        return new Imports((ImportService)beanFactory.getBean(importServiceName), competition);
    }
}
