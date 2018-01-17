package specificationpattern;

/**
 *
 * @author anonCoding
 */
public interface CustomerSpecification {
    boolean isSatisfiedBy(Customer customer);
    
    default CustomerSpecification And(final CustomerSpecification spec) {
        return new AndSpecification(this, spec);
    }
    
    default CustomerSpecification AndNot(final CustomerSpecification spec) {
        return new AndNotSpecification(this, spec);
    }
    
    default CustomerSpecification Or(final CustomerSpecification spec) {
        return new OrSpecification(this, spec);
    } 
    
    default CustomerSpecification OrNot(final CustomerSpecification spec) {
        return new OrNotSpecification(this, spec);
    }
    
    default CustomerSpecification Not() {
        return new NotSpecification(this);
    }
}
