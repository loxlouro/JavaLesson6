import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 =new Laptop(8,512,"Windows 10","Grey");
        Laptop laptop2 =new Laptop(4,256,"Ubuntu","Green");
        Laptop laptop3 = new Laptop(12,1024,"MacOS","White");
        shop.addLaptop("Laptop1",laptop1);
        shop.addLaptop("Laptop2",laptop2);
        shop.addLaptop("Laptop3",laptop3);
        Set<Laptop> laptop = new HashSet<>();
        laptop.add(laptop1);
        laptop.add(laptop2);
        laptop.add(laptop3);
        Laptop FilterLaptop = new Laptop();
        //shop.LaptopList.get("Laptop1").filter();
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}