package coreJava;

public class number {
    
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue); 

        int myIntValue =5;
        float myFloatValue =(float) 5f;
        double myDoubleValue =5d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatvalue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);
    }
}
