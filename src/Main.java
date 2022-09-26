public class Main {
    public static void main(String[] args) {
//Домашнее задание №1
        System.out.println("Домашнее задание №1\n");
        // Задание 1
        int  age =13;
        if (age >= 18) {
            System.out.println("Дорогой друг! Рады поздравить тебя с твоим совершеннолетием!");
        }
        if ( age < 18) {
            System.out.println("Дорогой друг, возраст совершеннолетия ещё не наступил. Нужно немного подождать:(");
        }
        // Задание 2
        int agePerson = 23;
        if ( agePerson >=7 )
        if (agePerson < 18){
            System.out.println("Пора в школу!");
        }
        if (agePerson >= 18)
        if (agePerson < 24){
            System.out.println("Пора в университет!");
        }
        if (agePerson >= 24) {
            System.out.println("Пора на работу!");
        }
        // Задание 3
        int passengers = 59;
        if (passengers < 60) {
            System.out.println("В вагоне есть сидячие и стоячие места"); }
        if (passengers >= 60)
            if (passengers < 102) {
                System.out.println("В вагоне только стоячие места"); }
        if (passengers >= 102) {
            System.out.println("В вагоне нет мест"); }


 //Домашнее задание №2
        System.out.println("\nДомашнее задание №2\n");
        // Задание 1
        int  ageHuman =18;
        if (ageHuman >= 18) {
            System.out.println("Дорогой друг! Рады поздравить тебя с твоим совершеннолетием!");
        }
        else  {
            System.out.println("Дорогой друг, возраст совершеннолетия ещё не наступил. Нужно немного подождать:(");
        }
        // Задание 2
        int ageMan = 18;
        if ( ageMan >=7 )
            if (ageMan < 18){
                System.out.println("Пора в школу!");
            }
        if (ageMan >= 18)
            if (ageMan < 24){
                System.out.println("Пора в университет!");
            }
        else {
            System.out.println("Пора на работу!");
        }
        // Задание 3
        int passengersWagon = 59;
        if (passengersWagon < 60) {
            System.out.println("В вагоне есть стоячие и сидячие места"); }
        if (passengersWagon >= 60)
        if (passengersWagon < 102){ System.out.println("В вагоне только стоячие места"); }
        else {
            System.out.println("В вагоне нет мест"); }





    }
}