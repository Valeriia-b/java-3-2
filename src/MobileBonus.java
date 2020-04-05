public class MobileBonus {
    public static void main(String[] args) {
        double currentbalance = 100.00; //текущий баланс
        double bonus = 100.00; // цена одного бонуса
        double depositamount = 10.00; // сумма пополнения
        if (depositamount >= 1000.00) {
            bonus = depositamount / bonus;
        } else{
            bonus = 0;
        }
       System.out.println(bonus);
    }
}