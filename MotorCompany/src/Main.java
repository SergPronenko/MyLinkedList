import com.company.traffic.*;

import java.util.*;

public class Main {



    public static void main(String[] args) {
	// write your code here



        Human serg =new Human("Serg",new Date());
        DriverLicense driverLicense = new DriverLicense( DriverLicense.Category.D ,new  Date());
        Driver sergDriver = new Driver(serg,driverLicense) ;
        PassengerVehicle passengerVehicle = new PassengerVehicle("MERSEDES" , DriverLicense.Category.D ,"AA7777AA", PassengerVehicle.Passenger.BUS );
        Route route = new Route(passengerVehicle , sergDriver , "Kiev" , "Odessa");
        System.out.println(route);
        System.out.println("===============================================");

        Human ivan = new Human("Ivan", new Date());
        Driver ivanDriver = new Driver(ivan, new DriverLicense(DriverLicense.Category.C, new Date()));
        CargoVehicle cargoVehicle = new CargoVehicle("OPEL", DriverLicense.Category.C, "AA5555AA", CargoVehicle.Goods.BIGLORRY, 3000, 160, 5);
        Route route1 = new Route(cargoVehicle, ivanDriver, "Kiev", "Kharkiv");
        System.out.println(route1);
        System.out.println("===============================================");

        Human vasya = new Human("Vasya", new Date());
        Driver vasyaDriver = new Driver(vasya, new DriverLicense(DriverLicense.Category.E, new Date()));
        PassengerCargoVehicle passengerCargoVehicle = new PassengerCargoVehicle("NISSAN", DriverLicense.Category.E, "AA3333AA", 2400, 146, 5, 1.5 );
        Route route2 = new Route(passengerCargoVehicle, vasyaDriver, "Kiev", "Brovary");
        System.out.println(route2);
        System.out.println("================================================");






    }
}
