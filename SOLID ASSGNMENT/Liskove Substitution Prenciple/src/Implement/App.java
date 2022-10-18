package Implement;

public class App {
    public static void offerAdd(CustomerOffer customer){
      for(int i=0;i<4;i++){
          customer.addOffers(new Offer());
      }
    }
    public static void main(String[] args) {

        Customer customer=new Customer();
        LimitedCustomer customer1=new LimitedCustomer();

        offerAdd(customer);
       offerAdd(customer1);


    }
}
