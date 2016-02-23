package fms.model.maintenance;

import java.util.ArrayList;
import java.util.Date;

import fms.model.facility.Facility;

public class Request {
	private int requestID;
	private Facility facility;
	private Date requestDate;
	private Date completeDate;
	private int days;
	private Problem problem;
	private MaintenanceSchedule maintenanceSchedule;
	
	public Request() {
	}

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

//	public int getProblemID() {
//		return problemID;
//	}
//
//	public void setProblemID(int problemID) {
//		this.problemID = problemID;
//	}

	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Date getCompleteDate() {
		return completeDate;
	}

	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public Problem getProblem() {
		return problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	
	public MaintenanceSchedule getMaintenanceSchedule() {
		return maintenanceSchedule;
	}

	public void setMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
		this.maintenanceSchedule = maintenanceSchedule;
	}

}
