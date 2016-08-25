package CreationalPattern.Builders;

import Persons.Components.Healgth;
import Persons.Components.Skils.Magic.FireBall;
import Persons.Person;
import Persons.Sorcerer;

/**
 * Created by tenom on 25.08.2016.
 */
public class FierySorcererBuilder extends Sorcerer implements IBuilder
{

    @Override
    public void setLvl(int lvl) {
        super.setLvl(lvl);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public void setHealgth(Healgth healgth) {
        super.setHealgth(healgth);
    }

    public FierySorcererBuilder(String name, int lvl, int speed ) {
        this.setHealgth(new Healgth(5*lvl));
        this.setSpeed(speed);
        this.setLvl(lvl);
        this.setName(name);
        this.skill = new FireBall(powerSkill * lvl);
    }

    public Person Build()
    {
        this.setName(name + " Fiery Sorcerer");
        return  this;
    }
}
