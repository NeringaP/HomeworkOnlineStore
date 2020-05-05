package OnlineStore.Items;

import OnlineStore.Furniture;

public class Dresser implements Furniture {

    private int type;

    public Dresser(int type) {
        this.type = type;
    }

    public double getItemPrice() {
        double price = 0;
        switch (type) {
            case 1:
                return 250.69;
            case 2:
                return 490.80;
            case 3:
                return 775.65;
            default:
                System.out.println("error");
        }
        return price;
    }
}


