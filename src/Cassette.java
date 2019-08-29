import currency.Currency;

import java.util.Arrays;


public class Cassette {
    private Currency currency;
    private int amountAvailableMoney;
    private int[] nominal;

    public Cassette(Currency currency, int amountAvailableMoney, int[] nominal) {
        this.currency = currency;
        this.amountAvailableMoney = amountAvailableMoney;
        this.nominal = nominal;
    }


    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getMoney(int withdrawalSum) {
        int sum = withdrawalSum;
        if (sum <= this.amountAvailableMoney) {
            StringBuilder resultBanknots = new StringBuilder();
            Arrays.sort(nominal); //сортируем массив номиналов

            for (int i = nominal.length - 1; i > 0; i--) {
                while (sum - nominal[i] >= 0) { //отнимаем от суммы один и тот же элемент массива до тех пор, пока результат положительный
                    sum -= nominal[i];
                    resultBanknots.append(nominal[i] + ", "); //в строку записываем перечисление выданых номиналов через запятую
                }

            }

            if (sum != 0) {
                System.out.println("Невозможно выдать указанную сумму, введите значение кратное " + nominal[0] + " " + currency.getAbbreviation());
                return 0;
            }
            int lastCaseComa = resultBanknots.toString().trim().lastIndexOf(','); //получаем последнюю запятую
            resultBanknots.replace(lastCaseComa, lastCaseComa + 1, ""); //удаляем последнюю запятую, путем замены ее на пробел
            System.out.println("Выдана сумма: " + withdrawalSum + " " + currency.getAbbreviation());
            System.out.println("Выдана банкнотами: " + resultBanknots);
            this.amountAvailableMoney -= withdrawalSum; //отнимаем от общего количества денег в банкомате выданную сумму
        } else {
            System.out.println("Недостаточно денег в банкомате для снятия");
            return 0;
        }
        return withdrawalSum;
    }


    public int getAmountAvailableMoney() {
        return amountAvailableMoney;
    }

    public void setAmountAvailableMoney(int amountAvailableMoney) {
        this.amountAvailableMoney = amountAvailableMoney;
    }

    public int[] getNominal() {
        return nominal;
    }

    public void setNominal(int[] nominal) {
        this.nominal = nominal;
    }

}
