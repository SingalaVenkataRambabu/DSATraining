import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class AverageMarks {

    public static void main(String[] args){

        String[][] studentMarks = {
                {"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}
        };

        // Calculate the highest average
        Optional<Map.Entry<String, Double>> topStudent = getHighestAverage(studentMarks);

        // Print result
        topStudent.ifPresent(entry -> {
            System.out.println("Highest Average Marks: " + entry.getValue());
            System.out.println("Top Student: " + entry.getKey());
        });
    }

    public static Optional<Map.Entry<String, Double>> getHighestAverage(String[][] studentMarks) {
        return Arrays.stream(studentMarks)
                .collect(Collectors.groupingBy(
                        entry -> entry[0], // Group by student name
                        Collectors.averagingInt(entry -> Integer.parseInt(entry[1])) // Calculate average
                ))
                .entrySet()
                .stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue));


    }
}
