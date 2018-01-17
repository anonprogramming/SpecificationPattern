package specificationpattern;

/**
 *
 * @author anonCoding
 */
public class AndSpecification implements CustomerSpecification{
    private final CustomerSpecification firstSpec;
    private final CustomerSpecification secondSpec;

    public AndSpecification(CustomerSpecification firstSpec, CustomerSpecification secondSpec) {
        this.firstSpec = firstSpec;
        this.secondSpec = secondSpec;
    }

    @Override
    public boolean isSatisfiedBy(Customer customer) {
        return firstSpec.isSatisfiedBy(customer) && secondSpec.isSatisfiedBy(customer);
    }
}
