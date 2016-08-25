import Persons.Hunter;
import Persons.Builders.HunterBuilder;

public class Main {

    public static void main(String[] args) {

        HunterBuilder hunterBuilder = new HunterBuilder("kelj",2,3,4);
        Hunter hunter = hunterBuilder.Build();
         hunter.getSkill().Use(hunter);
    }
}
