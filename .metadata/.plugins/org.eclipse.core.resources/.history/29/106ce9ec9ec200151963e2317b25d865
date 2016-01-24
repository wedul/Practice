package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
	public static void main(String args[]){
	ArrayList list = new ArrayList();
	Map map;

	map = new HashMap();
	map.put("국어", 90);
	map.put("수학", 80);
	list.add(map);

	map = new HashMap();
	map.put("국어", 55);
	map.put("수학", 65);
	list.add(map);

	System.out.println(list);
	
	HashMap getMap = new HashMap();
	
	getMap = (HashMap)list.get(0);
	System.out.println("1번째 국어 점수 : " + getMap.get("국어"));
	getMap = (HashMap)list.get(1);
	System.out.println("2번째 수학점수 : " + getMap.get("수학"));
}
}
