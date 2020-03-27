package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.SacVide;
import model.Sac;

class SacTest {

	@Test
	public final void initTest() {
		Sac s = new Sac();
		assertTrue(s.jetons.size() == 102);
	}
	
	
	@Test
	public final void randomTest() throws SacVide {
		Sac s = new Sac();
		s.random();
		assertTrue(s.jetons.size() == 101);
	}
	
	

}
