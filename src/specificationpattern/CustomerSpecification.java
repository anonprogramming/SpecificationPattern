package specificationpattern;

/**
 *
 * @author anonCoding
 */
public interface CustomerSpecification {
    boolean isSatisfiedBy(Customer customer);
    
    default CustomerSpecification And(CustomerSpecification spec) {
        return new AndSpecification(this, spec);
    }
    
    default CustomerSpecification OR(CustomerSpecification spec) {
        return new OrSpecification(this, spec);
    }
}
