package Persons.Builders;

import Persons.Components.Healgth;
import Persons.Components.Skils.Archer.Shoot;
import Persons.Hunter;
import Persons.Person;

/**
 * Created by tenom on 25.08.2016.
 */
public class LanceKnight extends Hunter
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

    public LanceKnight(String name, int lvl, int speed, int helgthPoins) {
        this.setHealgth(new Healgth(helgthPoins));
        this.setSpeed(speed);
        this.setLvl(lvl);
        this.setName(name);
        this.skill = new Shoot(powerSkill * lvl);
    }

    public Person Build()
    {
        this.setName(name + " Hunter");
        return  this;
    }
}
