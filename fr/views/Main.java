package efrei.fr.views;

import efrei.fr.domain.Name;
import efrei.fr.domain.Race;
import efrei.fr.factory.NameFactory;
import efrei.fr.factory.RaceFactory;
import efrei.fr.repository.RaceRepository;

public class Main {
    public static RaceRepository repository = RaceRepository.getRepository();

    public static void loadObject(RaceRepository repository){
        Race race1 = RaceFactory.createRace("Indian");
        Race race2 = RaceFactory.createRace("White");
        Race race3 = RaceFactory.createRace("SpaceMan");
        repository.create(race1);
        repository.create(race2);
        repository.create(race3);
    }

    public static void main(String[] args) {
        RaceRepository repository = RaceRepository.getRepository();
        loadObject(repository);
        System.out.println(repository.getAll());

        Name name1 = NameFactory.createName("Sam", "Pondevie");
        Name name2 = NameFactory.createName("Emma", "Simone", "Deste");
        Name name3 = NameFactory.createName("Kruben", "Naidoo");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
