package Persons;

import Persons.Components.Healgth;
import Persons.Components.Skils.Skill;

public abstract class Person
{
    protected int speed;
    protected String name;
    protected int lvl;
    protected Character target;
    protected Healgth healgth;

    protected Skill skill;





    protected  void setSpeed(int speed) {
        this.speed = speed;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setLvl(int lvl) {
        this.lvl = lvl;
    }

    protected void setTarget(Character target) {
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

    public Skill getSkill() {
        return skill;
    }

    protected void setSkill(Skill skill) {
        this.skill = skill;
    }

    protected void setHealgth(Healgth healgth) {
        this.healgth = healgth;
    }

    public Character getTarget() {

        return target;
    }
}
