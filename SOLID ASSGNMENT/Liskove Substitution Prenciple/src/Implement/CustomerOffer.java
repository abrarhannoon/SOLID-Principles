package Implement;

import java.util.ArrayList;

public abstract class CustomerOffer {


    protected ArrayList<Offer> offers = null;

    public CustomerOffer() {offers = new ArrayList<>();}
    public abstract void addOffers(Offer offer);

    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }




}