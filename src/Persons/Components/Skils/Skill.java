package Persons.Components.Skils;

import Persons.Person;

/**
 * Created by Вадег on 24.08.2016.
 */
public abstract class Skill {

    abstract public  void Use(Person target);

     protected void setPower(int power) {
        this.power = power;
    }

    public int getPower() {

        return power;
    }

    protected int power = 0;
}
