public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
    int pinepple = 1;
    System.out.println("Значение переменной pinepple с типом инт равно "+ pinepple);
    byte apple = 120;
    System.out.println("Значение переменной apple с типом byte равно " + apple);
    short orange = 25;
    System.out.println("Значение переменной orange с типом short равно " + orange);
    long bananas = 2038;
    System.out.println("Значение переменной bananas с типом long равно " + bananas);
    float melon = 50f;
    System.out.println("Значение переменной melon с типом float равно " + melon);
    double lemon = 2.35;
    System.out.println("Значение переменной lemon с типом double равно " + lemon);
    }
    public static void task2 () {
        double a = 27.12;
        long b = 987678965549l;
        float c = 2.786f;
        short d = 569;
        int e = -159;
        short f = 27897;
        byte g = 67;
    }
    public static void task3(){
        int P = 23;
        int S = 27;
        int A = 30;
        int allStudents = P + S + A;
        System.out.println("Общее количество учеников составляет " + allStudents + " человек");
        short allPapper = 480;
        System.out.println("На каждого ученика расчитано " + allPapper / allStudents + " листов бумаги");

    }
}