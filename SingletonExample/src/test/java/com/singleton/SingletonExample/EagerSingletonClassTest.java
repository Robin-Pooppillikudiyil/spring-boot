package com.singleton.SingletonExample;

/**
 * Unit test for SingletonClass.
 */

import static org.junit.Assert.assertEquals;

public class EagerSingletonClassTest {

	@org.junit.Test
	public void testSingleton() {

		EagerSingletonClass instance1 = EagerSingletonClass.getInstance();
		EagerSingletonClass instance2 = EagerSingletonClass.getInstance();
		System.out.println("checking singleton objects equality");
		assertEquals(true, instance1 == instance2);

	}

}