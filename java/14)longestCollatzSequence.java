public static void longestCollatzSequence(){

	//Which starting number, under one million, produces the longest Collatz chain?
	
	//The iterative sequence is defined for the set of positive integers:
		//n Å® n/2 (n is even)
		//n Å® 3n + 1 (n is odd)

	final int maxStartingNumber = 1_000_000;
	int maxChainLength = 0;
	int maxChainStartingNumber = 0;
	for(long n=1; n < maxStartingNumber; n++){
		int currentChainLength = getCollatzSequence(n).size();
		if(maxChainLength != Math.max(maxChainLength, currentChainLength)){
			maxChainStartingNumber = (int)n;
			maxChainLength = currentChainLength;
		}
	}
		
	System.out.println(maxChainStartingNumber);
}

private static LinkedList<Long> getCollatzSequence(Long num) {
	
	final LinkedList<Long> chain = new LinkedList();
	chain.add(num);
	while(num > 1){
		if(num % 2 == 0){
			num =  num/2L;
		}else{
			num = num*3L + 1L;
		}  
		chain.add(num);
	}
	
	return chain;
}