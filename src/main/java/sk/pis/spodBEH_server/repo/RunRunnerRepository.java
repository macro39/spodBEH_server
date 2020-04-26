package sk.pis.spodBEH_server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.pis.spodBEH_server.model.RunRunner;

import java.util.List;

public interface RunRunnerRepository extends JpaRepository<RunRunner, Long> {
    List<RunRunner> getAllByRunnerId(Long runnerID);

    List<RunRunner> getAllByRunId(Long runId);

    void deleteRunRunnerByRunIdAndRunnerId(Long runId, Long runnerId);
}
