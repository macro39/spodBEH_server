package sk.pis.spodBEH_server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.pis.spodBEH_server.model.Runner;

public interface RunnerRepository extends JpaRepository<Runner, Long> {
    Runner findByUsernameAndPassword(String username, String password);
}
