/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package oop_jv_th3_3;

/**
 *
 * @author HP
 */
public class OOP_JV_TH3_4 {
    public static void main(String[] args) {
        Product p = new Product(1,1,1);
        Step s = new PreprocessingStep(11);
        s.Do(p);
        System.out.println("Color = "+p.getColor() + ",Size = "+p.getSize() + ",Price = "+p.getPrice());
        s = new ProcessingStep(22);
        s.Do(p);
        System.out.println("Color = "+p.getColor() + ",Size = "+p.getSize() + ",Price = "+p.getPrice());
        s = new PackingStep(33);
        s.Do(p);
        System.out.println("Color = "+p.getColor() + ",Size = "+p.getSize() + ",Price = "+p.getPrice());
    }
}

abstract class Step{
    private int id;

    public Step(int id) {
        this.id = id;
    }
    public abstract Product Do(Product p);
};

class Product{
    private int color;
    private int size;
    private int price;

    public Product() {
    }

    public Product(int color, int size, int price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }    
};

class PreprocessingStep extends Step{

    public PreprocessingStep(){       
    }
    public PreprocessingStep(int id) {
        super(id);
    }        
    @Override
    public Product Do(Product p) {
        p.setColor(1);
        p.setSize(p.getSize()+1);
        p.setPrice(p.getPrice()+1);
        return p;
    }   
}

class ProcessingStep extends Step{

    public ProcessingStep(int id) {
        super(id);
    }
    
    
    @Override
    public Product Do(Product p) {
        p.setColor(2);
        p.setSize(p.getSize()*2);
        p.setPrice(p.getPrice()*3);
        return p;
    }    
}

class PackingStep extends Step{

    public PackingStep(int id) {
        super(id);
    }

    @Override
    public Product Do(Product p) {
        p.setColor(3);
        p.setSize(p.getSize()+10);
        p.setPrice(p.getPrice()+20);
        return p;
    }
    
}