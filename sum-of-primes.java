
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Experiments{

    public static int test = 0;
    
    public static void main(String[] args) {

        sumOfPrimes();
        
    }
    
    public static void sumOfPrimesOriginal(){
 
	//Find the sum of all the primes below two million.
        
        //prime numbers are found by dividing all prime numbers prior
        //to the current number. If any produce a whole number it is
        //not prime
        
        //only prime numbers below half of the current number must be tested
        
        LinkedList<Integer> primeNumbers = new LinkedList();

        primeNumbers.add(2);
        int currentNumber = 1;
        int maxNumber = 2_000_000;
        // start at two as it is already in the List
        long sum = 2;

        MAIN_LOOP: while(currentNumber <= maxNumber){
            //plus 2 to avoid all event numbers
            currentNumber += 2;
            for(int num : primeNumbers){
                double dividedValue = (double)currentNumber / (double)num;
                //if dividedValue is a whole number it is not prime
                if( isNumberWhole(dividedValue)){
                    continue MAIN_LOOP;
                }else
                if(Math.min(num, dividedValue) > Math.sqrt(currentNumber)){
                    break;
                }
            }
            primeNumbers.add(currentNumber);
            sum += currentNumber;
        }

        System.out.println(sum);
    }

    public static boolean isNumberWhole(double num){
        return num % 1 == 0;
    }
    
    public static void sumOfPrimes(){
 
	//Find the sum of all the primes below two million.
        
        //prime numbers are found by dividing all prime numbers prior
        //to the current number. If any produce a whole number it is
        //not prime
        
        //only prime numbers below half of the current number must be tested
        
        LinkedList<Integer> primeNumbers = new LinkedList();

        primeNumbers.add(2);
        int currentNumber = 1;
        int maxNumber = 2_000_000;
        // start at two as it is already in the List
        int sb = 100_000;
        int s = 100_000;
        long sum = 2;

        MAIN_LOOP: while(currentNumber <= maxNumber){
            //plus 2 to avoid all event numbers
            currentNumber += 2;
            for(int num=3; num < currentNumber; num+=2){
                double dividedValue = (double)currentNumber / (double)num;
                //if dividedValue is a whole number it is not prime
                if( isNumberWhole(dividedValue) ){
                    continue MAIN_LOOP;
                }else
                if(Math.min(num, dividedValue) > Math.sqrt(currentNumber)){
                    break;
                }
            }
            if(currentNumber > s){
                System.out.println(currentNumber);
                s += sb;
            }
            sum += currentNumber;
        }

        System.out.println(sum);
    }

}



    
   

