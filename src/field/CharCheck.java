package src.field;

import src.field.AbstractFieldCheck;
import java.lang.reflect.Type;


public class CharCheck implements AbstractFieldCheck{


    public void validate(String token) throws Exception
    {
        String regex = "[YNMACESGWP]";
        
        if (!token.matches(regex)) {
            String message = String.format("Input %s: does not match the provided regular expression %s for Chars", token, regex);
            throw new IllegalArgumentException(message);
        }
    }
}