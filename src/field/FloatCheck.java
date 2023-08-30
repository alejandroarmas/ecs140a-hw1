package src.field;

import src.field.AbstractFieldCheck;


public class FloatCheck implements AbstractFieldCheck{


    public void validate(String token) throws Exception
    {
        String regex = "^[-+]?\\d*\\.?\\d+$";
        
        if (!token.matches(regex)) {
            String message = String.format("Input %s: does not match the provided regular expression %s for floats", token, regex);
            throw new IllegalArgumentException(message);
        }
    }
}