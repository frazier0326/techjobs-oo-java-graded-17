package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public String toString() {
        String stringName = getName();
        String stringEmployer = getEmployer().getValue();
        String stringLocation = getLocation().getValue();
        String stringPositionType = getPositionType().getValue();
        String stringCoreCompetency = getCoreCompetency().getValue();

        if (stringName.isEmpty()) {
            stringName = "Data not available";
        }
        if (stringEmployer.isEmpty()) {
            stringEmployer = "Data not available";
        }
        if (stringLocation.isEmpty()) {
            stringLocation = "Data not available";
        }
        if (stringPositionType.isEmpty()) {
            stringPositionType = "Data not available";
        }
        if (stringCoreCompetency.isEmpty()) {
            stringCoreCompetency = "Data not available";
        }
        return lineSeparator() +
                "ID: " + getId() + lineSeparator() +
                "Name: " + stringName + lineSeparator() +
                "Employer: " + stringEmployer + lineSeparator() +
                "Location: " + stringLocation + lineSeparator() +
                "Position Type: " + stringPositionType + lineSeparator() +
                "Core Competency: " + stringCoreCompetency +
                lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


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

    public int getId() {
        return id;
    }

}
