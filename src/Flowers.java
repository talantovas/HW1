public class Flowers extends Shop {
    private String flowerName;
    private int cost;
    private ColorOfFlowers color;
    private City city;

    public Flowers(String shopName, String shopAddress, String flowerName, int cost, ColorOfFlowers color) {
        super(shopName, shopAddress);
        this.flowerName = flowerName;
        this.cost = cost;
        this.color = color;
    }

    public Flowers(String shopName, String shopAddress, String flowerName, int cost, ColorOfFlowers color, City city) {
        super(shopName, shopAddress);
        this.flowerName = flowerName;
        this.cost = cost;
        this.color = color;
        this.city = city;
    }
    public String getShopName() {
        return super.getName();
    }

    public String getShopAddress() {
        return super.getAddress();
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getCost() {
        return cost;
    }

    public ColorOfFlowers getColor() {
        return color;
    }
    public void sellFlower(){
        System.out.println("Цветы в наличии" );
    }
    public void sellFlower(String customer, int quantity){
        System.out.println("Покупатель: " + customer + "  Кол-во: " + quantity);
    }
    public final void delivery(){
        System.out.println("Доставка: " + 150);
    }
    public String info(){
        return "Название: " + flowerName +
                "\nЦвет: " + color +
                "\nЦена: " + cost +
                "\nГород: " + city.getNameOfCity();

    }

}