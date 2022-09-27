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
//Домашнее задание №3
        System.out.println("\nДомашнее задание №3\n");
        // Задание 1
        int humanAge = 18;
        if (humanAge >=2 && humanAge <=6) {
            System.out.println("Если возраст человека равен " + humanAge + " , то ему нужно ходить в детский сад.");
        }
        else if ( humanAge >=7 && humanAge <18) {
            System.out.println("Если возраст человека равен " + humanAge + " , то ему нужно ходить в школу.");
        }
         else if (humanAge >=18 && humanAge <24) {
            System.out.println( "Если возраст человека равен " + humanAge + " , то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + humanAge + " , то ему нужно ходить на работу");
        }
         // Задание 2
        int ageChild = 15;
         if (ageChild <= 5) {
             System.out.println("Ты не можешь кататься на аттракционе!");}
         else if (ageChild >5 && ageChild <=14) {
             System.out.println("Ты можешь кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя!");
         } else {
             System.out.println("ТЫ можешь кататься без сопровождения взрослого!");
         }
         // Задание 3
        int one = 7;
         int two = 99;
         int three = 15;
         if (one>two && one>three) {
             System.out.println(one);
         } else if (two>one && two>three) {
             System.out.println(two);
                      }
         else {
             System.out.println(three);}


    }
}