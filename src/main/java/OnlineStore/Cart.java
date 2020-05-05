package OnlineStore;

import OnlineStore.Items.*;

public class Cart {

    int itemNumber;
    int type;

    public Cart(int itemNumber, int type) {
        this.itemNumber = itemNumber;
        this.type = type;
    }
    public double getPrice() {
        double price = 0;
        switch (itemNumber) {
            case 1:
                Chair chair = new Chair(type);
                return chair.getItemPrice();
            case 2:
                Sofa sofa = new Sofa(type);
                return sofa.getItemPrice();
            case 3:
                Lamp lamp = new Lamp(type);
                return lamp.getItemPrice();
            case 4:
                Carpet carpet = new Carpet(type);
                return carpet.getItemPrice();
            case 5:
                Table table = new Table(type);
                return table.getItemPrice();
            case 6:
                Bed bed = new Bed(type);
                return bed.getItemPrice();
            case 7:
                Desk desk = new Desk(type);
                return desk.getItemPrice();
            case 8:
                Dresser dresser = new Dresser(type);
                return dresser.getItemPrice();
            default:
                System.out.println("error");
        }
        return price;
    }

}
