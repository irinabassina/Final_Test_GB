# Final_Test_GB
## Выполнение задания
1. Использование команды cat в Linux
   - Создать два текстовых файла: "Pets"(Домашние животные) и "Pack animals"(вьючные животные), используя команду `cat` в терминале Linux. В первом файле перечислить собак, кошек и хомяков. Во втором — лошадей, верблюдов и ослов.
   - Объединить содержимое этих двух файлов в один и просмотреть его содержимое.
   - Переименовать получившийся файл в "Human Friends"
     
![Image alt](https://github.com/irinabassina/Final_Test_GB/blob/main/images/image01.png)

2. Работа с директориями в Linux
   - Создать новую директорию и переместить туда файл "Human Friends".

![Image alt](https://github.com/irinabassina/Final_Test_GB/blob/main/images/image02.png)
  
3. Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину ”
   - Подключить дополнительный репозиторий MySQL и установить один из пакетов из этого репозитория.
     ![Image alt](https://github.com/irinabassina/Final_Test_GB/blob/main/images/image03.png)
     ![Image alt](https://github.com/irinabassina/Final_Test_GB/blob/main/images/image04.png)
     ![Image alt](https://github.com/irinabassina/Final_Test_GB/blob/main/images/image05.png)
     ![Image alt](https://github.com/irinabassina/Final_Test_GB/blob/main/images/image06.png)
     ![Image alt](https://github.com/irinabassina/Final_Test_GB/blob/main/images/image07.png)
     
4. Управление deb-пакетами
   - Установить и затем удалить deb-пакет, используя команду `dpkg`.
     
     ![Image alt](https://github.com/irinabassina/Final_Test_GB/blob/main/images/image08.png)
     ![Image alt](https://github.com/irinabassina/Final_Test_GB/blob/main/images/image09.png)
     
5. История команд в терминале Ubuntu
   - Сохранить и выложить историю ваших терминальных команд в Ubuntu.

### Задание 1.
cat > Pets

cat > Pack_animals

ls

cat Pets Pack_animals > Animals

ls

cat Animals

mv Animals Human_Friends

ls 

### Задание 2.
cd

sudo mkdir Zoo

ls

sudo mv Human_Friends Zoo/

ls

ls Zoo/*

### Задание 3.
sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.26-1_all.deb  

sudo dpkg -i mysql-apt-config_0.8.26-1_all.deb    

sudo apt-get update    

sudo apt-get install mysql-server

### Задание 4.
sudo wget https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb   

sudo dpkg -i docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb

sudo dpkg -r docker-ce-cli 

6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
животные и вьючные животные, в составы которых в случае домашних
животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
войдут: Лошади, верблюды и ослы).

![Image alt](https://github.com/irinabassina/Final_Test_GB/blob/main/Diagram1.drawio.png)

7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”
```sql
CREATE DATABASE IF NOT EXISTS Human_friends;
```
8. Создать таблицы с иерархией из диаграммы в БД
```sql
USE Human_friends;

DROP TABLE IF EXISTS animal_classes, pack_animals, pets, cat, dog, hamster, hors, donkey, camel, animals, young_animal;

CREATE TABLE  animal_classes

(
	Id INT AUTO_INCREMENT PRIMARY KEY, 
	Class_name VARCHAR(20)
);

INSERT INTO animal_classes (Class_name)
VALUES ('Домашние'),
('Вьючные');  

SELECT * FROM animal_classes;

CREATE TABLE pack_animals
(
	  Id INT AUTO_INCREMENT PRIMARY KEY,
    Kind_name VARCHAR (20),
    Class_id INT,
    FOREIGN KEY (Class_id) REFERENCES animal_classes (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO pack_animals (Kind_name, Class_id)
VALUES ('Лошадь', 1),
('Осел', 1),  
('Верблюд', 1); 
    
CREATE TABLE pets
(
	  Id INT AUTO_INCREMENT PRIMARY KEY,
    Kind_name  VARCHAR (20),
    Class_id INT,
    FOREIGN KEY (Class_id) REFERENCES animal_classes (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO pets (Kind_name , Class_id)
VALUES ('Кошка', 2),
('Собака', 2),  
('Хомяк', 2); 

CREATE TABLE cat 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Command VARCHAR(50),
    Kind_id int,
    Foreign KEY (Kind_id) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

```
9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения
```sql
INSERT INTO cat (Name, Birthday, Command, Kind_id)
VALUES ('Нона', '2022-02-01', 'брысь', 1),
('Серик', '2021-02-12', 'кыш', 1),  
('Рыжик', '2020-03-05', 'кискис', 1); 

CREATE TABLE dog 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Command VARCHAR(50),
    Kind_id int,
    Foreign KEY (Kind_id) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO dog (Name, Birthday, Command, Kind_id)
VALUES ('Белла', '2023-04-01', 'лежать', 2),
('Шарик', '2019-03-12', 'сидеть', 2),  
('Тузик', '2009-01-08', 'дай лапу', 2);

CREATE TABLE hamster 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Command VARCHAR(50),
    Kind_id int,
    Foreign KEY (Kind_id) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO hamster (Name, Birthday, Command, Kind_id)
VALUES ('Хома', '2023-01-02', 'ешь', 3),
('Шлёма', '2021-06-06', 'пей', 3),  
('Зубастый', '2024-01-01', 'спать', 3);

SELECT * FROM hamster;


CREATE TABLE hors
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Command VARCHAR(50),
    Kind_id int,
    Foreign KEY (Kind_id) REFERENCES pack_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO hors (Name, Birthday, Command, Kind_id)
VALUES ('Пегас', '2015-02-03', 'нооо поехали', 1),
('Абсент', '2019-04-11', "пррр стоять", 1),  
('Ласточка', '2013-08-01', "але гоп", 1);

CREATE TABLE donkey 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Command VARCHAR(50),
    Kind_id int,
    Foreign KEY (Kind_id) REFERENCES pack_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO donkey (Name, Birthday, Command, Kind_id)
VALUES ('Иа', '2014-05-09', 'пошел', 2),
('Миша', '2024-01-01', 'стоп', 2),  
('Лёша', '2021-07-12', 'фас', 2);

SELECT * FROM donkey;

CREATE TABLE camel 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Command VARCHAR(50),
    Kind_id int,
    Foreign KEY (Kind_id) REFERENCES pack_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO camel (Name, Birthday, Command, Kind_id)
VALUES ('Кеша', '2023-01-10', 'пошел', 3),
('Азамат', '2017-02-09', 'стоп', 3),  
('Мося', '2011-01-11', 'вниз', 3); 

SELECT * FROM camel;
```
10. Удалить из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади и ослы в одну таблицу.
```sql
SET SQL_SAFE_UPDATES = 0;
DELETE FROM camel;

SELECT Name, Birthday, Command FROM hors
UNION SELECT  Name, Birthday, Command FROM donkey;
```
11. Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице
```sql
CREATE TEMPORARY TABLE animals AS 
SELECT *, 'Лошади' as kind FROM hors
UNION SELECT *, 'Ослы' AS kind FROM donkey
UNION SELECT *, 'Собаки' AS kind FROM dog
UNION SELECT *, 'Кошки' AS kind FROM cat
UNION SELECT *, 'Хомяки' AS kind FROM hamster;

CREATE TABLE young_animal AS
SELECT Name, Birthday, Command, kind, TIMESTAMPDIFF(MONTH, Birthday, CURDATE()) AS Age_in_month
FROM animals WHERE Birthday BETWEEN ADDDATE(curdate(), INTERVAL -3 YEAR) AND ADDDATE(CURDATE(), INTERVAL -1 YEAR);
 
SELECT * FROM young_animal;
```
![Image alt](https://github.com/irinabassina/Final_Test_GB/blob/main/images/image10.png)

12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.
``` sql
SELECT h.Name, h.Birthday, h.Command, pa.Kind_name, ya.Age_in_month 
FROM hors h
LEFT JOIN young_animal ya ON ya.Name = h.Name
LEFT JOIN pack_animals pa ON pa.Id = h.Kind_id
UNION 
SELECT d.Name, d.Birthday, d.Command, pa.Kind_name, ya.Age_in_month 
FROM donkey d 
LEFT JOIN young_animal ya ON ya.Name = d.Name
LEFT JOIN pack_animals pa ON pa.Id = d.Kind_id
UNION
SELECT c.Name, c.Birthday, c.Command, p.Kind_name, ya.Age_in_month 
FROM cat c
LEFT JOIN young_animal ya ON ya.Name = c.Name
LEFT JOIN pets p ON p.Id = c.Kind_id
UNION
SELECT d.Name, d.Birthday, d.Command, p.Kind_name, ya.Age_in_month 
FROM dog d
LEFT JOIN young_animal ya ON ya.Name = d.Name
LEFT JOIN pets p ON p.Id = d.Kind_id
UNION
SELECT hm.Name, hm.Birthday, hm.Command, p.Kind_name, ya.Age_in_month 
FROM hamster hm
LEFT JOIN young_animal ya ON ya.Name = hm.Name
LEFT JOIN pets p ON p.Id = hm.Kind_id;
```

13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме.

14. Написать программу, имитирующую работу реестра домашних животных.
В программе должен быть реализован следующий функционал:

      - завести новое животное
      - определять животное в правильный класс
      - увидеть список команд, которое выполняет животное
      - обучить животное новым командам
      - реализовать навигацию по меню
        
15. Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
значение внутренней̆ int переменной̆ на 1 при нажатии “Завести новое
животное”. Сделайте так, чтобы с объектом такого типа можно было работать в
блоке try-with-resources. Нужно бросить исключение, если работа с объектом
типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
считать в ресурсе try, если при заведения животного заполнены все поля.

Решение к заданиям 13-15 в [программном коде](https://github.com/irinabassina/Final_Test_GB/tree/main/java_final_gb/src/kz/bassina)


