package sk.pis.spodBEH_server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Run {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long runId;

    private String name;
    private Date date;
    private String location;
    private Double distance;
    private Double elevation;

    public Run() {
    }

    public Run(String name, Date date, String location, Double distance, Double elevation) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.distance = distance;
        this.elevation = elevation;
    }

    public Run(Long runId, String name, Date date, String location, Double distance, Double elevation) {
        this.runId = runId;
        this.name = name;
        this.date = date;
        this.location = location;
        this.distance = distance;
        this.elevation = elevation;
    }

    public Long getRunId() {
        return runId;
    }

    public void setRunId(Long runId) {
        this.runId = runId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getElevation() {
        return elevation;
    }

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }
}
