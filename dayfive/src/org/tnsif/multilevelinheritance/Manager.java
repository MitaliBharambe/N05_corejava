package org.tnsif.multilevelinheritance;
//parent class1
public class Manager {
    private String deptName;
    private String Name;
    private int id;
    
    
	public Manager() {
		System.out.println("DEfault Constructor-Manager");
	}


	public Manager(String deptName, String name, int id) {
		super();
		this.deptName = deptName;
		Name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", Name=" + Name + ", id=" + id + "]";
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
    
    
}
