package assignment_2.lambdas;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class DriverMain{
    public static void main(String[] args) {
        ArrayList<Integer> inputListOfNumbers = new GenerateRandomNumbers().randomInput();
        List<Integer> filteredPrimesList = new GeneratePrimesInRange().filterOutPrimes(inputListOfNumbers);
        System.out.println("Prime numbers  in 100 random number: " +filteredPrimesList);
    }
}
