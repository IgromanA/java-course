###### Задание: Автомобиль

### What is it

Программа инициализирует машину с двигателем и пассиажирами внутри

### Car

Класс `Car` определяет автомобиль с атрибутами:
- `String model`: марка автомобиля
- `Engine engine`: мощность двигателя
- `Passenger passenger1`: пассажир 1
- `Passenger passenger2`: пассажир 2

### Constructor

`Car(String model, Engine engine)`: конструктор определяет автомобиль с переданными параметрами

### Methods

- `addPassenger(Passenger passenger)`: Добавление пассажира в автомобил
- `removePassenger(Passenger passenger)`: Удаление пассажира из автомобиля
- `toString()`: Возвращение информации в строке

---

### Passenger

Класс `Passenger` определяет пассажира с атрибутом:
- `String name`: имя пассажира

### Constructor

`Passenger(String name)`: конструктор определяет пассажира с переданным параметром

### Methods

- Геттер и сеттер

---

### Engine

Класс `Engine` определяет двигатель автомобиля с атрибутом:
- `int power`: мощность двигателя

### Constructor

`Engine(int power)`: конструктор определяет двигатель автомобиля с переданным атрибутом

### Methods

- Геттер и сеттер
