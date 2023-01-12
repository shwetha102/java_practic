/* 4. a java Program that demonstrating the garbage collection by calling System.gc().*/

public class Demonstarting {
    public void finalize() {
        System.out.println("Garbage collected!");
    }

    public static void main(String[] args) {
        Demonstarting obj = new Demonstarting();
        obj = null; 
        System.gc(); 
    }
}


