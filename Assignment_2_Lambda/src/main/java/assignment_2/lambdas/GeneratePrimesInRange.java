package assignment_2.lambdas;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
public class GeneratePrimesInRange implements GeneratePrimesInRangeInterface{
    static Predicate<Integer> isNumberPrime = number->number>1 && LongStream.rangeClosed(2, number / 2).
            noneMatch(i -> number % i == 0); //Method Reference

    public List<Integer>  filterOutPrimes(ArrayList<Integer> inputNumbers){
        List<Integer> filteredPrimes = inputNumbers.stream().filter(isNumberPrime).collect(Collectors.toList());
        return filteredPrimes;
    }
}
