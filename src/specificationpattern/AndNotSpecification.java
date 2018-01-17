package specificationpattern;

/**
 *
 * @author anonCoding
 */
public class AndNotSpecification implements CustomerSpecification {
    
    private final CustomerSpecification firstSpec;
    private final CustomerSpecification secondSpec;

    public AndNotSpecification(CustomerSpecification firstSpec, CustomerSpecification secondSpec) {
        this.firstSpec = firstSpec;
        this.secondSpec = secondSpec;
    }

    @Override
    public boolean isSatisfiedBy(Customer customer) {
        return firstSpec.isSatisfiedBy(customer) && !secondSpec.isSatisfiedBy(customer);
    }
}
