package hw4;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class StringListTest {

	@Test
	public void testAdd1() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		assertEquals("toString result incorrect after add called twice", "a\nb\n", list.toString());
	}

	@Test
	public void testAdd2() {
		StringList list = new StringList(2);
		list.add("a");
		list.add("b");
		list.add("c");
		assertEquals("toString result incorrect after add called three times - resize required", "a\nb\nc\n", list.toString());
	}

	@Test
	public void testAddAtPos1() {
		StringList list = new StringList();
		list.add("a", 0);
		list.add("b", 1);
		assertEquals("toString result incorrect after add(item, pos) called twice", "a\nb\n", list.toString());
	}

	@Test
	public void testAddAtPos2() {
		StringList list = new StringList();
		list.add("b");
		list.add("a", 0);
		assertEquals("toString result incorrect after add(item, 0)", "a\nb\n", list.toString());
	}

	@Test
	public void testAddAtPos3() {
		StringList list = new StringList();
		list.add("a");
		list.add("b", 1);
		assertEquals("toString result incorrect after add(item, 1)", "a\nb\n", list.toString());
	}

	@Test
	public void testAddAtPos4() {
		StringList list = new StringList(2);
		list.add("a");
		list.add("b", 1);
		list.add("c", 2);
		assertEquals("toString result incorrect after add(item, 2)", "a\nb\nc\n", list.toString());
	}

	@Test
	public void testRemovePos1() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.remove(0);
		assertEquals("toString result incorrect after remove(0)", "b\nc\n", list.toString());
	}

	@Test
	public void testRemovePos2() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.remove(1);
		assertEquals("toString result incorrect after remove(1)", "a\nc\n", list.toString());
	}

	@Test
	public void testRemovePos3() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.remove(2);
		assertEquals("toString result incorrect after remove(2)", "a\nb\n", list.toString());
	}

	@Test
	public void testRemovePos4() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");		
		assertEquals("remove result incorrect after remove(3)", null, list.remove(3));
	}
	
	@Test
	public void testIndexOf1() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");		
		assertEquals("indexOf result incorrect", 0, list.indexOf("a"));
	}
	
	@Test
	public void testIndexOf2() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("b");		
		assertEquals("indexOf result incorrect", 1, list.indexOf("b"));
	}

	@Test
	public void testIndexOf3() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");		
		assertEquals("indexOf result incorrect", 2, list.indexOf("c"));
	}

	@Test
	public void testIndexOf4() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");		
		assertEquals("indexOf result incorrect", -1, list.indexOf("d"));
	}
	
	@Test
	public void testRemoveItem1() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");		
		assertEquals("remove result incorrect", true, list.remove("a"));
	}

	@Test
	public void testRemoveItem2() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");		
		list.remove("a");
		assertEquals("toString result incorrect after remove", "b\nc\n", list.toString());
	}

	@Test
	public void testRemoveItem3() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");		
		assertEquals("remove result incorrect", true, list.remove("c"));
	}

	@Test
	public void testRemoveItem4() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");		
		list.remove("c");
		assertEquals("toString result incorrect after remove", "a\nb\n", list.toString());
	}

	@Test
	public void testRemoveItem5() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("remove result incorrect", false, list.remove("d"));
	}

	@Test
	public void testContains1() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("contains result incorrect", false, list.contains("d"));
	}

	@Test
	public void testContains2() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("contains result incorrect", true, list.contains("a"));
	}

	@Test
	public void testContains3() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("contains result incorrect", true, list.contains("b"));
	}

	@Test
	public void testContains4() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("contains result incorrect", true, list.contains("c"));
	}
	
	@Test
	public void testSize1() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("size result incorrect", 3, list.size());
	}
	
	@Test
	public void testSize2() {
		StringList list = new StringList();
		assertEquals("size result incorrect", 0, list.size());
	}

	@Test
	public void testIsEmpty1() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("isEmpty result incorrect", false, list.isEmpty());
	}
	
	@Test
	public void testIsEmpty2() {
		StringList list = new StringList();
		assertEquals("isEmpty result incorrect", true, list.isEmpty());
	}
	
	@Test
	public void testGet1() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("get result incorrect", "a", list.get(0));
	}


	@Test
	public void testGet2() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("get result incorrect", "b", list.get(1));
	}

	@Test
	public void testGet3() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("get result incorrect", "c", list.get(2));
	}
	@Test
	public void testGet4() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("get result incorrect", null, list.get(4));
	}

	@Test
	public void testGet5() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("get result incorrect", null, list.get(-1));
	}


	@Test
	public void testSmallest1() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("smallest result incorrect", "a", list.smallest());
	}

	@Test
	public void testSmallest2() {
		StringList list = new StringList();
		list.add("b");
		list.add("a");
		list.add("c");				
		assertEquals("smallest result incorrect", "a", list.smallest());
	}

	@Test
	public void testSmallest3() {
		StringList list = new StringList();
		list.add("b");
		list.add("c");				
		list.add("a");
		assertEquals("smallest result incorrect", "a", list.smallest());
	}
	
	@Test
	public void testSmallest4() {
		StringList list = new StringList();
		assertEquals("smallest result incorrect", null, list.smallest());
	}

	@Test
	public void testLargest1() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");				
		assertEquals("largest result incorrect", "c", list.largest());
	}

	@Test
	public void testLargest2() {
		StringList list = new StringList();
		list.add("b");
		list.add("a");
		list.add("c");				
		assertEquals("largest result incorrect", "c", list.largest());
	}

	@Test
	public void testLargest3() {
		StringList list = new StringList();
		list.add("b");
		list.add("c");				
		list.add("a");
		assertEquals("largest result incorrect", "c", list.largest());
	}
	
	@Test
	public void testLargest4() {
		StringList list = new StringList();
		assertEquals("largest result incorrect", null, list.largest());
	}

	
	@Test
	public void testLastIndexOf1() {
		StringList list = new StringList();
		list.add("a");
		list.add("a");
		list.add("c");		
		assertEquals("lastIndexOf result incorrect", 1, list.lastIndexOf("a"));
	}
	
	@Test
	public void testLastIndexOf2() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");		
		assertEquals("lastIndexOf result incorrect", 1, list.lastIndexOf("b"));
	}

	@Test
	public void testLastIndexOf3() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("b");		
		assertEquals("lastIndexOf result incorrect", 2, list.lastIndexOf("b"));
	}

	@Test
	public void testLastIndexOf4() {
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");		
		assertEquals("lastIndexOf result incorrect", -1, list.lastIndexOf("d"));
	}


	@Test
	public void testDuplicates1() {
		String[] expected = {};
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");		
		assertTrue("duplicates result incorrect", Arrays.equals(expected, list.duplicates()));
	}


	@Test
	public void testDuplicates2() {
		String[] expected = {"a", "b"};
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("a");		
		assertTrue("duplicates result incorrect", Arrays.equals(expected, list.duplicates()));
	}

	@Test
	public void testDuplicates3() {
		String[] expected = {"a", "b"};
		StringList list = new StringList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("a");		
		list.add("a");		
		assertTrue("duplicates result incorrect", Arrays.equals(expected, list.duplicates()));
	}
	
}

