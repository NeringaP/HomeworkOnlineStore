package OnlineStore.Items;

import OnlineStore.Furniture;

public class Table implements Furniture {

    private int type;

    public Table(int type) {
        this.type = type;
    }

    public double getItemPrice() {
        double price = 0;
        switch (type) {
            case 1:
                return 356.80;
            case 2:
                return 660.75;
            case 3:
                return 1250.0;
            default:
                System.out.println("error");
        }
        return price;
    }
}


