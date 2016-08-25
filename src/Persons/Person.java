package Persons;

import Persons.Components.Health;
import Persons.Components.Skils.ISkill;

public abstract class Person
{
    protected int speed;
    protected String name;
    protected int lvl;
    protected Person target;
    protected Health health;

    protected ISkill skill;





    protected  void setSpeed(int speed) {
        this.speed = speed;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setLvl(int lvl) {
        this.lvl = lvl;
    }

    protected void setTarget(Person target) {
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

    public Health getHealth() {

        return health;
    }

    public ISkill getSkill() {
        return skill;
    }

    protected void setSkill(ISkill skill) {
        this.skill = skill;
    }

    protected void setHealth(Health health) {
        this.health = health;
    }

    public Person getTarget() {

        return target;
    }
}
