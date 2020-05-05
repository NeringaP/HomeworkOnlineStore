package OnlineStore.Items;

import OnlineStore.Furniture;

public class Carpet implements Furniture {

    private int type;

    public Carpet(int type) {
        this.type = type;
    }

    public double getItemPrice() {
        double price = 0;
        switch (type) {
            case 1:
                return 80.30;
            case 2:
                return 220.12;
            case 3:
                return 752.66;
            default:
                System.out.println("error");
        }
        return price;
    }
}


