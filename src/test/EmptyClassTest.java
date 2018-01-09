package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.EmptyClass;

class EmptyClassTest {
		EmptyClass emptyClassObj = new EmptyClass();
		
	@Test
	public void runSyso() {
		String actual = emptyClassObj.syso();
		
		assertEquals("The Strings should be equal", "HelloWorld", actual);
	}
	
	@Test
	public void runSyso_should_return_correct_string() {
		String actual = emptyClassObj.syso();
		
		assertEquals("The Strings should be equal", "HelloWorld", actual);
	}


}
