package kz.bassina.models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Animal {
    protected String name;

    protected String genus;
    protected String type;
    protected Date birthDate;


    protected List<String> commands;

    public Animal(String name, String genus, String type, Date birthDate, List<String> commands) {
        this.name = name;
        this.genus = genus;
        this.type = type;
        this.birthDate = birthDate;
        this.commands = commands;
    }

    public Animal(String name, String genus, String type, Date birthDate) {
        this.name = name;
        this.genus = genus;
        this.type = type;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        if (commands == null) {
            commands = new ArrayList<>();
        }
        commands.add(command);
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    @Override
    public String toString() {
        return String.format("род: %s, тип: %s, имя: %s, дата рождения: %s, команды: %s ",
                getGenus(), getType(), getName(), new SimpleDateFormat("yyyy-MM-dd").format(getBirthDate()), String.join(",", getCommands()));
    }

}
