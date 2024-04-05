package kz.bassina.models;

import java.util.Date;
import java.util.List;

public class Pet extends Animal {
    public Pet(String name, String type, Date birthDate, List<String> commands) {
        super(name, "pet", type, birthDate, commands);
    }

    public Pet(String name, String type, Date birthDate) {
        super(name, "pet", type, birthDate);
    }
}
