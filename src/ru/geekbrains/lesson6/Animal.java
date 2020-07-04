package ru.geekbrains.lesson6;

abstract public class Animal {
    protected String name;
    protected String color;
    protected double run_restrictions;
    protected double jump_restrictions;
    protected int age;

    protected Animal(String name, String color, int age, double run_restrictions, double jump_restrictions) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.run_restrictions = run_restrictions;
        this.jump_restrictions = jump_restrictions;
    }
    abstract protected boolean run(double length);
    abstract protected boolean swim(double length);
    abstract protected boolean jump(double height);
}
