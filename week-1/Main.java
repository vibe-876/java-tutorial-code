/**
 * Main class.
 *
 * @author Cam Ayres
 * @version 1.0
 */
public class Main {
    /**
     * Adds a new student. Warning: will crash if less than three arguments
     * are provided.
     *
     * @param args the students first name, followed by their last name, followed by their age
     * @see Student
     */
    public static void main(String[] args) {
	Student newStudent = new Student(args[0],
				 args[1],
				 Integer.parseInt(args[2]));

	System.out.println("Student " + newStudent.getName() + " is " + newStudent.getAge() + " years old.");
    }
}
