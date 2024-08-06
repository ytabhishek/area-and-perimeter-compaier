package conditional;
import java.util.Scanner;
public class area_perimeter_grater {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the bridth: ");
        int bridth = sc.nextInt();
        int area = length*bridth;
        int perimeter = 2*(length+bridth);

        if(area>perimeter){
            System.out.println("Area is greater than perimeter: ");

        }
        else{
            System.out.println("Perimeter is grater than area: ");
        }

    }
}
