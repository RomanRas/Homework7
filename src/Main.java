public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int target = 0;
        int deposit = 15000;
        int month = 0;
        while (target < 2459000) {
            target *= 1.01;
            target += deposit;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + target + " рублей.");
        }
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        byte a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println("\n");

        //Задача 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int populationGrowth = 17;
        int populationMortality = 8;
        for (int i = 1; i <= 10; i++) {
            population += population * (populationGrowth - populationMortality) / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + population + ".");
        }
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        int vasilyDeposit = 15000;
        int vasilyMonth = 0;
        while (vasilyDeposit < 12_000_000) {
            vasilyDeposit *= 1.07;
            vasilyMonth++;
            System.out.println("Месяц " + vasilyMonth + ", сумма на счету равна " + vasilyDeposit + ".");
        }
        System.out.println("Всего месяцев: " + vasilyMonth);
        System.out.println();

        //Задача 5
        System.out.println("Задача 5");
        vasilyDeposit = 15000;
        vasilyMonth = 0;
        while (vasilyDeposit < 12_000_000) {
            vasilyDeposit *= 1.07;
            vasilyMonth++;
            if (vasilyMonth % 6 == 0) {
                System.out.println("Месяц " + vasilyMonth + ", сумма на счету равна " + vasilyDeposit + ".");
            }
        }
        System.out.println("Всего месяцев: " + vasilyMonth);
        System.out.println();

        //Задача 6
        System.out.println("Задача 6");
        vasilyDeposit = 15000;
        vasilyMonth = 0;
        while (vasilyMonth < 9 * 12) {
            vasilyDeposit *= 1.07;
            vasilyMonth++;
            if (vasilyMonth % 6 == 0) {
                System.out.println("Месяц " + vasilyMonth + ", сумма на счету равна " + vasilyDeposit + ".");
            }
        }
        System.out.println("Всего месяцев: " + vasilyMonth);
        System.out.println();

        //Задача 7
        System.out.println("Задача 7");
        int friday = 4;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо приготовить отчет.");
            friday += 7;
        }
        System.out.println();

        //Задача 8
        System.out.println("Задача 8");
        int currentYear = 2023;
        int beforeCurrentYear = currentYear - 200;
        int afterCurrentYear = currentYear + 100;
        for (int i = beforeCurrentYear; i <= afterCurrentYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}