package fms.model.maintenance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fms.model.facility.Facility;
import fms.model.facility.FacilityInterface;

public class FacilityMaintenance implements FacilityMaintenanceInterface {
	private int maintenanceID;
	private List<RequestInterface> listRequests;
	private int facilityID;
	private FacilityInterface facility;
	private CostInterface cost;
	
	public FacilityMaintenance(){	}
	
	@Override
	public RequestInterface makeFacilityMaintRequest(RequestInterface request) {
		listRequests.add(request);
		return request;
	}

	@Override
	public RequestInterface scheduleMaintenance(Date startDate, Date completeDate) {
		Request r = new Request();
		r.setRequestDate(startDate);
		r.setCompleteDate(completeDate);
		listRequests.add(r);
		return r;
	}

	@Override
	public int calcMaintenanceCostForFacility(RequestInterface request) {
		int days = request.getCompleteDate().compareTo(request.getRequestDate()) +1;
		int amount = getCost().getMaintenanceCost();
		return days*amount;
	}

	@Override
	public int calcProblemRateForFacility(ProblemInterface p1) {
		int count=0;
		for (RequestInterface r: listRequests){
			if (r.getProblem()==p1) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int calcDownTimeForFacility(RequestInterface request) {
		int days = request.getCompleteDate().compareTo(request.getRequestDate()) +1;
		return days;
	}

	@Override
	public List<RequestInterface> listMaintRequests() {
		return listRequests;
	}

	@Override
	public String listMaintenance() {
		String maint="";
		for (RequestInterface r : listRequests) {
			maint += r.getRequestID()+"\n";
			}
		return maint;
	}

	@Override
	public String listFacilityProblems() {
		String prob="";
		for (RequestInterface r : listRequests) {
			if (!(r.getProblem()==null)){
				prob+= r.getProblem().getProblem() +"\n";
			}
		}
		return prob;
	}

	public int getFacilityID() {
		return facilityID;
	}

	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}


	public CostInterface getCost() {
		return cost;
	}

	public void setCost(CostInterface cost) {
		this.cost = cost;
	}

	public void addRequest(RequestInterface request){
		listRequests.add(request);
	}
	public FacilityInterface getFacility() {
		return facility;
	}

	public void setFacility(FacilityInterface facility) {
		this.facility = facility;
	}
	public List<RequestInterface> getListRequests() {
		return listRequests;
	}
	public void setListRequests(List<RequestInterface> listRequests) {
		this.listRequests=listRequests;
	
	}

	public int getMaintenanceID() {
		return maintenanceID;
	}

	public void setMaintenanceID(int maintenanceID) {
		this.maintenanceID = maintenanceID;
	}



}
