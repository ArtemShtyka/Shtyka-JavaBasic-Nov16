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