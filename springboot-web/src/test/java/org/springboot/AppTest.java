package org.springboot;

import com.google.gson.Gson;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.protobuf.Person;

/**
 * Unit test for simple App.
 */
public class AppTest
		extends TestCase {

	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}

    @org.junit.jupiter.api.Test
    public void test01() {

        Person person = Person.newBuilder()
                .setId(1)
                .setName("hqqich")
                .setEmail("hqqich1314@outlook.com")
                .addPhones(
                        Person.PhoneNumber.newBuilder()
                                .setNumber("010-1234567")
                                .setType(Person.PhoneType.HOME))
                .build();

        System.out.println(new Gson().toJson(person));

    }

}
