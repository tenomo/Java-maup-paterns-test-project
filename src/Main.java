import CreationalPattern.Builders.HunterBuilder;
import CreationalPattern.Builders.IceSorcererBuilder;
import CreationalPattern.Factories.OrkFactory;
import Persons.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

         List<Person> orks = new ArrayList();
        OrkFactory orkFactory = (OrkFactory) OrkFactory.
                getInstance();
        orks.add(orkFactory.CreateOrkFierySorcerer(1));
        orks.add(orkFactory.CreateOrkHunter(1));
        orks.add(orkFactory.CreateOrkHunter(1));
        orks.add(orkFactory.CreateOrkIceSorcerer(1));
        orks.add(orkFactory.CreateOrkKinght(1));
        orks.add(orkFactory.CreateOrkKinght(1));
        orks.add(orkFactory.CreateOrkKinght(1));
        orks.add(orkFactory.CreateOrkKinght(1));
        orks.add(orkFactory.CreateOrkKinght(1));
        orks.add(orkFactory.CreateOrkLanceKinght(1));
        orks.add(orkFactory.CreateOrkLanceKinght(1));


        Person player = new IceSorcererBuilder("Kelj",10,2).Build();

        for (Person person: orks
             )
        {
         person.getSkill().Use(player);
        }
    }
}
