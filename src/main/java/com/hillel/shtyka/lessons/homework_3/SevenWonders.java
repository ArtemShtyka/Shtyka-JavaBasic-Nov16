package com.hillel.shtyka.lessons.homework_3;

import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        double[] decLatitude = {40.416667, 30.329167, 27.171944, 41.890278, -13.163333, -22.952081, 20.683056};//Задекларував масив із довготами 7 нових чудес світу...
        double[] decLongitude = {116.083333, 35.443611, 78.041944, 12.492222, -72.545556, -43.210461, -88.568611};//...і масив із відповідними широтами (географічні координати розміщую у двох одновимірних масивах задля дотримання ТЗ)
        String[] newWondersList = {"Велика китайська стіна", "Петра", "Тадж-Махал", "Колізей", "Мачу-Пікчу", "Христос-Спаситель", "Чичен-Іца"};//Задекларував масив із переліком назв (сподіваюсь, бали не знімуться)
        Scanner input = new Scanner(System.in);//
        System.out.println("Введіть назву одного з нових чудес світу для відображення його кординат: ");
        String wonder = input.nextLine();
        String output = "Вказаної пам'ятки не знайдено";
        for(int i = 0; i < newWondersList.length; i++) {
            if (newWondersList[i].contains(wonder)) {//Порівнюю ввод користувача із назвами континентів, циклічно перераховуючи їх у попередньо задекларованому масиві
                String geoLatitude = (int) decLatitude[i] + "\u00B0" + (int) ((decLatitude[i] - (int) decLatitude[i]) * 60) + "'" + (int) (((decLatitude[i] - (int) decLatitude[i]) * 3600) - (int) ((decLatitude[i] - (int) decLatitude[i]) * 60) * 60) + "\"";//конвертую десяткові координати у географічні та у строку
                String geoLongitude = (int) decLongitude[i] + "\u00B0" + (int) ((decLongitude[i] - (int) decLongitude[i]) * 60) + "'" + (int) (((decLongitude[i] - (int) decLongitude[i]) * 3600) - (int) ((decLongitude[i] - (int) decLongitude[i]) * 60) * 60) + "\"";
                output = newWondersList[i] + ": " + geoLatitude.replace("-", "") + (decLatitude[i] >= 0 ? "N" : "S") + " " + geoLongitude.replace("-", "") + (decLongitude[i] >= 0 ? "E" : "W");//Тернарний оператор впровадив для визначення орієнтації (NSWE) за знаком ("+"/"-")
            }
        }
        System.out.println(output);
    }
}