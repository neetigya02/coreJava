package coreJava;

public  class expression {
    public static void main(String[] args) {
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber *mySecondNumber;
        int myTotal =  myFirstNumber + mySecondNumber + myThirdNumber;
         System.out.println(myTotal);
         int myLastOne = 1000 - myTotal;
         System.out.println(myLastOne);
    }
}
