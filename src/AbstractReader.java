package src;

import java.io.*;
import java.nio.file.*;

import java.util.Vector;



public interface AbstractReader {
     public abstract Vector<String> read(String filename) throws Exception;
}
