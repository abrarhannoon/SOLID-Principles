package Implement;

import java.util.ArrayList;

public class Customer extends CustomerOffer {

    @Override
    public void addOffers(Offer offer) {
           this.offers.add(offer);
    }


}
