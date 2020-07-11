package ru.geekbrains.lesson6;

public class Main {

    public static void main(String[] args) {
        Cat catBarsik = new Cat("Barsik","Black", 3, 200, 2);
        doAllMethods(catBarsik,100.2,1.5);
        System.out.println();
        Cat catMurzik = new Cat("Murzik","White", 2,150.5, 1.5);
        doAllMethods(catMurzik,300,20.5);
        System.out.println();
        Dog dogTuzik = new Dog("Tuzik","Grey",5,400,2,10);
        doAllMethods(dogTuzik,300,7.5,1.2);
        System.out.println();
        Dog dogBelka = new Dog("Belka","Orane",6,350,1.7,7);
        doAllMethods(dogBelka,400,20,10);
    }
    public static void doAllMethods (Cat cat, double run_meters, double jump_meters){
        cat.run(run_meters);
        cat.swim(0);
        cat.jump(jump_meters);
    }
    public static void doAllMethods (Dog dog, double run_meters, double swim_meters, double jump_meters){
        dog.run(run_meters);
        dog.swim(swim_meters);
        dog.jump(jump_meters);
    }
}
