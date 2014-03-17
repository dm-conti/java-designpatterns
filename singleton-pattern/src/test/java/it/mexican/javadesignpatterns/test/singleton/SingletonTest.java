package it.mexican.javadesignpatterns.test.singleton;

import static org.junit.Assert.*;
import it.mexican.javadesignpatterns.singleton.Singleton;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void test() {
		Singleton expectedInstance = Singleton.getInstance();
		assertEquals(expectedInstance, Singleton.getInstance());		
	}
}