package org.launchcode.techjobs_oo.tests;

import org.junit.*;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class JobTests {

     @Test
     public void testSettingJobId() {

        Job testJob = new Job();
        int testJobIdOne = testJob.getId();

        Job testJobTwo = new Job();
        int testJobIdTwo = testJobTwo.getId();

        assertEquals(testJobIdOne, testJobIdTwo, 1);


    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job fullConstructorJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", fullConstructorJob.getName());

        assertEquals("ACME" , fullConstructorJob.getEmployer().toString());

        assertEquals("Desert", fullConstructorJob.getLocation().toString());

        assertEquals("Quality control", fullConstructorJob.getPositionType().toString());

        assertEquals("Persistence", fullConstructorJob.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality(){
         Job testJobThree = new Job("Web Dev", new Employer("Microsoft"), new Location("St. Louis"), new PositionType("Developer"), new CoreCompetency("Java"));

         Job testJobFour = new Job("Web Dev", new Employer("Microsoft"), new Location("St. Louis"), new PositionType("Developer"), new CoreCompetency("Java"));

        assertFalse(testJobThree == testJobFour);


    }

    @Test
    public void testToStringDisplayingBlankLines(){
        Job testJobFive = new Job("Web Dev", new Employer("Microsoft"), new Location("St. Louis"), new PositionType("Developer"), new CoreCompetency("Java"));

        assertEquals(testJobFive.toString().startsWith("\n"),true );

        assertEquals(testJobFive.toString().endsWith("\n"),true );
    }

    @Test
    public void testToStringReturnForCorrectData(){
         // Data should contain label for each field followed by field data. Each field on it's own line.

        Job testJobFive = new Job("Web Dev", new Employer("Microsoft"), new Location("St. Louis"), new PositionType("Developer"), new CoreCompetency("Java"));

        assertEquals(testJobFive.toString().startsWith("\n"),true );

        assertEquals(testJobFive.toString().endsWith("\n"),true );
    }
}
