
public static void primeNumber10001(){

    //What is the 10_001st prime number?

    //a number is prime if it does not divide by any prime numbers
    //that come before it

    LinkedList<Integer> primeNumbers = new LinkedList();

    primeNumbers.add(2);
    int currentNumber = 2;
    int count = 1;
    int primeToFind = 10001;


    MAIN_LOOP: while(count <= primeToFind){
        currentNumber++;
        for(int num : primeNumbers){
            double dividedValue = (double)currentNumber / (double)num;
            //if dividedValue is a whole number it is not prime
            if( isNumberWhole(dividedValue)){
                continue MAIN_LOOP;
            }
        }

        primeNumbers.add(currentNumber);
        count++;
    }

    System.out.println(primeNumbers.getLast());
}

public static boolean isNumberWhole(double num){
    return num % 1 == 0;
}






