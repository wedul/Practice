package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
	public static void main(String args[]){
	ArrayList list = new ArrayList();
	Map map;

	map = new HashMap();
	map.put("����", 90);
	map.put("����", 80);
	list.add(map);

	map = new HashMap();
	map.put("����", 55);
	map.put("����", 65);
	list.add(map);

	System.out.println(list);
	
	HashMap getMap = new HashMap();
	
	getMap = (HashMap)list.get(0);
	System.out.println("1��° ���� ���� : " + getMap.get("����"));
	getMap = (HashMap)list.get(1);
	System.out.println("2��° �������� : " + getMap.get("����"));
}
}