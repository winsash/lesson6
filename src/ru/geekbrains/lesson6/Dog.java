package ru.geekbrains.lesson6;

public class Dog extends Animal{
    private double swim_restrictions;

    public Dog(String name, String color, int age, double run_restrictions, double jump_restrictions, double swim_restrictions) {
        super(name, color, age, run_restrictions, jump_restrictions);
        this.swim_restrictions = swim_restrictions;
    }

    @Override
    public boolean run(double length) {
        boolean result;
        if (length < super.run_restrictions)
        {
            result = true;
            System.out.printf("Dog %s run %s meters. Result: %b \n", super.name, length, result);

        }
        else {
            result = false;
            System.out.printf("Run %s meters if more than restrictions %s meters. %s can't do this. Result: %b \n", length, super.run_restrictions,super.name, result);
        }
        return result;
    }

    @Override
    public boolean swim(double length) {
        boolean result;
        if (length < this.swim_restrictions)
        {
            result = true;
            System.out.printf("Dog %s swim %s meters. Result: %b \n", name, length, result);

        }
        else {
            result = false;
            System.out.printf("Swim %s meters if more than restrictions %s meters. %s can't do this. Result: %b \n", length, this.swim_restrictions,super.name, result);
        }
        return result;
    }

    @Override
    public boolean jump(double height) {
        boolean result;
        if (height < super.jump_restrictions)
        {
            result = true;
            System.out.printf("Dog %s jump %s meters. Result: %b \n", name, height, result);

        }
        else {
            result = false;
            System.out.printf("Jump %s meters if more than restrictions %s meters. %s can't do this. Result: %b \n", height, super.jump_restrictions, super.name, result);
        }
        return result;
    }
}
