package furnitures;
import java.util.Scanner;

public class FurnitureShop extends Furniture {
    public void Catalog() {
        Scanner in = new Scanner(System.in);
        Sofa s = new Sofa();
        Table t = new Table();
        Bed b = new Bed();
        System.out.println("Мебельный каталог");

        System.out.println(s);
        System.out.println(t);
        System.out.println(b);
        System.out.println("Выберите товар для совершения покупки:" +
                " 1-диван" +
                " 2-обеденный стол" +
                " 3-кровать");
        int v=in.nextInt();
        if (v == 1) {
            System.out.println("В корзину добавлен диван, стоимость покупки - "+ s.getCost());
        }
        if (v == 2) {
            System.out.println("В корзину добавлен обеденный стол, стоимость покупки - "+ t.getCost());

        }
        if (v == 3) {
            System.out.println("В корзину добавлена кровать, стоимость покупки - "+ b.getCost());
        }
        else if (v!=1&&v!=2&&v!=3){
            System.out.println("Ошибка");
        }

    }
}
