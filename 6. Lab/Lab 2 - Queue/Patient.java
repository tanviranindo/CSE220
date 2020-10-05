/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Patient {
    String name;
    int age;
    String bloodGroup;
    int token;
    int priority;

    public Patient(String n, int a, String b, int t, int p) {
        name = n;
        age = a;
        bloodGroup = b;
        token = t;
        priority = p;
    }

    public String toString() {
        String prior = priority == 1 ? "Emergency" : priority == 2 ? "Senior Citizen" : priority == 3 ? "Woman/Children" : "General";
        return "Name: " + name + " | Token: " + token + " | Priority: " + prior + " | Age: " + age + " | Blood Group: " + bloodGroup + "\n";
    }
}
