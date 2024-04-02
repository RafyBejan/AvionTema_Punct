
public class AvionPasageri extends Avion {
    private int MaxPassengers;

	public AvionPasageri(String PlaneID, int totalEnginePower, int MaxPassengers) {
		super(PlaneID, totalEnginePower);
		this.MaxPassengers = MaxPassengers;
	}

	public int getMaxPassengers() {
		return MaxPassengers;
	}
	public void Apelare() {
		takeOff();
		land();
		fly();
	}
    
}
