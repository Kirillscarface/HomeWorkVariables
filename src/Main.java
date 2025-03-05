public class Main {
    public static void main(String[] args) {
        // задание 1
        int apple = 1000000;
        byte orange = 125;
        short banana = 15400;
        long plum = 3000000L;
               System.out.println("Значение переменной apple с типом int равно " + apple);
               System.out.println("Значение переменной orange с типом byte равно " + orange);
               System.out.println("Значение переменной banana с типом short равно " + banana);
               System.out.println("Значение переменной plum с типом long равно " + plum);

        // Задание 2
        double a = 27.12;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

        //Задание 3
        int ludmilaStudents = 23;
        int annaStudents = 27;
        int ekaterinaStudents = 30;
        int totalStudents = ludmilaStudents + annaStudents + ekaterinaStudents;
        int totalSheets = 480;
        double sheetsPerStudent = totalSheets / totalStudents ;
        System.out.printf("На каждого ученика рассчитано" + sheetsPerStudent + " листов бумаги");

        //Задание 5
        byte totalCans = 120;
        byte whiteCansPerClassroom = 2;
        byte brownCansPerClassroom = 4;
        int totalCansPerClassroom = whiteCansPerClassroom + brownCansPerClassroom;
        int numClassrooms = totalCans / totalCansPerClassroom;
        int whiteCans = numClassrooms * whiteCansPerClassroom;
        int brownCans = numClassrooms * brownCansPerClassroom;
                 System.out.println("В школе, где " + numClassrooms + " классов, нужно " + whiteCans +
                " банок белой краски и " + brownCans + " банок коричневой краски");

           //Задание 4
        byte bottles2Minutes= 16;
        int bottleMinute = bottles2Minutes /2; // посчитали сколько бутылок производиться в 1 минуту.
        int time20Minute = 20;
        int production20Minute = bottleMinute * time20Minute; // бутылок за 20 минут
        byte hoursDay = 24;
        int minuteDay = hoursDay * 60;
        int productionDay = bottleMinute * minuteDay; // бутылок за одни сутки
        byte days3 = 3;
        int productions3Day = productionDay * days3; // бутылок за 3 дня
        byte daysMonth = 30;
        int productionMonth = productionDay * daysMonth; // бутылок за месяц.
               System.out.println("За 20 минут машина произвела " + production20Minute + " штук бутылок");
               System.out.println("За сутки машина произвела " + productionDay + " штук бутылок");
               System.out.println("За 3 дня машина произвела " + productions3Day + " штук бутылок");
               System.out.println("За 1 месяц машина произвела " + productionMonth + " штук бутылок");

               //Задача 6
        short bananas = 5;
        byte bananaWeightGrams = 80;
        int milkMl = 200;
        byte milkWeightPer100ml = 105;
        byte iceCream = 2;
        byte iceCreamWeightGrams = 100;
        byte eggs = 4;
        byte eggWeightGrams = 70;

        int totalBananaWeight = bananas * bananaWeightGrams;
        int totalMilkWeight = (milkMl / 100) * milkWeightPer100ml;
        int totalIceCreamWeight = iceCream * iceCreamWeightGrams;
        int totalEggWeight = eggs * eggWeightGrams;
        int totalWeightGrams = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggWeight;
        double totalWeightKilograms = totalWeightGrams / 1000.0;
               System.out.println("Вес завтрака: " + totalWeightGrams + " грамм");
               System.out.println("Вес завтрака: " + totalWeightKilograms + " килограмм");


        //Задача 7
        short weightLoseKg = 7;
        double weightLoseGrams = weightLoseKg * 1000;
        float dailyLoss250Grams = 250;
        float dailyLoss500Grams = 500;
        double daysLose250 = weightLoseGrams / dailyLoss250Grams;
        double daysLose500 = weightLoseGrams / dailyLoss500Grams;
        double averageDays = (daysLose250 + daysLose500) / 2;
        System.out.println("Количество дней для похудения при потере 250 грамм в день: " + daysLose250);
        System.out.println("Количество дней для похудения при потере 500 грамм в день: " + daysLose500);
        System.out.println("Среднее колличество дней для похудения: " + averageDays);

        //Задача 8
        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;
        double increasePercentage = 0.1;
        double IncreasePercentageMashaSalary = mashaSalary * increasePercentage;
        double IncreasePercentageDenisSalary = denisSalary * increasePercentage;
        double IncreasePercentageKristinaSalary = kristinaSalary * increasePercentage;

        double newSalaryMasha = mashaSalary + IncreasePercentageMashaSalary;
        double newSalaryDenis = denisSalary + IncreasePercentageDenisSalary;
        double newSalaryKristina = kristinaSalary + IncreasePercentageKristinaSalary;

        double mashaMonthlyDifference = newSalaryMasha - mashaSalary;
        double mashaAnnualDifference = mashaMonthlyDifference * 12;
        double denisMonthlyDifference = newSalaryDenis - denisSalary;
        double denisAnnualDifference = denisMonthlyDifference *12;
        double kristinaMonthlyDifference = newSalaryKristina - kristinaSalary;
        double kristinaAnnualDifference = kristinaMonthlyDifference *12;

        System.out.println("Маша теперь получает " + newSalaryMasha + " Рублей.Годовой доход вырос на " +
                mashaMonthlyDifference);
        System.out.println("Денис теперь получает " + newSalaryDenis + " Рублей.Годовой доход вырос на " +
                denisMonthlyDifference);
        System.out.println("Кристина теперь получает " + newSalaryKristina + " Рублей.Годовой доход вырос на " +
                kristinaMonthlyDifference);







    }
}