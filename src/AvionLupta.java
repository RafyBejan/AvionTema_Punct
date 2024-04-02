
public class AvionLupta extends Avion {

	public AvionLupta(String PlaneID, int totalEnginePower) {
		super(PlaneID, totalEnginePower);
	}
	 public void launchMissle() {
		 System.out.println("PlaneID_Value"+getPlaneID()+"Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away  Missle launch complete ");
	 }
	public void Apelare() {
		fly();
		takeOff();
		land();
	}
}
