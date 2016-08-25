package Persons.Components.Skils.Male;

import Persons.Components.Skils.ISkill;
import Persons.Person;

/**
 * Created by Вадег on 24.08.2016.
 */
public class HitHalebard implements ISkill {

    int power = 0;

    public HitHalebard(int power ) {
        this.power = power;
    }
    @Override
    public void setPower(int power) {
        power = power;
    }

    @Override
    public int getPower() {
        return power;
    }
    @Override
    public void Use(Person target) {
        System.out.println("Целе " + target.getName()+" нанесено " + this.power + " урона ударом меча...");
    }
}


