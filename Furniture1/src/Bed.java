package furnitures;
public class Bed extends Furniture {
    Bed() {
        color = "Белая";
        name = "кровать";
        cost = 35000;

    }
    public Bed(int cost){setCost(cost);}
}
