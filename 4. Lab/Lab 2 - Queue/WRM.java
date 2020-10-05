/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public interface WRM {

    /*
    * Differences between ArrayBasedWRM and LinkedListBasedWRM can be seen in the following methods
    - cancelAllAppointment()
    - lexicographicalOrderSort()
    - serviceOrder()
    - searchByName()
    * Otherwise, rest of the methods are similar.
    */

    void registerPatient();

    void servePatient();

    void cancelAllAppointment();

    void canDoctorGoHome();

    void showAllPatient();

    void searchByName();
}
