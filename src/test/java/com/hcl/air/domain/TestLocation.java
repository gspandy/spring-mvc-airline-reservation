package com.hcl.air.domain;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLocation {
  private Location location;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
	location = new Location();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testAccessorOfName() {
	location.setName("FooBar");
    assertEquals("FooBar", location.getName());
  }

  @Test
  public void testAccessorOfCity() {
    location.setCity("Dallas");
	assertEquals("Dallas", location.getCity());
  }
  
}
