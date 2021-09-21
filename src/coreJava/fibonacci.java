package coreJava;

public class fibonacci {
    public static void main(String[] args) {
        
    
    double n1 = 0, n2 = 1, n3, i, count = 100;
    
    for(i=2; i< count; ++i)
    {
        n3= n1 + n2 ;
        System.out.println(""+ n3);
        n1 = n2;
        n2 = n3;
    }
}
}
