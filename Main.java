import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to Terminal Blackjack!\nYour options are: bet.\n- @author Neil Purohit 02-22-22");
        try {
            String command = scanner.nextLine();
            if (command == "hit") {

            }

        } catch (Exception e) {
            System.out.println("Error: don't type numbers. Rather only type strings.");
        }
        scanner.close();
    }
}

/** NOTE: the code is not finished! */
