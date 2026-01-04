package org.akash;

import java.util.Map;

public class MapDIApp {
	Map<Integer, String> map;
	
	
	public MapDIApp() {}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	
	public void show() {
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			int key = m.getKey();
			System.out.println("key : "+key+"  ---->  Value : "+map.get(key));
		}
	}
}
