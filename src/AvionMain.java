
public class AvionMain {

	public static void main(String[] args) {
		AvionConcarde concorde = new AvionConcarde("CON123", 20000, 100);

       
        concorde.Apelare();
        concorde.goSuperSonic();
        concorde.goSubSonic();

        System.out.println();

        
        AvionTomCat tomcat = new AvionTomCat("TOM456", 30000);

        
        tomcat.Apelare();
        tomcat.refuel();
        tomcat.callLaunchMissile();

        System.out.println();

        
        AvionMIg mig = new AvionMIg("MIG789", 25000);

        mig.Apelare();
        mig.highSpeedGeometry();
        mig.normalGeometry();
        mig.callLaunchMissile();
    }
}

	


