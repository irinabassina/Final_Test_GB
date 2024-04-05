package kz.bassina;

import kz.bassina.models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FinalTestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AnimalReestr animalReestr = new AnimalReestr();
        try (Counter counter = new Counter()) {
            while (true) {
                System.out.println("Введите номер следующего действия.\n" +
                        "1 - Список всех животных из реестра\n" +
                        "2 - Завести новое животное\n" +
                        "3 - Список команд животного\n" +
                        "4 - Обучить животное новым командам\n" +
                        "5 - Удалить животное из реестра\n" +
                        "0 - Выход"
                );
                int mainMenuOption = Integer.parseInt(scanner.nextLine());
                switch (mainMenuOption) {
                    case 0:
                        return;
                    case 1:
                        System.out.println(animalReestr.getAllAnimalsString());
                        break;
                    case 2:
                        System.out.println("Какое животное завести:\n" +
                                "1 - Кошка\n" +
                                "2 - Собака\n" +
                                "3 - Хомяк\n" +
                                "4 - Лошадь\n" +
                                "5 - Осел\n" +
                                "6 - Верблюд\n" +
                                "0 - Возврат в основное меню");

                        int animalOption = Integer.parseInt(scanner.nextLine());
                        if (animalOption > 0 && animalOption < 7) {
                            System.out.println("Введите кличку животного:");
                            String name = scanner.nextLine();
                            System.out.println("Введите дату рождения животного в формате yyyy-MM-dd:");
                            Date birthDate = null;
                            try {
                                birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(scanner.nextLine());
                            } catch (ParseException e) {
                                System.out.println("Введена некорректная дата рождения");
                                break;
                            }
                            System.out.println("Введите список исполняемых команд животным, разделенных запятой:");
                            List<String> animalCommands = new ArrayList<>(List.of(scanner.nextLine().split(",")));
                            Animal animal = null;
                            switch (animalOption) {
                                case 1:
                                    animal = new Cat(name, birthDate, animalCommands);
                                    break;
                                case 2:
                                    animal = new Dog(name, birthDate, animalCommands);
                                    break;
                                case 3:
                                    animal = new Hamster(name, birthDate, animalCommands);
                                    break;
                                case 4:
                                    animal = new Horse(name, birthDate, animalCommands);
                                    break;
                                case 5:
                                    animal = new Donkey(name, birthDate, animalCommands);
                                    break;
                                case 6:
                                    animal = new Camel(name, birthDate, animalCommands);
                                    break;
                            }
                            animalReestr.addAnimal(animal);
                            counter.add();
                        } else if (animalOption != 0) {
                            System.out.println("Введена неверная команда, должно быть число от 0 до 6");
                        }
                        break;
                    case 3:
                        Animal animal = getAnimalFromReestr(scanner, animalReestr);
                        if (animal != null) {
                            System.out.println(String.format("Команды этого животного: %s", String.join(",", animal.getCommands())));
                        }
                        break;
                    case 4:
                        animal = getAnimalFromReestr(scanner, animalReestr);
                        if (animal != null) {
                            System.out.println("Введите новую команду, исполняемую животным:");
                            animal.addCommand(scanner.nextLine());
                        }
                        break;
                    case 5:
                        animal = getAnimalFromReestr(scanner, animalReestr);
                        if (animal != null) {
                            animalReestr.removeAnimal(animal.getName());
                            System.out.println("Животное удалено из реестра");
                        }
                        break;

                    default:
                        System.out.println("Введена неверная команда, должно быть число от 0 до 5");
                }
            }
        }
    }

    public static Animal getAnimalFromReestr(Scanner scanner, AnimalReestr reestr) {
        System.out.println("Введите кличку животного:");
        Animal animal = reestr.getAnimal(scanner.nextLine());
        if (animal == null) {
            System.out.println("Животного с такой кличкой не существует в реестре");
        }
        return animal;
    }
}
