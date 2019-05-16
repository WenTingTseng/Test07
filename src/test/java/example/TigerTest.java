package test.java.example;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.example.Tiger;

public class TigerTest {


	  @Test
	  public void testEat() {
	    new Tiger().eat();
	  }

	  @Test
	  public void testSound() {
	    new Tiger().sound();
	  }

}
