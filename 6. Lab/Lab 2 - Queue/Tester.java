import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to Waiting Room Management System");
        String menu = "Menu: \n1. Register A Patient\n2. Serve A Patient\n3. Cancel All Appointments\n4. Can Doctor Go Home\n5. List Of Patient \n6. Search Patient By Name\n7. Reset Data Structure\n0. Exit";

        OUTER:
        while (true) {
            //Data Structure
            System.out.println("\nData Structure:\n1. Array Based Queue\n2. Linked List Based Queue\n0. Exit");
            int queueSelection;
            while (true) {
                try {
                    System.out.print("Enter Choice: ");
                    queueSelection = input.nextInt();
                    if (queueSelection == 1 || queueSelection == 2 || queueSelection == 0) break;
                    else System.out.println("\nWrong Input! Please, Try Again.");
                } catch (InputMismatchException e) {
                    System.out.println("\nInput Format Mismatch! Please, Try Again.");
                    input.next();
                }
            }

            WRM wrm;
            if (queueSelection == 1) wrm = new ArrayBasedWRM();
            else if (queueSelection == 2) wrm = new LinkedListBasedWRM();
            else break;

            //Menu
            while (true) {
                System.out.println(menu);
                System.out.print("Enter Choice: ");
                try {
                    int select = input.nextInt();
                    if (select == 0) break OUTER;
                    else if (select == 1) wrm.registerPatient();
                    else if (select == 2) wrm.servePatient();
                    else if (select == 3) wrm.cancelAllAppointment();
                    else if (select == 4) wrm.canDoctorGoHome();
                    else if (select == 5) wrm.showAllPatient();
                    else if (select == 6) wrm.searchByName();
                    else if (select == 7) {
                        System.out.println("\nPrevious Data Has Been Cleared.");
                        break;
                    }
                    else System.out.println("\nWrong Input! Please, Try Again.");
                } catch (InputMismatchException e) {
                    System.out.println("\nInput Format Mismatch! Please, Try Again.");
                    input.next();
                }
            }
        }
        System.out.println("\nThank You");
    }
}