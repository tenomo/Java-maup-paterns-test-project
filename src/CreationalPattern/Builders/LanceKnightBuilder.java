package CreationalPattern.Builders;

import Persons.Components.Healgth;
import Persons.Components.Skils.Male.HitHalebard;
import Persons.Person;
import Persons.Warior;

/**
 * Created by tenom on 25.08.2016.
 */
public class LanceKnightBuilder extends Warior implements IBuilder
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

    public LanceKnightBuilder(String name, int lvl, int speed ) {
        this.setHealgth(new Healgth(7*lvl));
        this.setSpeed(speed);
        this.setLvl(lvl);
        this.setName(name);
        this.skill = new HitHalebard(powerSkill * lvl);
    }

    public Person Build()
    {
        this.setName(name + " Lance Kinght");
        return  this;
    }
}
