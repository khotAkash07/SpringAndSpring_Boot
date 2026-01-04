package org.akash;

import java.util.List;

public class ListExmple {
	List<Integer> list;

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public void showList() {
		for (Integer i : list) {
			System.out.println(i);
		}
	}
}
