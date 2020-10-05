/* Activity 1.2 - Question 2 */

import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name;
        String name2;
        String name3;

        System.out.println("Put in a name");
        name = scan.nextLine();
        System.out.println("Do it again");
        name2 = scan.nextLine();
        System.out.println("Do it again");
        name3 = scan.nextLine();

        System.out.println(name3);
        System.out.println(name2);
        System.out.println(name);
    }
}
