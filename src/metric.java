import java.util.Scanner;
public class metric{
    public static void main(String[] args) {
        double meters=0;
        double miles;
        double feet;
        double inches;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your measurement in meters: ");
        if (in.hasNextDouble()){
            meters = in.nextDouble();
            in.nextLine(); // clear buffer

            //calculations
            miles = meters / 1609.344;
            feet = meters * 3.28084;
            inches = meters * 39.3701;

            //output
            System.out.println("Your measurement in miles is " +miles+ " , in feet is " +feet+ " and in inches is " +inches);

        }
        else {
            trash = in.nextLine();
            System.out.println("Must enter a valid measurement number " + trash);
        }

    }
}