import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        House house = new House();

        Scanner in = new Scanner(System.in);


        System.out.println("Enter address: ");
        house.setAddress(in.nextLine());

        System.out.println("Enter numbers of floors: ");
        house.setFloorsNumber(in.nextInt());
        in.nextLine();

        System.out.println("Enter residents names");
        house.setResidentsNames(in.nextLine().split(","));

        in.close();



        System.out.println("Address: " + house.getAddress() + "\nFloors: " + house.getFloorsNumber() + "\nResidents Names: " + Arrays.toString(house.getResidentsNames()));




    }
}
