package OnlineStore.Items;

import OnlineStore.Furniture;

public class Lamp implements Furniture {

    private int type;

    public Lamp(int type) {
        this.type = type;
    }

    public double getItemPrice() {
        double price = 0;
        switch (type) {
            case 1:
                return 90.60;
            case 2:
                return 130.55;
            case 3:
                return 340.79;
            default:
                System.out.println("error");
        }
        return price;
    }
}


