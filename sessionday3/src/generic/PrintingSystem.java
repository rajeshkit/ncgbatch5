package generic;

import com.icicibank.account.Customer;

import java.util.*;

public class PrintingSystem {
    // ?- unbounded type
    // Upper unbounded type
    // Lower unbounded type
    public static void printArray(List<? super Number> in){
    }

    public static void main(String[] args) {
        PrintingSystem.printArray(new ArrayList<Object>());
        PrintingSystem.printArray(new LinkedList<Object>());
        PrintingSystem.printArray(new Vector<String>());
    }
}
