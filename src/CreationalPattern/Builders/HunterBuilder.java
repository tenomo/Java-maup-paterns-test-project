package CreationalPattern.Builders;

import Persons.Components.Health;
import Persons.Components.Skils.Archer.Shoot;
import Persons.Hunter;
import Persons.Person;

/**
 * Created by tenom on 25.08.2016.
 */
public class HunterBuilder extends Hunter implements IBuilder
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
    public void setHealth(Health health) {
        super.setHealth(health);
    }

    public HunterBuilder(String name, int lvl, int speed ) {
        this.setHealth(new Health(5*lvl));
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
