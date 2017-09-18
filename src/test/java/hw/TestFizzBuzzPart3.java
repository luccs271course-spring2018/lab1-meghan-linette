package lab1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzzPart3 {

  private FizzBuzzPart3 fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new FizzBuzzPart3();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

  /*@Test
  public void Check0() {
    assertNotNull(fixture);
    String[] fizzBuzzOutput = {"I am sorry, this is not a positive integer."};
    assertEquals(fizzBuzzOutput, fixture.FizzBuzz(-10));
  }

  @Test
  public void Check1() {
    assertNull(fixture);
    String[] fizzBuzzOutput = {"I am sorry, this is not a positive integer."};
    assertEquals(fizzBuzzOutput, fixture.FizzBuzz(-1));
  }

  @Test
  public void Check2() {
    assertNotNull(fixture);
    String[] fizzBuzzOutput = {"1, 2, Fizz, 4, Buzz, 6, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz-Buzz, 16, 17, Fizz, 19, Buzz"};
    assertEquals(fizzBuzzOutput, fixture.FizzBuzz(20));
  }
  */
}
