
public static void largestPrimeFactor(){
 
	//find the largest prime factor of 600851475143
	
	//find the largest prime number that can divide into the given 
	//number
	
	//prime numbers are divisible by themselves and 1
	//to identify a number as prime divide it by all previous 
	//prime numbers. If no previous prime number divided by the 
	//the current number produces a whole number it is prime
	
	//to find prime factors divide main number by smallest
	//divisible prime number, then divide the resultant number
	//again by the smallest possible prime number. continue until
	//both values are prime
	
	long num = 600851475143L;
	
	LinkedList<Integer> primeNumbers = new LinkedList();
	primeNumbers.add(2);
	
	PRIME_LOOP: while(true){
		
		for(int numToDivideBy : primeNumbers){
			double divider = (double)num / (double)numToDivideBy;
			if(isNumberWhole(divider)){
				num = (long)divider;
				continue PRIME_LOOP;
			}
		}
		findNextPrimeNumber(primeNumbers);
		if(num == primeNumbers.getLast()){
			break;
		}
	}
	
	System.out.println(num);
	
}
	
public static void findNextPrimeNumber(LinkedList<Integer> primeNumbers){
	
	//start from the last added prime number
	int currentNum = primeNumbers.getLast();
	
	MAIN_LOOP: while(true){
		currentNum++;
		
		for(int num : primeNumbers){
			double dividedValue = (double)currentNum / (double)num;
			//if dividedValue is a whole number it is not prime
			if(isNumberWhole(dividedValue)){
				continue MAIN_LOOP;
			}
		}
		
		primeNumbers.add(currentNum);
		return;
	}
}

public static boolean isNumberWhole(double value){
	return value == (int)value;
}


    
   

