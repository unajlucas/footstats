package pl.lr.apps.fstats.services;

import pl.lr.apps.fstats.entities.People;
import pl.lr.apps.fstats.enums.Role;
import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.repositories.PeopleRepository;
import pl.lr.apps.fstats.repositories.PeopleTabRepository;
import pl.lr.apps.fstats.repositories.TeamVRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service("peopleService")
public class PeopleServiceImpl extends ViewAbstract implements PeopleService {

    private static final Logger logger = LoggerFactory.getLogger(PeopleServiceImpl.class);

    @Autowired
    PeopleTabRepository peopleRepository;

    @Autowired
    PeopleRepository peopleViewRepository;

    @Autowired
    private TeamVRepository teamVRepository;
	/*
	@Override
	public ModelAndView getAllPlayers() {
		setView(Views.players.name());
		model.addObject("players", peopleRepository.getAllPeopleByRole(Role.player.name()));
		return model;
	}*/

    @Override
    public ModelAndView getAllPlayers(int page, int size) {
        setView(Views.players.name());
        Page<People> people = null; //= peopleViewRepository.findAll(new PageRequest(page, size));
        model.addObject("players", people);
        return model;
    }

    @Override
    public ModelAndView editPlayer(Integer pId) {
        setView(Views.editplayer.name());
        //People player = peopleViewRepository.findOne(pId);
        model.addObject("teams", teamVRepository.findBySeasonId(1718));
        //model.addObject("player", player);
        return model;
    }

    @Override
    public ModelAndView getAllManagers() {
        setView(Views.managers.name());
        model.addObject("managers", peopleRepository.getAllPeopleByRole(Role.manager.name()));
        return model;
    }

    @Override
    public ModelAndView getAllReferee() {
        setView(Views.referee.name());
        model.addObject("referee", peopleRepository.getAllPeopleByRole(Role.referee.name()));
        return model;
    }
}
