package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1,job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", job.getName());
        assertTrue(job.getName() instanceof String);

        assertEquals("ACME", job.getEmployer().getValue());
        assertTrue(job.getEmployer() instanceof Employer);

        assertEquals("Desert",job.getLocation().getValue());
        assertTrue(job.getLocation() instanceof Location);

        assertEquals("Quality control", job.getPositionType().getValue());
        assertTrue(job.getPositionType() instanceof PositionType);

        assertEquals("Persistence", job.getCoreCompetency().getValue());
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {
    Job job1 = new Job("Junior Game Designer", new Employer("Red Barrels"), new Location("Montreal"), new PositionType("Designer"), new CoreCompetency("Creativity"));
    Job job2 = new Job("Junior Game Designer", new Employer("Red Barrels"), new Location("Montreal"), new PositionType("Designer"), new CoreCompetency("Creativity"));
    assertNotEquals(job1, job2);

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
//     Job job = new Job();
//     String expected = lineSeparator() + "id=1, name='null', employer=null, location=null, positionType=null, coreCompetency=null" + lineSeparator();
//     String outcome = job.toString();
//     assertEquals(expected, outcome);
        Job job = new Job("Junior Game Designer", new Employer("Red Barrels"), new Location("Montreal"), new PositionType("Designer"), new CoreCompetency("Creativity"));
        assertEquals(job.toString().startsWith(lineSeparator()), true);
        assertEquals(job.toString().endsWith(lineSeparator()), true);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
    Job job = new Job("Junior Game Designer", new Employer("Red Barrels"), new Location("Montreal"), new PositionType("Designer"), new CoreCompetency("Creativity"));
    assertEquals(job.toString(), lineSeparator() +
            "ID: " + job.getId() + lineSeparator() +
            "Name: " + job.getName() + lineSeparator() +
            "Employer: " + job.getEmployer() + lineSeparator() +
            "Location: " + job.getLocation() + lineSeparator() +
            "Position Type: " + job.getPositionType() + lineSeparator() +
            "Core Competency: " + job.getCoreCompetency() + lineSeparator());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("Junior Game Designer", new Employer(""), new Location("Montreal"), new PositionType("Designer"), new CoreCompetency(""));
        assertEquals(job.toString(), lineSeparator() +
                "ID: " + job.getId() + lineSeparator() +
                "Name: " + job.getName() + lineSeparator() +
                "Employer: Data not available" + lineSeparator() +
                "Location: " + job.getLocation() + lineSeparator() +
                "Position Type: " + job.getPositionType() + lineSeparator() +
                "Core Competency: Data not available" + lineSeparator());
    }
}
