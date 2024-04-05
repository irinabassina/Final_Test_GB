package kz.bassina.models;

import java.util.Date;
import java.util.List;

public class Horse extends PackAnimal{

    public Horse(String name, Date birthDate, List<String> commands) {
        super(name, "horse", birthDate, commands);
    }

    public Horse(String name,Date birthDate) {
        super(name, "horse", birthDate);
    }
}
