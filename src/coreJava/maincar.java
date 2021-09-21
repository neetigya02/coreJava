package coreJava;

public class maincar
 {
    public static void main(String[] args) {
        Car porshe = new Car(null, null, 0, 0, 0, false);
        Car holden = new Car(null, null, 0, 0, 0, false);
        porshe.setModel("911");
        System.out.println("Model is " + porshe.getModel());
    }
    
}
