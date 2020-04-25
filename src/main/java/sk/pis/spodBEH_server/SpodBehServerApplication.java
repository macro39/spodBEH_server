package sk.pis.spodBEH_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sk.pis.spodBEH_server.model.Run;
import sk.pis.spodBEH_server.repo.RunRepository;

import java.util.Calendar;
import java.util.GregorianCalendar;

@SpringBootApplication
public class SpodBehServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpodBehServerApplication.class, args);
	}

	@Autowired
	RunRepository runRepository;

	@Override
	public void run(String... args) {
		Run run1 = new Run("Prvomájový beh štastia", new GregorianCalendar(2020, Calendar.MAY, 1).getTime(), "Bratislava", 5000.0, 350.0);
		Run run2 = new Run("Beh mieru", new GregorianCalendar(2020, Calendar.OCTOBER, 12).getTime(), "Košice", 10000.0, 0.0);

		runRepository.save(run1);
		runRepository.save(run2);
	}
}
