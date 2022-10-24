
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Question1 l'interface fonctionnelle Somme 
        Somme<Integer> sommeInt = (x, y) -> x + y;

        Somme<Double> sommeDouble = (x, y) -> x + y;
        Somme<Long> sommeLong = (x, y) -> x + y;
        Somme<String> sommeString = (x, y) -> x.concat(y);

        // Question2 l'interface fonctionnelle ToString générique sur un type T 
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
