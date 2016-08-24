package Persons.Components.Skils.Male;

import Persons.Components.Skils.Skill;
import Persons.Person;

/**
 * Created by Вадег on 24.08.2016.
 */
public class BlowHalebard extends Skill {

    @Override
    public void Use(Person target) {
        System.out.println("Целе" + target.getName()+" нанесено " + this.power + " урона ударом меча...");
    }
}


