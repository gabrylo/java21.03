public class Student extends Person {
    private int albumNumber;
    private String enrollmentYear;


    public Student(String firstName, String lastName, int birthYear, int albumNumber, String enrollmentYear) {
        super(firstName, lastName, birthYear);
        this.albumNumber = albumNumber;
        this.enrollmentYear = enrollmentYear;
    }

    public int getAlbumNumber() {
        return albumNumber;
    }
    public void setAlbumNumber(int albumNumber) {
        this.albumNumber = albumNumber;
    }
    public String getEnrollmentYear() {
        return enrollmentYear;
    }
    public void setEnrollmentYear(String enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public String toString() {
        return "Student: " + getFirstName() + " " + getLastName() + " (" + getBirthYear() + "), album " + albumNumber + ", rok naboru " + enrollmentYear;
    }

}