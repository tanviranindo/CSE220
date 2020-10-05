import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class ArrayBasedWRM implements WRM {
    int token;
    ArrayBasedQueue queue = new ArrayBasedQueue();
    Scanner input = new Scanner(System.in);

    //Initializes
    ArrayBasedWRM() {
        System.out.println("\nArray Based Queue Selected.\n");
    }

    //Prompts And Register
    public void registerPatient() {
        //Name
        input = new Scanner(System.in);
        System.out.print("\nEnter Patient Name: ");
        String name = input.nextLine().trim().replaceAll("( )+", " ").toUpperCase();

        //Age
        int age = 0;
        boolean isValid = true;
        while (isValid) {
            try {
                System.out.print("Enter Patient Age: ");
                age = input.nextInt();
                isValid = false;
            } catch (InputMismatchException e) {
                System.out.println("Input Format Mismatch! Please, Try Again.");
                input.next();
            }
        }

        //Blood Group
        input = new Scanner(System.in);
        System.out.print("Enter Patient Blood Group: ");
        String bloodGroup = input.nextLine().trim().toUpperCase();
        token++;

        //Priority
        int priority;
        System.out.println("Priority Category: 1. Emergency 2. Senior Citizen 3. Woman/Children 4. General");
        while (true) {
            System.out.print("Select Priority: ");
            try {
                priority = input.nextInt();
                if (priority < 1 || priority > 4) System.out.println("Wrong Input! Please, Try Again.");
                else break;
            } catch (InputMismatchException e) {
                System.out.println("Input Format Mismatch! Please, Try Again.");
                input.next();
            }
        }

        //Entry, Priority Enqueue, Confirmation
        try {
            Patient user = new Patient(name, age, bloodGroup, token, priority);
            queue.enqueue(user);
            System.out.println("\n\"" + user.name + "\" Has Been Added Successfully.");
            String prior = priority == 1 ? "Emergency" : priority == 2 ? "Senior Citizen" : priority == 3 ? "Woman/Children" : "General";
            System.out.println("Token: " + user.token + " | Priority: " + prior + " | Age: " + age + " | Blood Group: " + bloodGroup + "\n");
        } catch (Exception e) {
            System.out.println("\nNo Space Available.\n");
        }
    }

    //Serves Confirmation, Next Patient Information
    public void servePatient() {
        try {
            Patient current = queue.dequeue();
            System.out.println("\n\"" + current.name + "\" Has Been Served.");
            try {
                Patient next = queue.peek();
                System.out.println("Next Patient Name: \"" + next.name + "\" | Token: " + next.token + "\n");
            } catch (Exception e) {
                System.out.println("Next Patient Not Found.\n");
            }
        } catch (Exception e) {
            System.out.println("\nNo Appointment Found!\n");
        }
    }

    //Confirms Appointment Cancellation
    public void cancelAllAppointment() {
        if (queue.isEmpty()) System.out.println("\nNo Appointment Found!\n");
        else {
            try {
                while (!queue.isEmpty()) queue.dequeue();
            } catch (Exception ignored) {
                System.out.println("Queue Underflow Exception.");
            }
            System.out.println("\nAll Appointment Has Been Cancelled.\n");
        }
    }

    //Doctor's Availability
    public void canDoctorGoHome() {
        System.out.println(queue.isEmpty() ? "\nYes, Doctor Can Go Home.\n" : "\nNo, Doctor Has Work To Do.\n");
    }

    //Prompt Menu
    public void showAllPatient() {
        if (queue.isEmpty()) System.out.println("\nPatient Not Found.\n");
        else {
            System.out.println("\nSelect Pattern:\n1. Lexicographical Order\n2. Serve Order (Priority)\n0. Exit");
            int pattern;
            while (true) {
                try {
                    System.out.print("Enter Choice: ");
                    pattern = input.nextInt();
                    if (pattern == 1 || pattern == 2 || pattern == 0) break;
                    else System.out.println("Wrong Input! Please, Try Again.");
                } catch (InputMismatchException e) {
                    System.out.println("Input Format Mismatch! Please, Try Again.");
                    input.next();
                }
            }

            if (pattern == 1) lexicographicalOrderSort();
            else if (pattern == 2) serviceOrder();
            else System.out.println("\nReturned To Menu.\n");
        }
    }

    //Shows In Lexicographically Order
    public void lexicographicalOrderSort() {
        Patient[] patients = queue.toArray();
        for (int i = 0; i < patients.length; i++) {
            for (int j = i + 1; j < patients.length; j++) {
                if (patients[i].name.compareTo(patients[j].name) > 0) {
                    Patient swap = patients[i];
                    patients[i] = patients[j];
                    patients[j] = swap;
                }
            }
        }
        System.out.println("\nShowing In Lexicographically Order: ");
        for (Patient i : patients) System.out.print(i.toString());
        System.out.println();
    }

    //Shows In Service Priority Order
    public void serviceOrder() {
        Patient[] patients = queue.toArray();
        System.out.println("\nShowing In Service Order: ");
        for (Patient i : patients) System.out.print(i.toString());
        System.out.println();
    }

    //Shows Availability Only By Name
    public void searchByName() {
        input = new Scanner(System.in);
        Patient[] patients = queue.toArray();
        if (queue.isEmpty()) System.out.println("\nPatient Data Is Empty.\n");
        else {
            System.out.print("\nEnter Patient Name: ");
            String name = input.nextLine().trim().replaceAll("( )+", " ").toUpperCase();
            for (int i = 0; i < queue.size(); i++) {
                if (patients[i].name.contains(name)) {
                    System.out.println("\"" + name + "\" Is In The Queue.\n");
                    return;
                }
            }
            System.out.println("\"" + name + "\" Is Not In The Queue.\n");
        }
    }
}
