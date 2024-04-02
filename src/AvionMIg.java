
public class AvionMIg extends AvionLupta {

	public AvionMIg(String PlaneID, int totalEnginePower) {
		super(PlaneID, totalEnginePower);
	}
	public void highSpeedGeometry() {
		System.out.println("PlaneID_Value- "+getPlaneID()+"-High speed geometry selected");
	}
	public void normalGeometry() {
		System.out.println("PlaneID_Value-"+getPlaneID()+"-Normal geometry selected");
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
