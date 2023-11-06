public class Pion extends  Flowers{
    private int amount;
    private int period;


    public Pion(String shopName, String shopAddress, String flowerName, int cost, ColorOfFlowers color, int amount, int period, City city) {
        super(shopName, shopAddress, flowerName, cost, color, city);
        this.amount = amount;
        this.period = period;
    }
    public int getAmount() {
        return amount;
    }
    public int getPeriod() {
        return period;
    }
    @Override
    public String info() {
        String flowersInfo = super.info();
        String pionInfo = "Кол-во: " + amount + "\nСрок: " + period;

        return flowersInfo + "\n" + pionInfo ;
    }

}
