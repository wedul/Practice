package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
	public static void main(String args[]){
	ArrayList list = new ArrayList();
	Map map;

	map = new HashMap();
	map.put("수학", 90);
	map.put("영어", 80);
	list.add(map);

	map = new HashMap();
	map.put("영어", 55);
	map.put("국어", 65);
	list.add(map);

	System.out.println(list);
	
	HashMap getMap = new HashMap();
	
	getMap = (HashMap)list.get(0);
	System.out.println("1. 수학점수 : " + getMap.get("수학"));
	getMap = (HashMap)list.get(1);
	System.out.println("2. 영어점수 : " + getMap.get("영어"));
}
}
