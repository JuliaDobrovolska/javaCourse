public class ScreenATM implements Screen {

    private int height;
    private int width;

    @Override
    public void setHeight(int height) {
        this.height = height;

    }

    @Override
    public void setWidth(int width) {
        this.width = width;

    }

    @Override
    public void showInDisplay() {
        if(height == 0 || width == 0 ){
            System.out.println("параметры экрана не заданы");
        }else {
            Currencies[] currencies = Currencies.values();
            for(Currencies a: Currencies.values()){
                System.out.println(a.getCurrencyName() + ": (" + a.getAbbreviation() +", "+a.getCurrencyCode()+")");
            }

        }

    }
}
