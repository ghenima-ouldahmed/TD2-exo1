
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Question1
        Somme<Integer> sommeInt = (x, y) -> x + y;

        Somme<Double> sommeDouble = (x, y) -> x + y;
        Somme<Long> sommeLong = (x, y) -> x + y;
        Somme<String> sommeString = (x, y) -> x.concat(y);

        // Question2
        List<String> l2s = new ArrayList<>();
        l2s.add("e1");
        l2s.add("e2");
        ToString<List<String>> toStringList = x -> {
            final StringBuilder builder = new StringBuilder();
            x.forEach((val) -> {
                builder.append(val + ", ");
            });
            return builder.toString();
        };

 

    }
}
