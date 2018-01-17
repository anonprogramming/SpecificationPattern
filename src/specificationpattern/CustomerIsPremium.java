package specificationpattern;

/**
 *
 * @author anonCoding
 */
public class CustomerIsPremium implements CustomerSpecification {
    
    private final int cost;

    public CustomerIsPremium(int cost) {
        this.cost = cost;
    }
    

    @Override
    public boolean isSatisfiedBy(Customer customer) {
        return customer.getMoney() > cost;
    }
}
