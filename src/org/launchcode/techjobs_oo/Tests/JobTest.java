package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job1;
    Job test_job2;

    @Before
    public void createJobObject1(){
        test_job1 = new Job("Developer", new Employer("Capacity"), new Location("St. Louis"), new PositionType("Backend Developer"),  new CoreCompetency("Python"));
    }

    @Before
    public void createJobObject2(){
        test_job2 = new Job("Developer", new Employer("Capacity"), new Location("St. Louis"), new PositionType("Frontend Developer"),  new CoreCompetency("Python"));
    }

    @Test
    public void testSettingJobId(){
        assertNotEquals(test_job1, test_job2);
        assertEquals(1, test_job1.getId() - test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", productTester.getName());
        assertEquals("ACME", productTester.getEmployer().getValue());
        assertEquals("Desert", productTester.getLocation().getValue());
        assertEquals("Quality control", productTester.getPositionType().getValue());
        assertEquals("Persistence", productTester.getCoreCompetency().getValue());

        assertNotNull(productTester.getEmployer());
        assertNotNull(productTester.getLocation());
        assertNotNull(productTester.getPositionType());
        assertNotNull(productTester.getCoreCompetency());

    }
}
