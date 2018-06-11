package me.moriya.exercicio8;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GenerateLetterTest {

	
	@Before
	public void setUp() {
	}
	
	@Test
    public void testAGreaterThanB() {
		GenerateLetter generate = GenerateLetter.of(200, 125);
		
        int c = generate.create();
        
        assertEquals(210205, c);
    }

    @Test
    public void testBGreaterThanA() {
    	GenerateLetter generate = GenerateLetter.of(125, 200);
        int c = generate.create();
        assertEquals(122050, c);
    }

    @Test
    public void testAEqualsB() {
    	GenerateLetter generate = GenerateLetter.of(33, 22);
        int c = generate.create();
        
        assertEquals(3232, c);
    }

    @Test
    public void testGreaterThan1000000() {
    	GenerateLetter generate = GenerateLetter.of(10128, 512);
        int c = generate.create();
        assertEquals(-1, c);
    }

}
