package src;

import src.Citizen;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class CertificateStudent extends Citizen{

    protected char major;
    protected Map<Character, String> major_map;

    public CertificateStudent(String first, String last, int _id, int _age, int credits, char major) {
            super(first, last, _id, _age, credits);
            
            this.major = major;
            this.major_map = new HashMap<>();
            this.major_map.put('E', "Beverage Engineering");
            this.major_map.put('A', "Lounge Arts");
            this.major_map.put('S', "Gaming Science");
            this.major_map.put('H', "Hotel Management");
        }

    @Override
    public int computeFees() 
    {
        return 700 + 300 * this.credits_enrolled;
    }
    
    @Override
    public void printData()
    {

        String output = String.format("ID number: %d\n" +
                "Name: %s\n" +
                "Age: %d\n" +
                "%s is a certificate student enrolled in %d credits\n" +
                "%s’s major is %s",
                this.id, 
                this.first_name + " " + this.last_name, 
                this.age,
                this.first_name, 
                this.credits_enrolled, 
                this.first_name, 
                this.major_map.get(this.major) 
        );

        System.out.println(output);


    }
}