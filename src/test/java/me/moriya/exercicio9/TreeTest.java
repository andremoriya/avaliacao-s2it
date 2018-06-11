package me.moriya.exercicio9;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeTest {

	@Test
	public void test() {
		Tree tree = new Tree();
		
		tree.add(5);
		tree.add(13);
        tree.add(18);
        tree.add(55);
        tree.add(32);
        
        assertEquals(123, tree.sum());
	}

}
