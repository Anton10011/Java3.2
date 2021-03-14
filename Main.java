public class Main {
    public static void offer(int balance, int transfer) {
        int BonusStep = 100;
        int threshold = 1000;
        if (transfer >= threshold) {
            int bonus = transfer / BonusStep;
            balance += transfer + bonus;
            System.out.println("Пополнение на " + transfer + " рублей");
            System.out.println("Отлично! Вы получили " + bonus + " бонусных рублей на свой счет.");
            System.out.println("Сумма вашего баланса " + balance + " рублей.\n");

        } else {
            balance += transfer;
            System.out.println("Пополнение на " + transfer + " рублей");
            System.out.println("Вы получаете 0 бонусов. ");
            System.out.println("Баланс вашего счета равен " + balance + " рублей. \n");
        }
    }

    public static void main(String[] args) {
        offer(100, 1100);
        offer(100, 100);
    }
}
