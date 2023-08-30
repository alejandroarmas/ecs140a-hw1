package src;

import src.AbstractStudent;


public class Citizen extends AbstractStudent{



    public Citizen(String first, String last, int _id, int _age, int credits) {
            super(first, last, _id, _age, credits);
        }

    @Override
    public int computeFees() 
    {
        int flat_fee = 100;

        int credits_over_six = this.credits_enrolled > 6 ? this.credits_enrolled - 6 : 0;
        int total_fees = flat_fee + credits_over_six * 50; 
        return total_fees;  


    }
    
    @Override
    public void printData()
    {

        String output = String.format("ID number: %d\n" +
                "Name: %s\n" +
                "Age: %d\n" +
                "%s is a senior-citizen enrolled in %d credits",
                this.id, 
                this.first_name + " " + this.last_name, 
                this.age,
                this.first_name, 
                this.credits_enrolled
        ); 

        System.out.println(output);
    }
}