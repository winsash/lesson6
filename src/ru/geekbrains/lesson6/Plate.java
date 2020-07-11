package ru.geekbrains.lesson6;

public class Plate {
    private int max_capacity;
    private int capacity;

    public Plate(int capacity) {
        this.capacity = capacity;
        this.max_capacity = capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity > this.max_capacity)
        {
            this.capacity = this.max_capacity;
        }
        else {
            this.capacity = capacity;
        }
    }
    public int getCapacity() {
        return capacity;
    }
}
