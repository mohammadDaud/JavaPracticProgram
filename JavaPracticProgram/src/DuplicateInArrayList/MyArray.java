package DuplicateInArrayList;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MyArray {

	public static void main(String[] args) {
		MyArray array=new MyArray();
		array.start();
	}
	
	public void start() {
	    List<Integer> list = Arrays.asList(1, 1, 5, 3, 7, 3, 11, 2, 3, 1);
	    Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
	    for (Integer i : list) {
	        Integer retrievedValue = map.get(i);
	        if (null == retrievedValue) {
	            map.put(i, 1);
	        }
	        else {
	            map.put(i, retrievedValue + 1);
	        }
	    }

	    System.out.println("list: " + list);
	    printCount(map);
	}
	private void printCount(Map<Integer, Integer> map)
	{
	    for (Integer key : map.keySet())
	    {
	        System.out.println("number: " + key + ", count: " + map.get(key));
	    }
	}
}
