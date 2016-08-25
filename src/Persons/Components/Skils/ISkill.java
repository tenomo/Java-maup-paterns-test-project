package Persons.Components.Skils;

import Persons.Person;

/**
 * Created by Вадег on 24.08.2016.
 */
public interface ISkill {
    public  void Use(Person target);
    public void setPower(int power);
    public int getPower();
}
