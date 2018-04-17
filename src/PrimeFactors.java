import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> of(int number) {
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int candidate = 2; number > 1; candidate++){
            for (; number % candidate == 0; number /= candidate) {
                primeList.add(candidate);
            }
        }
        return primeList;
    }
}
