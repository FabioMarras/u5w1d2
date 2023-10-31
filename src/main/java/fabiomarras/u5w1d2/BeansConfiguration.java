package fabiomarras.u5w1d2;

import fabiomarras.u5w1d2.entities.Drinks;
import fabiomarras.u5w1d2.entities.Menù;
import fabiomarras.u5w1d2.entities.Pizzas;
import fabiomarras.u5w1d2.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfiguration {

    //PIZZE

    @Bean
    Pizzas PizzaIMargherita(List<Toppings> allTopings) {
        List<Toppings> margheritaToppings = Arrays.asList();
        return new Pizzas("Margherita",  1104,4.99 , margheritaToppings);
    }
    @Bean
    Pizzas PizzaIMargheritaXL(List<Toppings> allTopings) {
        List<Toppings> margheritaToppings = Arrays.asList(PizzaXL());
        return new Pizzas("MargheritaXL",  (1104 + PizzaXL().getCalories()),(4.99 + PizzaXL().getPrice()) , margheritaToppings);
    }

    @Bean
    Pizzas PizzaHawaiian(List<Toppings> allTopings) {
        List<Toppings> HawaiianToppings = Arrays.asList(Ham(), Pineaaple());
        return new Pizzas("Hawaiian", (1104 + Ham().getCalories() + Pineaaple().getCalories()), (4.99 + Ham().getPrice() + Pineaaple().getPrice()), HawaiianToppings);
    }

    @Bean
    Pizzas PizzaSalami(List<Toppings> allTopings) {
        List<Toppings> SalamiToppings = Arrays.asList(Salami());
        return new Pizzas("Salami",  (1104 + Salami().getCalories()), (4.99 + Salami().getPrice()), SalamiToppings);
    }
    @Bean
    public List<Pizzas> allPizzas(List<Toppings> allTopings) {
        return Arrays.asList(PizzaIMargherita(allTopings), PizzaIMargheritaXL(allTopings), PizzaSalami(allTopings), PizzaHawaiian(allTopings));
    }

    //DRINKS
    @Bean
    public Drinks lemonade() {
        return new Drinks("Lemonade", "128", "1.29$");
    }

    @Bean
    public Drinks water() {
        return new Drinks("Water", "0", "1.29$");
    }

    @Bean
    public Drinks wine() {
        return new Drinks("Wine", "607", "7.49$");
    }
    @Bean
    public List<Drinks> allDrinks() {
        return Arrays.asList(lemonade(), water(), wine());
    }

    //TOPPINGS
    @Bean
    public Toppings Cheese() {
        return new Toppings("Cheese", 92, 0.69);
    }
    @Bean
    public Toppings Tomato() {
        return new Toppings("Tomato", 50, 0.99);
    }
    @Bean
    public Toppings Ham() {
        return new Toppings("Ham", 35, 0.99);
    }
    @Bean
    public Toppings Onions() {
        return new Toppings("Onions", 22, 0.69);
    }
    @Bean
    public Toppings Pineaaple() {
        return new Toppings("Pineaaple", 24, 0.79);
    }
    @Bean
    public Toppings Salami() {
        return new Toppings("Salami", 86, 0.99);
    }
    @Bean
    public Toppings PizzaXL() {
        return new Toppings("PizzaXL", 130, 2.99);
    }
    @Bean
    public List<Toppings> allTopings() {
        return Arrays.asList(Cheese(), Tomato(), Ham(),Onions(), Pineaaple(), Salami());
    }

    //MENU
    @Bean
    public Menù allMenù (List<Pizzas> pizzas, List<Drinks> drinks, List<Toppings> toppings) {
        return new Menù(pizzas, drinks, toppings);
    }
}
