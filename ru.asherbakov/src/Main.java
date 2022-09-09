public class Main {
    public static void main(String[] args) {
        // ДЗ 1
        // 1
        {
            int salary = 29000;
            int total = 0;
            int iter = 0;
            while (total <= 2_459_000) {
                total += total/100;
                total += salary;
                iter++;
                System.out.println(String.format("Месяц %d , сумма накоплений равна %d рублей", iter, total));
            }
        }
        // 2
        {
            int i = 1;
            while (i <= 10) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
            for (; i != 1; ) {
                i--;
                System.out.print(i + " ");
            }
            System.out.println();
        }
        // 3
        {
            int totalPeople = 12_000_000;
            int birthrate = (totalPeople / 1000) * 17;
            int mortality = (totalPeople / 1000) * 8;
            int year = 1;
            while (year <= 10) {
                totalPeople = totalPeople + birthrate - mortality;
                System.out.println(String.format("Год %s, численность населения составляет %s", year, totalPeople));
                year++;
            }
        }
        // ДЗ 2
        // 1
        {
            int sumPayment = 15000;
            int month = 0;
            while (sumPayment <= 12_000_000) {
                month++;
                sumPayment += sumPayment / 100 * 7;
                System.out.println(String.format("Месяц %s, сумма накоплений: %s", month, sumPayment));
            }
        }
        // 2
        {
            int sumPayment = 15000;

            for (int month = 1; sumPayment < 12_000_000; month++) {
                sumPayment += sumPayment / 100 * 7;
                if (month % 6 == 0) {
                    System.out.println(String.format("Месяц %s, сумма накоплений: %s", month, sumPayment));
                }
            }
        }
        // 3
        {
            int sumPayment = 15000;

            for (int month = 1; month <= 108; month++) {
                sumPayment += sumPayment / 100 * 7;
                if (month % 6 == 0) {
                    System.out.println(String.format("Месяц %s, сумма накоплений: %s", month, sumPayment));
                }
            }
        }
        // 4
        {
            int day = 3;
            for (int i = day; i <= 31; i += 7) {
                System.out.println(String.format("Сегодня пятница, %s-е число. Необходимо подготовить отчет.", i));
            }
        }
        // ДЗ 3
        // 1
        {
            int year = 2022;
            int yearBefore = year - 200;
            int yearAfter = year + 100;
            for (int i = yearBefore; i <= yearAfter; i++) {
                if (i % 79 == 0) {
                    System.out.println(i);
                }
            }
        }
        // 2
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " * 2 = " + i*2);
            }
        }
    }
}
