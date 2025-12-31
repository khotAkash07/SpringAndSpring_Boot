package org.akash;

public class Player {
	private long id;
	private String name;
	private int run;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public void show() {
		System.out.println("Id = " + id);
		System.out.println("Name = " + name);
		System.out.println("Runs = " + run);
	}
}
