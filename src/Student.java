package src;

import src.CertificateStudent;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class Student extends CertificateStudent {

    protected char academic_standing;
    protected float aid_recieving;
    protected Map<Character, String> standing_map;

    public Student(String first, String last, int _id, int _age, int credits, char major, char standing, float aid) {
            super(first, last, _id, _age, credits, major);
            this.academic_standing = standing;
            this.aid_recieving = aid;
            
            this.standing_map = new HashMap<>();
            this.standing_map.put('G', "Good");
            this.standing_map.put('W', "Warning");
            this.standing_map.put('P', "Probation");
        }


    @Override
    public int computeFees() 
    {
        // Degree Seeking w/out Aid: rec fee of $100 + union fee $50 + $275 per credit capped at 12
        int max_units_to_pay_for = 12;
        int price_per_unit = 275;
        int price_for_courses = this.credits_enrolled <= max_units_to_pay_for ? this.credits_enrolled * price_per_unit : price_per_unit * max_units_to_pay_for;

        int total_fees = 100 - Math.round(this.aid_recieving) + 50 + price_for_courses; 

        total_fees = total_fees > 0 ? total_fees : 0;

        return total_fees;
    }
    
    @Override
    public void printData()
    {
        String output = String.format("ID number: %d\n" +
                "Name: %s\n" +
                "Age: %d\n" +
                "%s is a degree-seeking student enrolled in %d credits\n" +
                "%s receives $%.2f in financial assistance per term\n" +
                "%s’s major is %s\n" +
                "%s’s academic standing is %s",
                this.id, 
                this.first_name + " " + this.last_name, 
                this.age,
                this.first_name, 
                this.credits_enrolled, 
                this.first_name, 
                this.aid_recieving,
                this.first_name, 
                this.major_map.get(this.major), 
                this.first_name, 
                this.standing_map.get(this.academic_standing));

        System.out.println(output);


    }
}