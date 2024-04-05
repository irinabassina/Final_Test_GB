package kz.bassina.models;

import java.util.Date;
import java.util.List;

public class PackAnimal extends Animal {
    public PackAnimal(String name, String type, Date birthDate, List<String> commands) {
        super(name, "pack_animal", type, birthDate, commands);
    }

    public PackAnimal(String name, String type, Date birthDate) {
        super(name, "pack_animal", type, birthDate);
    }
}
