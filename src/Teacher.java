public class Teacher extends Person {
    private String academicDegree;

    public Teacher(String firstName, String lastName, int birthYear, String academicDegree) {
        super(firstName, lastName, birthYear);
        this.academicDegree = academicDegree;
    }

    String getAcademicDegree(){
        return academicDegree;
    }
    public void setAcademicDegree(String academicDegree){
        this.academicDegree = academicDegree;
    }

    public String toString() {
        return "Nauczyciel: " + getFirstName() + " " + getLastName() + " (" + getBirthYear() + "), stopień naukowy " + academicDegree;
    }
}