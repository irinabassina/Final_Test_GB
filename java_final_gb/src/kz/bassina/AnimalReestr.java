package kz.bassina;

import kz.bassina.models.Animal;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AnimalReestr {

    private Map<String, Animal> animalMap = new HashMap<>();

    public void addAnimal(Animal animal) {
        animalMap.put(animal.getName(), animal);
    }

    public String getAllAnimalsString() {
        return animalMap.values().stream().map(Animal::toString).collect(Collectors.joining("\n"));
    }

    public Animal getAnimal(String name) {
        return animalMap.get(name);
    }

    public Animal removeAnimal(String name) {
        return animalMap.remove(name);
    }
}
