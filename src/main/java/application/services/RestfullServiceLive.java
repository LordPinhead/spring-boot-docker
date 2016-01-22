package application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.repositorys.Repository;

@RestController
@Profile("live")
public class RestfullServiceLive implements RestfullServices {

	@Autowired
	Repository repo = null;

	@Override
	@RequestMapping(value = "/")
	public Object getObject() {
		return repo.getPerson();
	}

}
