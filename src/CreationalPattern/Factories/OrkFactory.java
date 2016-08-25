package CreationalPattern.Factories;

import CreationalPattern.*;
import CreationalPattern.Builders.*;
import Persons.*;


public class OrkFactory   {

    private static volatile OrkFactory _instance = null;

    private OrkFactory() {}

    public static synchronized OrkFactory getInstance() {
        if (_instance == null)
            synchronized (OrkFactory.class) {
                if (_instance == null)
                    _instance = new OrkFactory();
            }
        return _instance;
    }
    public Hunter CreateOrkHunter(int lvl) {
        return (Hunter) new HunterBuilder("Ork", lvl, 4).Build();
    }

    public Warior CreateOrkLanceKinght(int lvl) {
        return (Warior) new LanceKnightBuilder("Ork", lvl, 2);
    }

    public Warior CreateOrkKinght(int lvl) {
        return (Warior) new KnightBuilder("Ork", lvl, 2);
    }

    public Sorcerer CreateOrkFierySorcerer(int lvl) {
        return (Sorcerer) new IceSorcererBuilder("Ork", lvl, 2);
    }

    public Sorcerer CreateOrkIceSorcerer(int lvl) {
        return (Sorcerer) new FierySorcererBuilder("Ork", lvl, 2);
    }
}
