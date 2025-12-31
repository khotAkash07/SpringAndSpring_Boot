package org.akash;

public class Student_01 {
	private long id;
	private String name;
	private int marks;
	private int m;
	private Player p;
	
	public void setP(Player p) {
		this.p = p;
	}
	public Student_01() {}
	public Student_01(long id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student_01(long id, String name, int marks, int m) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.m = m;
	}

	public void show() {
		// System.out.println(id + "\t" + name + "\t" + marks);
		System.out.println("\n");
		System.out.println(id + "\t" + name + "\t" + marks + "\t" + m);
		System.out.print(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
	}
}
