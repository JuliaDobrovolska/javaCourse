import currency.Dollar;
import currency.Hryvnia;
import currency.Rubles;

public class JavaApplication {
    public static void main(String[] args) {

        Cassette[] cassettes = new Cassette[3];

        //компактная запись создания объектов и заполнения полей через конструкторы
        int[] nominalUSD = new int[]{1, 2, 5, 10, 20, 50, 100};
        int[] nominalUAH = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500};
        int[] nominalRUR = new int[]{5, 10, 20, 50, 100, 200, 500, 1000, 2000};
        cassettes[0] = new Cassette(new Dollar("USD"), 1000, nominalUSD);
        cassettes[1] = new Cassette(new Hryvnia("UAH"), 10000, nominalUAH);
        cassettes[2] = new Cassette(new Rubles("RUR"), 10000, nominalRUR);

        ATM atm = new ATM(cassettes);

        atm.getCassette()[0].getMoney(835);
        atm.getCassette()[1].getMoney(3945);
        atm.getCassette()[2].getMoney(5634);

    }
}
