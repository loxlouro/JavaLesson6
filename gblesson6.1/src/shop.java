import java.util.HashMap;
import java.util.Map;

public class shop {
    public static Map<String, Laptop> LaptopList= new HashMap<>();

    public static void addLaptop(String key, Laptop theLaptop){
        LaptopList.put(key, theLaptop);
    }

}
