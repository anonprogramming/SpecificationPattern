package specificationpattern;

/**
 *
 * @author anonCoding
 */
public class CustomerIsOfAge implements CustomerSpecification {

    @Override
    public boolean isSatisfiedBy(Customer customer) {
        return customer.getAge() >= 18;
    }
}
