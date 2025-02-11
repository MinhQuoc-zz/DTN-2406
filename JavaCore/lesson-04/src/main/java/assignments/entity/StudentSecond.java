package assignments.entity;

import interfacedemo.entity.Person;

public abstract class StudentSecond extends Person implements iStudy ,iPerson{
    public StudentSecond(String name, int age) {
        super(name, age);
    }

    @Override
    public void doHomeWork() {

    }

    @Override
    public void run() {

    }
}
