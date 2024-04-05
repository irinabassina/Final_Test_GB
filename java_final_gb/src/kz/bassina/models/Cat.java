package kz.bassina.models;

import java.util.Date;
import java.util.List;

public class Cat extends Pet {

    public Cat(String name, Date birthDate, List<String> commands) {
        super(name, "cat", birthDate, commands);
    }

    public Cat(String name, Date birthDate) {
        super(name, "cat", birthDate);
    }
}
