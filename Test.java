import src.Student;
import src.Citizen;
import src.CertificateStudent;
import src.AbstractStudent;
import src.StudentFactory;
import src.NoFinAssist;
import src.Reader;

import java.util.Vector;


public class Test {

	public static String generateReport() {
		StringBuilder reportBuilder = new StringBuilder();
        StudentFactory factory = new StudentFactory();
        Reader a = new Reader();


        String file_name = "data/hw2.txt";

        Vector<String> data = null;

        try 
        {
            data = a.read(file_name);
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }

		AbstractStudent[] students = new AbstractStudent[data.size()];
        
        for (int i = 0; i < data.size(); i++) {
            String student_str = data.get(i);
            AbstractStudent student = factory.create_student(student_str);
            students[i] = student;
        }


        reportBuilder.append("Summary of each student's fees assessed: \n\n");

        for (int i = 0; i < data.size(); i++) {
            AbstractStudent student = students[i]; 
            String student_name = student.first_name + " " + student.last_name;
            int student_fee = student.computeFees();

            reportBuilder.append(student_name + " has $" + String.format("%,d", student_fee) + " fees assessed \n");		
        }

		// SUMMARY REPORT of fees assessed for each of the four types of student
		int degree_nofin_fees = 0;
		int degree_fin_fees = 0;
		int certificate_fees = 0;
		int senior_fees = 0;
		int total_fees = 0;

        for (int i = 0; i < data.size(); i++) {

            AbstractStudent student = students[i]; 
            int student_fee = student.computeFees();

            if (student instanceof NoFinAssist) 
            {
                degree_nofin_fees += student_fee;
            } 
            else if (student instanceof Student) 
            {
                degree_fin_fees += student_fee;
            } 
            else if (student instanceof CertificateStudent) 
            {
                certificate_fees += student_fee;
            } 
            else if (student instanceof Citizen) 
            {
                senior_fees += student_fee;
            } 
            else 
            {
                throw new IllegalArgumentException("Student Type does not exist");
            }
            total_fees += student_fee;
        }
		
		reportBuilder.append("\n\n");
		reportBuilder.append("Summary of all student fees assessed: \n\n");
		reportBuilder.append(
				"Degree-seeking students without financial assistance: $" + String.format("%,d", degree_nofin_fees) + "\n");
		reportBuilder
				.append("Degree-seeking students with financial assistance: $" + String.format("%,d", degree_fin_fees) + "\n");
		reportBuilder.append("Certificate students: $" + String.format("%,d", certificate_fees) + "\n");
		reportBuilder.append("Senior citizens: $" + String.format("%,d", senior_fees) + "\n\n");
		reportBuilder.append("Total fees assessed: $" + String.format("%,d", total_fees));

		return reportBuilder.toString();
	}

	public static void main(String[] args) {
		System.out.println(generateReport());
	}
}
