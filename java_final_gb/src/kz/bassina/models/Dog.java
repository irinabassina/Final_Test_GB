package kz.bassina.models;

import java.util.Date;
import java.util.List;

public class Dog extends Pet {

    public Dog(String name, Date birthDate, List<String> commands) {
        super(name, "dog", birthDate, commands);
    }

    public Dog(String name, Date birthDate) {
        super(name, "dog", birthDate);
    }
}
