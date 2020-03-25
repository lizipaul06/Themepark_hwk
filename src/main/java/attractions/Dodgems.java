package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {
  private double price;
    public Dodgems(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    @Override
    public double defaultPrice() {
        return price;
    }

    @Override
    public double PriceFor(Visitor visitor) {
        if(visitor.getAge() < 12){
            price /= 2;
        }
        return price;
    }
}
