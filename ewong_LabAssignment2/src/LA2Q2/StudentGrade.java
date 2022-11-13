package LA2Q2;

public class StudentGrade implements Comparable<StudentGrade> {
    //declare variables
    private String firstName;
    private String lastName;
    private int grade;
    public StudentGrade(String fName, String lName, int grd) {
        //initialize var
      firstName = fName;
      lastName = lName;
      grade = grd;
    }
    //set first
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //set last
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //set grade
    public void setGrade(int grade) {
        this.grade = grade;
    }
    //returns first name
    public String getFirst() {
        return firstName;
    }
    //returns last name
    public String getLast() {
        return lastName;
    }
    //returns grade
    public int getGrade() {
        return grade;
    }
    //compares the grade of this student to the inputs student
    @Override
    public int compareTo(StudentGrade o1) {
        if(this.grade > o1.grade) {
            return 1;
        }
        if(this.grade < o1.grade) {
            return -1;
        }
        else {
            return 0;
        }
    }
    //to string returns formatted output
    @Override
    public String toString() {
        return String.format("\b\b%19s :\t \b%d\n", getFirst() + " " + getLast(), getGrade());
    }
}
