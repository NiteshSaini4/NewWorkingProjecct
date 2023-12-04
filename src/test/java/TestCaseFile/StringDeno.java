package TestCaseFile;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Vector;

public class StringDeno {
	

	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		 a.add(56);
		 a.add(4);
		 a.add(8);
		 a.add(45);
		 ListIterator it = a.listIterator();
		 System.out.println("forword direction");
		 while(it.hasNext())
		{
		 Object i = it.next();
		 System.out.println(i);
		 
		}
		 System.out.println("Backword direction");
		 while(it.hasPrevious())
		 {
			 Object o=it.previous();
			 System.out.println(o);
		 }
		 
	}
}
