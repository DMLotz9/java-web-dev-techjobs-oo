package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency){
        this();

        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;

    }

    public String toString() {

        String aName = this.name;
        String aEmployer = this.employer.toString();
        String aLocation = this.location.toString();
        String aPositionType = this.positionType.toString();
        String aCoreCompetency = this.coreCompetency.toString();



        if (aName.equals("") & aEmployer.equals("") & aLocation.equals("") & aPositionType.equals("") & aCoreCompetency.equals("")){
            return "OOPS! This job does not seem to exist.";
        }else
            if (aName.equals("")) aName = "Data not available";
            if (aEmployer.equals("")) aEmployer = "Data not available";
            if (aLocation.equals("")) aLocation = "Data not available";
            if (aPositionType.equals("")) aPositionType = "Data not available";
            if (aCoreCompetency.equals("")) aCoreCompetency = "Data not available";

            return "\nID: " + this.id + "\nName: " + aName + "\nEmployer: " + aEmployer + "\nLocation: " + aLocation + "\nPosition Type: " + aPositionType + "\nCore Competency: " + aCoreCompetency + "\n";
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
