package specificationpattern;

/**
 *
 * @author anonCoding
 */
public class NotSpecification implements CustomerSpecification {
    
    private final CustomerSpecification spec;

    public NotSpecification(CustomerSpecification spec) {
        this.spec = spec;
    }  

    @Override
    public boolean isSatisfiedBy(Customer customer) {
        return !this.spec.isSatisfiedBy(customer);
    }
    
}
