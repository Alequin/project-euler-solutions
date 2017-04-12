
public static void highlyDivisibleTriangularNumber(){

    //What is the value of the first triangle number to have over five hundred divisors?

    int position = 1;
    long triangleNumber;
    Long[] factors;
    do{
        position ++;
        triangleNumber = getTriangleNumber(position);
        factors = getFactors(triangleNumber); 
    }while(factors.length <= 500);

    System.out.println(triangleNumber);
}

public static long getTriangleNumber(int position){
    return (long)(position*(position + 1)/2);
}

public static Long[] getFactors(long number){

    LinkedList<Long> primeFactors = new LinkedList();
    primeFactors.add(number);
    primeFactors.add(1L);

    for(long j=2; j<=Math.sqrt(number); j++){
        if(isNumberWhole((double)number / (double)j)){
            primeFactors.add(j);
            primeFactors.add(number / j);
        }
    }

    return primeFactors.toArray(new Long[primeFactors.size()]);
}

public static boolean isNumberWhole(double num){
    return num % 1 == 0;
}
