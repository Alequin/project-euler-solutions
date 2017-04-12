
public static void sumOfPrimes(){

//Find the sum of all the primes below two million.

//prime numbers are found by dividing all prime numbers prior
//to the current number. If any produce a whole number it is
//not prime

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




    
   

