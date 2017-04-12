
public static void palindrome(){
 
	//find the largest palindrome made by the product of two 3 digit numbers
	
	int value1 = 999;
	int value2 = 999;
	int max = 0;
	
	while(value2 > 100){
		int product = value1 * value2;
		if(isPalindrome(product)){
			max = Math.max(max, product);
		}
		
		value1 --;
		if(value1 < 100){
			value2 --;
			value1 = 999;
		}
	}
	
	System.out.println(max);
}
	
public static boolean isPalindrome(int num){
	
	int length = Integer.toString(num).length();
	
	// an odd length cannot be a palindrome
	if(length % 2 != 0){
		return false;
	}
	
	int[] digits = new int[length];
	
	for(int j=0; j < length; j++){
		digits[j] = num % 10;
		num /= 10;
	}
	
	for(int j=0; j < length/2; j++){
		if(digits[j] != digits[(length-1)-j]){
			return false;
		}
	}
	
	return true;
}





