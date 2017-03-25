
 public static void smallestMultiple(){
 
	//what is the smallest number divisible by all numbers 1-20
	
	//smallest number divisible by 1-10 is 2520
	//any number divisible by 11-20 is also divisible by 1-10
	
	int currentNumber = 2520;
	int maxNumToCheck = 20;

	while(true){
            currentNumber+=20;
            for(int j=11; j<=maxNumToCheck; j++){
                if(currentNumber % j != 0){
                            break;
                }else{
                if(j == 20){
                    //if all values are divisible print value and end loop 
                    System.out.println(currentNumber);
                    return;
                }
            }
        }
    }
}





