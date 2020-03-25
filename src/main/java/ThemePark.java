import attractions.Attraction;
import behaviours.IReviewed;
import org.w3c.dom.Attr;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {


    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(){
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviews = new ArrayList<IReviewed>();
        for (Attraction attraction : attractions) {
            if (attraction instanceof IReviewed) {
                reviews.add(attraction);
            }
        }

            for (Stall stall : stalls) {
                if (stall instanceof IReviewed) {
                    reviews.add(stall);
                }
            }
            return reviews;
        }


        public void visitAttraction(Visitor visitor, Attraction attraction){
            visitor.addVisitedAttractions(attraction);
            attraction.getVisitCount()++;
        }
    }