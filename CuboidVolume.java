import java.util.Scanner;

public class CuboidVolume {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Your code goes here */
        double cuboidLength, cuboidWidth, cuboidHeight, cuboidVolume;

        System.out.println("What is the length? ");
        cuboidLength = scnr.nextDouble();

        System.out.println("What is the Width? ");
        cuboidWidth = scnr.nextDouble();

        System.out.println("What is the Height? ");
        cuboidHeight = scnr.nextDouble();

        cuboidVolume = cuboidLength * cuboidWidth * cuboidHeight;

        System.out.print("Cuboid volume is ");
        System.out.printf("%.4f\n", cuboidVolume);



    }
}