import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = 0;
        do {
            System.out.println("Enter the size of the array to create (between 3 and 10)");
            size = input.nextInt();
        } while (size < 3 || size > 10);
        System.out.println("The size you entered is: " + size);

    }
}
