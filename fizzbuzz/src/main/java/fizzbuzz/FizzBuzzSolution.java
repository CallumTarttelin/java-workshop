package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzSolution {

    List<String> fizzbuzz(Integer range) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < range; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                strings.add("fizzbuzz");
            } else if (i % 3 == 0) {
                strings.add("fizz");
            } else if (i % 5 == 0) {
                strings.add("buzz");
            } else {
                strings.add(Integer.toString(i));
            }
        }

        return strings;

    }
}


