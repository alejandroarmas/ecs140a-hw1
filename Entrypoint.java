import src.Student;
import src.AbstractStudent;
import src.StudentFactory;
import src.Reader;

import java.util.Vector;

public class Entrypoint {
    public static void main(String args[]) {

        // String student_str = "9005771;Alejandro;Armas;23;12;Y;E;G;Y;500.0";


        Reader a = new Reader();

        try {
            Vector<String> data = a.read("data/hw2.txt");

            for (String student_str : data) {
                System.out.println(student_str);
                StudentFactory factory = new StudentFactory();
                AbstractStudent student = factory.create_student(student_str);

                System.out.println(String.format("Fees Assessed: %d\n", student.computeFees()));
                student.printData();
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}