package org.tnsif.multilevelinheritance;
//child class2
//parentclass2
public class TeamLead extends Manager {
    private String leadName;
    private int empID;
    private String projectName;
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", empID=" + empID + ", ProjectName=" + projectName
				+ ", getLeadName()=" + getLeadName() + ", getEmpID()=" + getEmpID() + ", getProjectName()="
				+ getProjectName() + "]";
	}
	
	
	public TeamLead(String deptName, String name, int id,String leadName, int empID, String projectName) {
		super(deptName, name, id);
		this.leadName = leadName;
		this.empID = empID;
		this.projectName = projectName;
	}
    
	
    
}
