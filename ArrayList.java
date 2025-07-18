import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    
    public static void main (String [] args){
        ArrayList<String> vehicle = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        
        vehicle.add("Car");
        vehicle.add("Bike");
        vehicle.add("Auto");
        System.out.println("Types of vehicles:" + vehicle);
System.out.println("Select a vehicle type:");
String choice = scanner.nextLine();
switch(choice){
    case "Car":
        System.out.println("No. of tyres = 4");
        System.out.println("Average CC = 1500cc");
        break;
    case "Bike": 
         System.out.println("No. of tyres = 2");
        System.out.println("Average CC = 300cc"); 
        break;
    case "Auto": 
        System.out.println("No. of tyres = 3");
        System.out.println("Average CC = 200cc");
        break;
    default:
        System.out.println("Invalid choice.");
}

    }
}
