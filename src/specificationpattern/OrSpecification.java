package specificationpattern;

/**
 *
 * @author anonCoding
 */
public class OrSpecification implements CustomerSpecification {
    private final CustomerSpecification firstSpec;
    private final CustomerSpecification secondSpec;

    public OrSpecification(CustomerSpecification one, CustomerSpecification secondSpec) {
        this.firstSpec = one;
        this.secondSpec = secondSpec;
    }

    @Override
    public boolean isSatisfiedBy(Customer customer) {
        return firstSpec.isSatisfiedBy(customer) || secondSpec.isSatisfiedBy(customer);
    }
}
