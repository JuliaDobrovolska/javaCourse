public class JavaApplication {
    public static void main(String[] args) {

        Cassette[] cassettes = new Cassette[3];

        //компактная запись создания объектов и заполнения полей через конструкторы
        int[] nominalUSD = new int[]{1, 2, 5, 10, 20, 50, 100};
        int[] nominalUAH = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500};
        int[] nominalRUB = new int[]{5, 10, 20, 50, 100, 200, 500, 1000, 2000};

        Currencies dollar = Currencies.DOLLAR;
        System.out.println(dollar.getAbbreviation() instanceof String);

        cassettes[0] = new Cassette(Currencies.DOLLAR, 1000, nominalUSD);
        cassettes[1] = new Cassette(Currencies.HRYVNIA, 10000, nominalUAH);
        cassettes[2] = new Cassette(Currencies.RUBLES, 10000, nominalRUB);






        ATM atm = new ATM(cassettes);

        atm.getCassette()[0].getMoney(335);
        atm.getCassette()[1].getMoney(45);
        atm.getCassette()[2].getMoney(34);


        System.out.println("--------------------------------------");
        ScreenATM screenATM = new ScreenATM();
        screenATM.setHeight(24);
        screenATM.setWidth(23);
        screenATM.showInDisplay();

    }
}
