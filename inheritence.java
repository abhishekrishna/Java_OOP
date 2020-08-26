public class Vehicle {
    public int wheels() {
        return 4;
    }
    public void go() {
        System.out.println("zoom!");
    }
 }


 public class Motorcycle extends Vehicle {
     @Oveeride
     public int wheels() {
         return 2;
     }
 }