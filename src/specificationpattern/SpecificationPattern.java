
package specificationpattern;

/**
 *
 * @author anonCoding
 */
public class SpecificationPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        run();
    }
    
    public static void run() {
        Customer customer = new Customer();
        customer.setAge(17);
        customer.setMoney(10);
        
        if (new CustomerIsOfAge().isSatisfiedBy(customer)) {
            System.out.println("Customer can by beer");
        }
        
        if (new CustomerIsPremium(6).isSatisfiedBy(customer)) {
            System.out.println("Customer can get promo cards");
        }
        
        if (new CustomerIsOfAge().Not().isSatisfiedBy(customer)) {
            System.out.println("customer is under age");
        }
        
        CustomerSpecification customerIsOnlyPremiumSpec = new CustomerIsPremium(6).AndNot(new CustomerIsOfAge());
        if (customerIsOnlyPremiumSpec.isSatisfiedBy(customer)) {
            System.out.println("customer is only premium");
        }
        
        CustomerSpecification eliteCustomerSpec = 
                new CustomerIsOfAge().And(new CustomerIsPremium(6));
                
        CustomerSpecification regularCustomerSpec = 
                new CustomerIsOfAge().Or(new CustomerIsPremium(6));
        
        if (eliteCustomerSpec.isSatisfiedBy(customer)) {
            System.out.println("Customer is one of the elite customers");
        }
        
        if (regularCustomerSpec.isSatisfiedBy(customer)) {
            System.out.println("Customer is one of the regular customers");
        }
    }
    
}
