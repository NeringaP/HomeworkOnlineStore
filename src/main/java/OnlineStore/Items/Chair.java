package OnlineStore.Items;

import OnlineStore.Furniture;

public class Chair implements Furniture {

    private int type;

    public Chair(int type) {
        this.type = type;
    }

    public double getItemPrice() {
        double price = 0;
        switch (type) {
            case 1:
                return 35.50;
            case 2:
                return 38.90;
            case 3:
                return 55.25;
            default:
                System.out.println("error");
        }
        return price;
    }


}
