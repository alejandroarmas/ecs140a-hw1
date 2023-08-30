package src;

import src.AbstractStudentFactory;
import src.AbstractStudent;
import src.Student;
import src.Citizen;
import src.CertificateStudent;
import src.NoFinAssist;
import src.distinguisher.Decider;
import src.distinguisher.StudentType;


public class StudentFactory extends AbstractStudentFactory {

    @Override
    public AbstractStudent create_student(String student_str) 
    {


        Decider d = new Decider();
        StudentType deduced_type = d.deduce(student_str);

        String[] fields = student_str.split(";");

        int id = Integer.parseInt(fields[0]);
        String first_name = fields[1];
        String last_name = fields[2];
        int age = Integer.parseInt(fields[3]);
        int credits_taking = Integer.parseInt(fields[4]);
        
        if (deduced_type == StudentType.DEGREE_SEEKING_W_AID)
        {
            char major = fields[6].strip().charAt(0);
            char standing = fields[7].strip().charAt(0);
            float aid = Float.parseFloat(fields[9]);

            Student student = new Student(first_name, last_name, id, age, credits_taking, major, standing, aid);
            return student;
        }
        else if (deduced_type == StudentType.DEGREE_SEEKING_W_OUT_AID)
        {
            char major = fields[6].strip().charAt(0);
            char standing = fields[7].strip().charAt(0);

            Student student = new NoFinAssist(first_name, last_name, id, age, credits_taking, major, standing);
            return student;
        }
        else if (deduced_type == StudentType.SENIOR_CITIZEN) {

            Citizen student = new Citizen(first_name, last_name, id, age, credits_taking);
            return student;
        }
        else if (deduced_type == StudentType.CERTIFICATE_STUDENT) {

            char major = fields[7].strip().charAt(0);
            CertificateStudent student = new CertificateStudent(first_name, last_name, id, age, credits_taking, major);
            return student;
        }

        throw new IllegalArgumentException("Student Input String was Ill-formed");
    }

}