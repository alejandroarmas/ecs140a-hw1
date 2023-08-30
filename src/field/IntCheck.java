package src.field;

import src.field.AbstractFieldCheck;
import java.lang.reflect.Type;


public class IntCheck implements AbstractFieldCheck{

    public void validate(String token) throws Exception
    {
        String regex = "^-?\\d+$";

        
        if (!token.matches(regex)) {
            String message = String.format("Input %s: does not match the provided regular expression %s for Ints", token, regex);
            throw new IllegalArgumentException(message);
        }
    }
}