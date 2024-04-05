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
udo wget https://dev.mysql.com/get/mysql-apt-config_0.8.26-1_all.deb  

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
9. Создать таблицы с иерархией из диаграммы в БД
10. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения
11. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
12. Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице
13. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.

14. Создать класс с Инкапсуляцией методов и наследованием по диаграмме.

15. Написать программу, имитирующую работу реестра домашних животных.
В программе должен быть реализован следующий функционал:

      - завести новое животное
      - определять животное в правильный класс
      - увидеть список команд, которое выполняет животное
      - обучить животное новым командам
      - реализовать навигацию по меню
        
16. Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
значение внутренней̆ int переменной̆ на 1 при нажатии “Завести новое
животное”. Сделайте так, чтобы с объектом такого типа можно было работать в
блоке try-with-resources. Нужно бросить исключение, если работа с объектом
типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
считать в ресурсе try, если при заведения животного заполнены все поля.




