package src.distinguisher;

import src.distinguisher.StudentType;



public abstract class AbstractDecider {

    abstract public StudentType deduce(String student_str);
}
