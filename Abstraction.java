abstract class Abstraction {
    abstract void start();

    
}
class car extends Abstraction{
    void start(){
        System.out.println("Car start with key");
    }
}
class scooter extends Abstraction{
    void start(){
        System.out.println("Scooter starts with Key");
    }

public static void main(String[] args) {

    car c= new car();
    scooter s=new scooter();
    c.start();
    s.start();
}
}