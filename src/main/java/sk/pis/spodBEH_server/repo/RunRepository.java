package sk.pis.spodBEH_server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.pis.spodBEH_server.model.Run;

public interface RunRepository extends JpaRepository<Run, Long> {
}
