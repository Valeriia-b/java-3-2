public class MobileBonus {
    public static void main(String[] args) {
        double currentbalance = 100.00; //текущий баланс
        double bonus = 100.00; // цена одного бонуса
        double depositamount = 10.00; // сумма пополнения
        int amountbonus;// итоговая сумма бонусов в целых
        if (depositamount >= 1000.00) {
            amountbonus = (int)(depositamount / bonus);
        } else{
            amountbonus = 0;
        }
       System.out.println(amountbonus);
    }
}