
public static void sumOfMultiples3And5(){
 
	//Find the sum of all the multiples of 3 and 5 under 1000
	
	int maxNumber = 1000;
	int sum = 0;
	for(int currentNumber = 0; currentNumber < maxNumber; currentNumber++){
		
		if(currentNumber % 3 == 0 || currentNumber % 5 == 0){
			sum += currentNumber;
		}
	}
	
	System.out.println(sum);
}
    


    
   

