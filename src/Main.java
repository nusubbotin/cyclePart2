public class Main {
    public static void main(String[] args) {
        //Домашнее задание -3. Задача 2
        int addSummMoney = 29000;
        float accumMoney = 0;
        System.out.println("Задание 9: ");
        for (int i = 1; i <= 12 ; i++){

            accumMoney = accumMoney * 1.12f + addSummMoney;
            System.out.println("Месяц "+ i +", сумма накоплений равна "+ accumMoney +" рублей");
        }

    }
}