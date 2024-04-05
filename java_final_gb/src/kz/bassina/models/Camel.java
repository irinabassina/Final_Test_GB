package kz.bassina.models;

import java.util.Date;
import java.util.List;

public class Camel extends PackAnimal {

    public Camel(String name, Date birthDate, List<String> commands) {
        super(name, "camel", birthDate, commands);
    }

    public Camel(String name, Date birthDate) {
        super(name, "camel", birthDate);
    }
}
