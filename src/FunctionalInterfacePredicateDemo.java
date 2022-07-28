import java.util.function.Predicate;

public class FunctionalInterfacePredicateDemo {
    public static void main(String[] args) {
        Predicate<String> checklength= s->s.length() >=5;
        Predicate<String> isEven=s->s.length()%2==0;
        System.out.println("CheckLength:"+checklength.test("Hihhhi"));
        System.out.println("IsEven:"+isEven.test("hello"));
        System.out.println("Predicate Join AND:"+checklength.and(isEven).test("helohif"));
        System.out.println("Predicate Join OR:"+checklength.or(isEven).test("hellohif"));
        System.out.println("Predicate Join AND:"+checklength.negate().test("hellohif"));

    }
}
