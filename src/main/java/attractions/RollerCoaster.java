package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {
    private double price;
    public RollerCoaster(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        boolean result;
        if (visitor.getAge() > 12 && visitor.getHeight() > 145) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


    @Override
    public double defaultPrice() {
        return price;
    }

    @Override
    public double PriceFor(Visitor visitor) {
        if(visitor.getHeight() > 200){
            price *= 2;
        }
            return price;

    }
}
