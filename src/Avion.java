
public class Avion {
	private String PlaneID;
	private int totalEnginePower;
	
	public Avion(String PlaneID, int totalEnginePower) {
		this.PlaneID = PlaneID;
		this.totalEnginePower = totalEnginePower;
	}

	public String getPlaneID() {
		return PlaneID;
	}

	public int getTotalEnginePower() {
		return totalEnginePower;
	}
	public void takeOff() {
		System.out.println("PlaneID_Value- "+PlaneID+ "-Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - Retracting gear - Takeoff complete");
				
	}
	public void land() {
		System.out.println("PlaneID_Value- "+PlaneID+"-Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
	}
	public void fly() {
		System.out.println("PlaneID_Value- "+PlaneID+"-Flying");
	}
	
	
}
