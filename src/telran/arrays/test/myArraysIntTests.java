package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import telran.arrays.MyArraysInt;

class myArraysIntTests {

	 @Test
	    public void testAddNumber() {
	        int[] array = {1, 2, 3};
	        int[] expected = {1, 2, 3, 4};
	        assertArrayEquals(expected, MyArraysInt.addNumber(array, 4));
	    }
	    
	    @Test
	    public void testRemoveNumber() {
	        int[] array = {1, 2, 3};
	        int[] expected = {1, 3};
	        assertArrayEquals(expected, MyArraysInt.removeNumber(array, 1));
	    }
	    
	    @Test
	    public void testRemoveNumberInvalidIndex() {
	        int[] array = {1, 2, 3};
	        assertArrayEquals(array, MyArraysInt.removeNumber(array, -1));
	        assertArrayEquals(array, MyArraysInt.removeNumber(array, 3));
	    }
	    
	    @Test
	    public void testInsertNumber() {
	        int[] array = {1, 2, 3};
	        int[] expected = {1, 2, 4, 3};
	        assertArrayEquals(expected, MyArraysInt.insertNumber(array, 2, 4));
	    }
	    
	    @Test
	    public void testInsertNumberInvalidIndex() {
	        int[] array = {1, 2, 3};
	        assertArrayEquals(array, MyArraysInt.insertNumber(array, -1, 4));
	        assertArrayEquals(array, MyArraysInt.insertNumber(array, 4, 4));
	    }
	@Test
	void testCopyOf() {
		int array[] = {1, 2, 3};
		int expected1[] = {1, 2, 3};
		int expected2[] = {1};
		int expected3[] = {1, 2, 3, 0, 0, 0};
		assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
		assertArrayEquals(expected2, Arrays.copyOf(array, 1));
		assertArrayEquals(expected3, Arrays.copyOf(array, 6));
	}
	@Test
	void testArraycopy() {
		int array[] = {1, 2, 3};
		int expected[] = {5, 10, 1, 2, 20};
		int arrayDest[] = new int[5];
		int array1[] = {1, 5, 10};
		System.arraycopy(array, 0, arrayDest, 2, 2);
		System.arraycopy(array1, 1, arrayDest, 0, 2);
		arrayDest[4] = 20;
		assertArrayEquals(expected, arrayDest);
		
	}
	 @Test
	    public void testBinarySearch() {
	        int[] array = {1, 2, 3, 4, 5};
	        assertEquals(2, Arrays.binarySearch(array, 3));
	        assertEquals(-1, Arrays.binarySearch(array, 0));
	    }
	

}
