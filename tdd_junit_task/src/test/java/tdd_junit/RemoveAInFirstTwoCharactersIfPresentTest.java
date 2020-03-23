package tdd_junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveAInFirstTwoCharactersIfPresentTest {

	/* TODO list for my feature
	 * 1. empty string "" => "" 
	 * 2. 1 char A => "" 
	 * 3. 4 chars AABB => BB
	 * 4. n chars ABCDEFG => BCDEFG
 	 */
	RemoveAInFirstTwoCharactersIfPresent removeAInFirstTwoCharactersIfPresent;
	@Before
	public void setUp() throws Exception {
		removeAInFirstTwoCharactersIfPresent =new RemoveAInFirstTwoCharactersIfPresent();
	}

	@Test
	public void test() {
		assertEquals("BCD" ,removeAInFirstTwoCharactersIfPresent.remove("ABCD"));
	}
	@Test
	public void test1() {
		assertEquals("CD" ,removeAInFirstTwoCharactersIfPresent.remove("AACD"));
	}
	@Test
	public void test2() {
		assertEquals("BCD" ,removeAInFirstTwoCharactersIfPresent.remove("BACD"));
	}
	@Test
	public void test3() {
		assertEquals("BBAA" ,removeAInFirstTwoCharactersIfPresent.remove("BBAA"));
	}
	@Test
	public void test4() {
		assertEquals("BAA" ,removeAInFirstTwoCharactersIfPresent.remove("AABAA"));
	}
	@Test
	public void test5() {
		assertEquals("" ,removeAInFirstTwoCharactersIfPresent.remove("A"));
	}
	@Test
	public void test6() {
		assertEquals("B" ,removeAInFirstTwoCharactersIfPresent.remove("B"));
	}
	@Test
	public void test7() {
		assertEquals("" ,removeAInFirstTwoCharactersIfPresent.remove(""));
	}
}
