package OnlineStore.Items;

import OnlineStore.Furniture;

public class Bed implements Furniture {

    private int type;

    public Bed(int type) {
        this.type = type;
    }

    public double getItemPrice() {
        double price = 0;
        switch (type) {
            case 1:
                return 300.90;
            case 2:
                return 810.75;
            case 3:
                return 1050.95;
            default:
                System.out.println("error");
        }
        return price;
    }
}


