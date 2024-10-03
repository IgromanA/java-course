###### Задание: Модель студента

### What is it

Программа инициализирует 2-х студентов, информацию о них: имя, ID, дата рождения, возраст, группа, средний балл и является ли он примерным студентом

### Student

Класс `Student` определяет студента со следующими атрибутами:
- `String name`: имя
- `LocalDateTime birthDate`: дата рождения
- `String group`: группа
- `int stidentID`: ID студента
- `double averageScore`: средний балл

### Constructors

`Student(String name, LocalDateTime, String group, int stidentID, double averageScore)`: конструктор, определяющий студента с переданными параметрами

### Methods

- Геттеры и сеттеры
- `getAge()`: возвращает вычисленный возраст студента в годах
- `toString`: возвращает информацию в виде одной строки
- `isExcellentStudent`: если средний балл студента >= 4.8, возвращает true, иначе - false.
