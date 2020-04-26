package sk.pis.spodBEH_server.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Runner {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long runnerId;

    private String firstName;
    private String lastName;
    private String email;
    private String telephoneNumber;
    private String sex;
    private Date dateOfBirth;
    private String username;
    private String password;

    @Transient
    private ArrayList<Run> runs;

    public Runner() {
    }

    public Runner(String firstName, String lastName, String email, String telephoneNumber, String sex, Date dateOfBirth, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.password = password;
    }

    public Long getRunnerId() {
        return runnerId;
    }

    public void setRunnerId(Long id) {
        this.runnerId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Run> getRuns() {
        return runs;
    }

    public void setRuns(ArrayList<Run> runs) {
        this.runs = runs;
    }
}
