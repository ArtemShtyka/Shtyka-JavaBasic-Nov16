package com.hillel.shtyka.lessons.homework_14;

public class Tracker {

    private final String name;
    private String surname;//non-final
    private final int birthDate;
    private int age;
    public int weight;//non-final
    public int bloodPressure;//non-final
    public int pedometer;//non-final
    private final String email;
    private final String phoneNumber;

    public Tracker(String name, String surname, int birthDate, int weight, int bloodPressure, int pedometer, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.pedometer = pedometer;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public int getBirthDate() {
        return birthDate;
    }
    public int getAge() {                                                                                               //Пункт 6.1 ДЗ
        return 2020 - birthDate;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setSurname(String input) {                                                                              //Типу сеттер
        this.surname = input;
    }
    public String printAccountInfo() {
        return "Name: " + getName()/*типу зрозумів, як це працює*/ + "; surname: " + surname/*далі так простіше*/
                + "; year of birth: " + birthDate + "; age: " + getAge() + "; weight: " + weight
                + " kg; blood pressure: " + bloodPressure + " mmHg; steps walked today: " + pedometer
                + " e-mail: " + email + "; phone number: " + phoneNumber;
    }
    //Сподіваюсь, що я не повинен був декларувати геттери та сеттери для всіх атрибут (таке ТЗ). Як працюють останні - зрозуміло.
}

/*
    Зробіть програму для фітнес трекера, яка реєструватиме нового користувача створюючи йому обліковий запис, приймаючи
наступні параметри:

    Незмінні (задаються тільки при створенні облікового запису, і можуть бути отримані лише за допомогою гетерів):
    Ім'я
    Дата народження (окремо день, місяць, рік)
    Емейл
    Телефон

    Змінювані:
    Прізвище
    Вага
    Тиск
    Кількість пройдених за день кроків

    Створювати кожного користувача необхідно через конструктор, беручи всі поля на вхід конструктора.
    Додати метод printAccountInfo(), при виклику якого друкувати всі дані про користувача.
    Після прийому року народження - вираховувати вік користувача у внутрішню змінну age (відштовхуючись просто
від 2020 року, ускладнювати тут не будемо), на яку зробити тільки геттер і виводити на екран разом з іншими полями
в методі printAccountInfo(); у конструкторі або геттерах/сеттерах не використовуємо виведення в консоль.
    У main-класі створити 3-5 користувачів та роздрукувати дані кожного через виклик методу printAccountInfo();
для двох користувачів змінити кілька полів та роздрукувати нові дані повторно
 */
