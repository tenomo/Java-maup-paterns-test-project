package CreationalPattern.Builders;

import Persons.Components.Health;
import Persons.Components.Skils.Male.HitSword;
import Persons.Person;
import Persons.Warior;

/**
 * Created by tenom on 25.08.2016.
 */
public class KnightBuilder extends Warior implements IBuilder
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

    public KnightBuilder(String name, int lvl, int speed ) {
        this.setHealth(new Health(7*lvl));
        this.setSpeed(speed);
        this.setLvl(lvl);
        this.setName(name);
        this.skill = new HitSword(powerSkill * lvl);
    }

    public Person Build()
    {
        this.setName(name + " Kinght");
        return  this;
    }
}
