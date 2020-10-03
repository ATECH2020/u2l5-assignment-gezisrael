import java.util.Scanner;
 
public class HowFarAway
{
   public static void main(String[] args)
   {
       double startLatitude;
       double startLongitude;
       double endLatitude;
       double endLongitude;
       double distance;
 
       Scanner scanner = new Scanner(System.in);
 
       System.out.println("Enter the latitude of the starting location: ");
       startLatitude = scanner.nextDouble();
 
       System.out.println("Enter the longitude of the starting location: ");
       startLongitude = scanner.nextDouble();
 
       System.out.println("Enter the latitude of the ending location: ");
       endLatitude = scanner.nextDouble();
 
       System.out.println("Enter the longitude of the ending location: ");
       endLongitude = scanner.nextDouble();


       GeoLocation locate = new GeoLocation(startLatitude, startLongitude);

       GeoLocation other = new GeoLocation(endLatitude, endLongitude);

       //locate.getLatitude;
       distance = locate.distanceFrom(other);
       System.out.print("The distance is " + distance + " miles.");
 
 
   }
}
