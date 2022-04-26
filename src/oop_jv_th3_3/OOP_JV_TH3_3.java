/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package oop_jv_th3_3;

/**
 *
 * @author HP
 */
public class OOP_JV_TH3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Machine m = new DisplayMachine("55in","RED", "Sony", "Black", 2022);
        m.start();
        m.stop();
        m = new FlyMachine(5000, 20000, "YAMAHA", "Black", 1945);
        m.start();
        m.stop();
        FlyMachine airbus = new FlyMachine(10000,120,"Airbus","300",2020);
        airbus.fly();
        DisplayMachine m2 = new DisplayMachine("995in","BLUE", "Mavel", "Green", 2025);
        System.out.println(DisplayMachine.getCount());
    }
    
}

abstract class Machine{
    private String brand;
    private String size;
    private int year;

    public Machine() {
    }

    public Machine(String brand, String size, int year) {
        this.brand = brand;
        this.size = size;
        this.year = year;
    }
    
    abstract public void start();
    abstract public void stop();
};
class DisplayMachine extends Machine{

    private String screen;
    private String color;
    static int count;

    public DisplayMachine() {
        count++;
    }

    public DisplayMachine(String screen, String color, String brand, String size, int year) {
        super(brand, size, year);
        this.screen = screen;
        this.color = color;
        count++;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    
    public static int getCount()
    {
        return count;
    }
    
    @Override
    public void start() {
        System.out.println("Machine is started");
    }

    @Override
    public void stop() {
        System.out.println("Machine is stopped");
    }

};
interface FlyOperation{
    void fly();
};
class FlyMachine extends Machine implements FlyOperation{

    private int ceiling;
    private int velocity;

    public FlyMachine() {
    }

    public FlyMachine(int ceiling, int velocity, String brand, String size, int year) {
        super(brand, size, year);
        this.ceiling = ceiling;
        this.velocity = velocity;
    }
    
    @Override
    public void start() {
        System.out.println("FlyMachine is started");
    }

    @Override
    public void stop() {
        System.out.println("FlyMachine is stopped");
    }

    @Override
    public void fly() {
        System.out.println("FlyMachine is flying");
    }
    
};
