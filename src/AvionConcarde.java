

public class AvionConcarde extends AvionPasageri {
    public AvionConcarde(String PlaneID, int totalEnginePower, int MaxPassengers) {
        super(PlaneID, totalEnginePower, MaxPassengers);
    }

    public void goSuperSonic() {
        System.out.println("PlaneID_Value-" + getPlaneID() + "-Supersonic mode activated");
    }

    public void goSubSonic() {
        System.out.println("PlaneID_Value-" + getPlaneID() + "-Supersonic mode deactivated");
    }

    public void Apelare() {
        takeOff();
        fly();
        land();
    }
}

