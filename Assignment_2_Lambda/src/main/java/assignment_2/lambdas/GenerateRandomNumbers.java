package assignment_2.lambdas;
import java.util.ArrayList;
import java.util.Random;

public class GenerateRandomNumbers implements GenerateRandomNumbersInterface{
    //Generating unique random numbers in range of 1 to 100.
    @Override
    public ArrayList<Integer> randomInput()
    {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        Random random = new Random();
        int lowerBound = 1;
        int upperBound =100;
        for (int iterator = 0 ; iterator < 100 ; iterator++)
        {
            listOfNumbers.add(random.nextInt((upperBound+1) - lowerBound) + lowerBound);
        }
        return listOfNumbers;
    }
}
