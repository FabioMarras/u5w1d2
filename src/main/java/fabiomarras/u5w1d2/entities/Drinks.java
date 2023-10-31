package fabiomarras.u5w1d2.entities;

import lombok.ToString;

@ToString
public class Drinks {
    private String name;
    private String calories;
    private String price;

    public Drinks(String name, String calories, String price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

}
