
public static void sumSquareDifference(){

//Find the difference between the sum of the squares of the first 
	//one hundred natural numbers and the square of the sum.
	
	// sum of squares 1-10 == 385
	// sum of 1-10 == 55
	
	int sumOfSquares = 385;
	int squareOfSum = 55;
	
	int maxNum = 100;
	
	for(int j=11; j<maxNum; j++){
		sumOfSquares += (int)Math.pow(j,2);
		squareOfSum += j;
	}
	squareOfSum = (int)Math.pow(squareOfSum, 2);
	
	System.out.println(Math.abs(sumOfSquares - squareOfSum));
}


    
   

