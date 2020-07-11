package ru.geekbrains.lesson6;

import java.util.stream.StreamSupport;

public class Cat extends Animal {
    private int appetite;
    private boolean satiety;

    public Cat(String name, String color, int age, double run_restrictions, double jump_restrictions, int appetite) {
        super(name, color, age, run_restrictions, jump_restrictions);
        this.appetite = appetite;
        this.satiety = false;
    }

    @Override
    public boolean run(double length) {
        boolean result;
        if (length < super.run_restrictions)
        {
            result = true;
            System.out.printf("Cat %s run %s meters. Result: %b \n", name, length, result);

        }
        else {
            result = false;
            System.out.printf("Run %s meters if more than restrictions %s meters. %s can't do this. Result: %b \n", length, super.run_restrictions,super.name, result);
        }
        return result;
    }

    @Override
    public boolean swim(double length) {
        boolean result = false;
        System.out.printf("Cats can't swim. Result: %b \n",result);
        return result;
    }

    @Override
    public boolean jump(double height) {
        boolean result;
        if (height < super.jump_restrictions)
        {
            result = true;
            System.out.printf("Cat %s jump %s meters. Result: %b \n", name, height, result);

        }
        else {
            result = false;
            System.out.printf("Jump %s meters if more than restrictions %s meters. %s can't do this. Result: %b \n", height, super.jump_restrictions, super.name, result);
        }
        return result;
    }
    public void feedTheCat (Plate plate)
    {
        int currentCapacity = plate.getCapacity();
        if (currentCapacity > appetite)
        {
            System.out.printf("Cat %s with appttite %s ate the food from plate \n",name,appetite);
            plate.setCapacity(plate.getCapacity() - appetite);
            System.out.println("New capacity is " + plate.getCapacity());
            satiety = true;
            System.out.println("Satiety is " + satiety);
            System.out.println();
        }
        else {
            System.out.printf("Cat %s stays hungry \n",name);
            satiety = false;
            System.out.println("Satiety is " + satiety);
            System.out.println();
        }
    }
    public boolean getSatiety() {
        return satiety;
    }
}
