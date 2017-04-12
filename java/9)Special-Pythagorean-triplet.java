public static void originalMethod(){
 
	int [] values = {1,1,1};
	int sumToMake = 1000;
	int currentSum = 0;
	
	while(true){
		
		values[2] ++;
		if(values[2] > sumToMake){
			values[2] = 1;
			values[1]++;
			if(values[1] > sumToMake){
				values[1] = 1;
				values[0]++;
			}
		}
		
		if(values[0] + values[1] + values[2] == sumToMake){
			if(Math.pow(values[0], 2) + Math.pow(values[1], 2) == Math.pow(values[2], 2)){
				break;
			}
		}
	}
	
	System.out.println(values[0] +" | "+ values[1] +" | "+ values[2]);
	System.out.println(values[0] * values[1] * values[2]);
}

public static void afterReview(){
	
	//opposite = high * low
	//adjacent = (high^2 - low^2)/2
	//hypotenuse = (high^2 + low^2)/2
	//opposite + adjacent + hypotenuse = 1000
	//high must always be more than low
	//sources: 
		//http://www.friesian.com/pythag.htm
		//https://projecteuler.net/thread=9
	
	
	int sumToMake = 1000;
	
	int high = 2;
	int low = 1;
	int opposite = 0;
	int adjacent = 0;
	int hypotenuse = 0;
	
	while(true){
		
		opposite = high * low;
		adjacent = ((int)Math.pow(high,2) - (int)Math.pow(low,2))/2;
		hypotenuse = ((int)Math.pow(high,2) + (int)Math.pow(low,2))/2;
		
		if(opposite + adjacent + hypotenuse == sumToMake){
			break;
		}else{
			high++;
			if(high > sumToMake){
				high = low+1;
				low++;
			}
		}
		
	}
	
	System.out.println(opposite +" | "+ adjacent +" | "+ hypotenuse);
	System.out.println(opposite * adjacent * hypotenuse);
	
}





