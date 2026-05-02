/**
 * A basic call for describing a student at Hunt Scholars.
 *
 * @author Cam Ayres
 * @version 1.0
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;

    /**
     * Constructs a new Student object.
     *
     * @param firstName the first name of the student
     * @param lastName the last name of the student
     * @param age the age of the student
     */
    public Student(String firstName, String lastName, int age) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
    }

    /**
     * Getter function for the students name. Combines the firstName
     * and lastName private variables.
     *
     * @return the full name of the student
     */
    public String getName() {
	return(this.firstName + " " + this.lastName);
    }

    /**
     * Getter function for the students age, int years.
     *
     * @return the age of the student
     */
    public int getAge() {
	return(this.age);
    }

    /**
     * Increases the students age in years.
     *
     * @param howManyYearsOlder how many years older the student now is
     */
    public void gottenOlder(int howManyYearsOlder) {
	this.age = this.age + howManyYearsOlder;
    }
}
