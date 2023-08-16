package afs.training.oo;

public class Vehicle {
    protected final String name;
    protected int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp(int acceleration) {
        speed = speed + acceleration;
        System.out.printf("%s: speed up to %d km/h", name, speed);
    }
}
