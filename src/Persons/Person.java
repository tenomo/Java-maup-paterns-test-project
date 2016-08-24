package Persons;

import Persons.Components.Healgth;

public abstract class Person
{


    private int speed;
    private String name;
    private int lvl;
    private Character target;
    private Healgth healgth;



    public Character getTarget() {

        return target;
    }



    private void setSpeed(int speed) {
        this.speed = speed;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setTarget(Character target) {
        this.target = target;
    }

    public int getSpeed() {
    return speed;
}

    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public Healgth getHealgth() {

        return healgth;
    }
}
