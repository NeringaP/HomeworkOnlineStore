package OnlineStore.Items;

import OnlineStore.Furniture;

public class Desk implements Furniture {

    private int type;

    public Desk(int type) {
        this.type = type;
    }

    public double getItemPrice() {
        double price = 0;
        switch (type) {
            case 1:
                return 120.65;
            case 2:
                return 369.48;
            case 3:
                return 888.98;
            default:
                System.out.println("error");
        }
        return price;
    }
}


