package application.repositorys;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;

import application.beans.Person;

@Profile("live")
@org.springframework.stereotype.Repository
public class RepositoryLive implements Repository {

	@Override
	public Object getPerson() {
		LocalDate ld = LocalDate.of(1932, Month.DECEMBER, 12);
		Instant instant = ld.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		Person person = new Person();
		person.setName("Wurst");
		person.setVorname("Sebastian");
		person.setAnschrift("Wurststrasse 2");
		person.setOrt("Wursteln");
		person.setOrt("Wursthausen");
		person.setPlz(123345);
		person.setGeburtsdatum(Date.from(instant));
		return person;
	}

}
