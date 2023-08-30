package src.distinguisher;

import src.distinguisher.AbstractDecider;
import src.field.NameCheck;
import src.field.CharCheck;
import src.field.IntCheck;
import src.field.FloatCheck;
import src.field.AbstractFieldCheck;

import java.util.ArrayList;
import java.util.List;


public class Decider extends AbstractDecider
{

    @Override
    public StudentType deduce(String student_str) 
    {
        
        List<AbstractFieldCheck> checkers = new ArrayList<>();

        String[] values = student_str.split(";");

        IntCheck int_checker = new IntCheck();
        NameCheck name_checker = new NameCheck();
        CharCheck char_checker = new CharCheck();
        FloatCheck float_checker = new FloatCheck();
        
        
        int DEGREE_CODE = 5;
        int CERT_OR_CITIZEN = 6;
        int FINANCIAL_ASSISTANCE = 8;

        checkers.add(int_checker);
        checkers.add(name_checker);
        checkers.add(name_checker);
        checkers.add(int_checker);
        checkers.add(int_checker);
        checkers.add(char_checker);
        checkers.add(char_checker);
        checkers.add(char_checker);
        checkers.add(char_checker);
        checkers.add(float_checker);


        try {
            for (int i = 0; i < CERT_OR_CITIZEN; i++) {
                checkers.get(i).validate(values[i]);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }


        boolean senior_citizen = values[DEGREE_CODE].charAt(0) == 'N' && values[CERT_OR_CITIZEN].charAt(0) == 'S';

        if (senior_citizen) {
            return StudentType.SENIOR_CITIZEN;
        }

        boolean certificate_student = values[DEGREE_CODE].charAt(0) == 'N' && values[CERT_OR_CITIZEN].charAt(0) == 'C';

        try {
            checkers.get(CERT_OR_CITIZEN + 1).validate(values[CERT_OR_CITIZEN + 1].strip());
        }
        catch (Exception e) {
            System.out.println(e);
        }


        if (certificate_student) {
            return StudentType.CERTIFICATE_STUDENT;
        }

        try {
            for (int i = CERT_OR_CITIZEN; i < values.length; i++) {
                checkers.get(i).validate(values[i].strip());
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        

        boolean degree_seeking_w_aid = values[DEGREE_CODE].charAt(0) == 'Y' && values[FINANCIAL_ASSISTANCE].charAt(0) == 'Y';
        boolean degree_seeking_w_out_aid = values[DEGREE_CODE].charAt(0) == 'Y' && values[FINANCIAL_ASSISTANCE].charAt(0) == 'N';

        if (degree_seeking_w_aid) {
            return StudentType.DEGREE_SEEKING_W_AID;
        }
        else if (degree_seeking_w_out_aid) {
            return StudentType.DEGREE_SEEKING_W_OUT_AID;

        } 

        throw new IllegalArgumentException("Input does not match the provided regular expression");
    }
}    
