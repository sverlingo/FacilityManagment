package fms.model.facility;

import java.util.ArrayList;
import java.util.List;

import fms.model.use.CustomerInterface;

public interface FacilityInterface {
	public List<RoomInterface> listFacilities();
	public DetailsInterface getFacilityInformation();
	public int requestAvailableCapacity();
	public RoomInterface addNewFacility(RoomInterface room);
	public void addFacilityDetail(DetailsInterface details);
	public RoomInterface removeFacility(RoomInterface room);
	public int getFacilityID();
	public void setFacilityID(int facilityID) ;
	public List<RoomInterface> getRooms();
	public void setRooms(List<RoomInterface> roomsList);
	public CustomerInterface getUser();
	public void setUser(CustomerInterface customer);
	public DetailsInterface getDetails();
	public void setDetails(DetailsInterface details);
}
