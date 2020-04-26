package sk.pis.spodBEH_server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RunRunner {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long runId;

    private Long runnerId;

    public RunRunner() {
    }

    public RunRunner(Long runId, Long runnerId) {
        this.runId = runId;
        this.runnerId = runnerId;
    }

    public RunRunner(Long id, Long runId, Long runnerId) {
        this.id = id;
        this.runId = runId;
        this.runnerId = runnerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRunId() {
        return runId;
    }

    public void setRunId(Long runId) {
        this.runId = runId;
    }

    public Long getRunnerId() {
        return runnerId;
    }

    public void setRunnerId(Long runnerId) {
        this.runnerId = runnerId;
    }
}
