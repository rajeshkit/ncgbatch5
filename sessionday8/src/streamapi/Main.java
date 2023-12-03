package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] marks={45,89,34,66,32,100,3};
        List<Integer> listOfMarks= Arrays.asList(45,89,34,66,32,100,3);
        Stream<Integer> marksStream = Stream.of(marks);
        // data suource , intermediate operation, terminal operation
        //stream1
        //45,89,34,89,32,100,3
        listOfMarks
                .stream()
                .map((e)-> e * 5677L)
                .filter((e)->e>250000)
                .sorted()
                .forEach((e)-> System.out.println(e));
        // marksStream.map((e)-> e * 5677L).filter((e)->e>250000).sorted().forEach((e)-> System.out.println(e));

    }

}





