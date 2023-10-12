package OOPsConcepts;

import java.util.ArrayList;
import java.util.HashMap;

public class ConvertHashMapIntoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Ashok", 1000);
		compMap.put("Ninad", 5000);
		compMap.put("Ashwin", 6000);
		
		System.out.println("HashMap Values are"+compMap);
		
		ArrayList<String> list = new ArrayList<String>(compMap.keySet());
		System.out.println("Arraylist is -:"+list);
	}

}
