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
        }
        // 3
        {
            int totalPeople = 12_000_000;
            int birthrate = (totalPeople / 1000) * 17;
            int mortality = (totalPeople / 1000) * 8;
            int year = 0;
            while (year < 10) {

            }
        }
        // ДЗ 2
        // 1
        {

        }
    }
}
