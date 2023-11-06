// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        City city = new City("Bishkek");

        Flowers flowers = new Flowers("Flower Shop 1", "Tunguch1", "pion", 500, ColorOfFlowers.red, city );

        // Создаем два объекта класса 3-го уровня
        Pion pion = new Pion("Flower Shop 2", "Tunguch2", "Японские", 600, ColorOfFlowers.pink, 20, 3, city);
        System.out.println(pion.info());
        pion.sellFlower();
        pion.sellFlower("Нурс",5);
        pion.delivery();
        System.out.println("Название магазина: " + pion.getShopName());
        System.out.println("Адрес магазина: " + pion.getShopAddress() + "\n------------------------------");
        Pion pion1 = new Pion("Flower Shop 3", "Tunguch3", "Полумахровые", 550, ColorOfFlowers.white, 15, 4, city);

        System.out.println(pion1.info());
        pion1.sellFlower();
        pion1.sellFlower("Айба",15);
        System.out.println("Название магазина: " + pion1.getShopName());
        System.out.println("Адрес магазина: " + pion1.getShopAddress());

    }
}