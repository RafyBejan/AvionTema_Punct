
public class AvionTomCat extends AvionLupta {

	public AvionTomCat(String PlaneID, int totalEnginePower) {
		super(PlaneID, totalEnginePower);
	}
	public void refuel() {
		System.out.println("PlaneID_Value-"+getPlaneID()+"-Initiating refueling procedure-Locating refueller-Catching up-Refueling-Refueling complete");
	}
	public void callLaunchMissile() {
		launchMissle();
    }
	public void Apelare() {
		fly();
		takeOff();
		land();
	
	}
	

}
