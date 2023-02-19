public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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
    public static void task4(){
        int bottleInTwoMinutes = 16;
        int bottleInOneMinute = bottleInTwoMinutes / 2;
        System.out.println("За одну минуту производство изготавливает " + bottleInOneMinute + " бутылок");
        int bottleInTwentyMinutes = bottleInOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottleInTwentyMinutes + " штук бутылок");
        int minutesInOneDay = 60 * 24;
        int bottleInDay = bottleInOneMinute * minutesInOneDay;
        System.out.println("За сутки машина произвела " + bottleInDay + " штук бутылок");
        int bottleInThreeDays = bottleInDay * 3;
        System.out.println("За трое суток машина произвела " + bottleInThreeDays + " штук бутылок");
        int bottleInMounth = bottleInDay * 30;
        System.out.println("За месяц машина производит " + bottleInMounth + " штук бутылок");
    }
    public static void task5(){
        int allJars = 120;
        int whiteColor = 2;
        int brownColor = 4;
        int colorInOneRoom = whiteColor + brownColor;
        int allRooms = allJars / colorInOneRoom;
        int allWhiteColor = whiteColor * allRooms;
        int allBrownColor = brownColor * allRooms;
        System.out.println("В школе, где " + allRooms + " классов, нужно " + allWhiteColor + " банок белой краски и "
                + allBrownColor + " банок коричневой краски.");
    }
    public static void task6(){
        int banans = 5;
        int milk = 2;
        int iceCream = 2;
        int eggs = 4;
        short oneBanansWeight = 80;
        short oneMilkWeight = 105;
        short oneIceCreamWeight = 100;
        short oneEggWeight = 70;
        int allBanansWeight = oneBanansWeight * banans;
        int allMilkWeight = oneMilkWeight * milk;
        int allIceCreamWeight = oneIceCreamWeight * iceCream;
        int allEggsWeight = oneEggWeight * eggs;
        int allBreakfestWeightInGramms = allBanansWeight + allEggsWeight + allMilkWeight + allIceCreamWeight;
        float allBreakfestWeightInKilograms = allBreakfestWeightInGramms / 1000f;
        System.out.println("Вес завтрака спортсмена в граммах составит " + allBreakfestWeightInGramms + " грамм.");
        System.out.println("Вес завтра спортсмена в килограммах составит " + allBreakfestWeightInKilograms
                + " киллограмм");
    }
}