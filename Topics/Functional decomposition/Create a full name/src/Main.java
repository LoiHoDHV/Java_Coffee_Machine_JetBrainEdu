// Don't delete scanner import
import java.util.Arrays;
import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // use this program as a source of inspiration for your method

//        String firstName1 = scanner.next();
//        String lastName1 = scanner.next();
//        System.out.println(createFullName(firstName1, lastName1));
//        System.out.println(firstName1 + " " + lastName1);
//
//        String firstName2 = scanner.next();
//        String lastName2 = scanner.next();
//        System.out.println(firstName2 + " " + lastName2);
//
//        String firstName3 = scanner.next();
//        String lastName3 = scanner.next();
//        System.out.println(firstName3 + " " + lastName3);

        int[] numbers = { 4, 5, 6 };


        method(numbers);


        System.out.println(Arrays.toString(numbers));
    }

    //implement your method here
    public static String createFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    public static void method(int[] array) {
        array = new int[] { 1, 2, 3 };
    }
}