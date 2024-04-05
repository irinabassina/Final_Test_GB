package kz.bassina.models;

import java.util.Date;
import java.util.List;

public class Hamster extends Pet {

    public Hamster(String name, Date birthDate, List<String> commands) {
        super(name, "hamster", birthDate, commands);
    }

    public Hamster(String name, Date birthDate) {
        super(name, "hamster", birthDate);
    }
}
