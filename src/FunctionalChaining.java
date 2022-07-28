import java.util.function.Function;

public class FunctionalChaining {
    public static void main(String[] args) {
        Function<Integer,Integer> doubleIt = s->s*2;
        Function<Integer,Integer> cubeIt= s->s*s*s;

        System.out.println("Double:"+doubleIt.apply(5));
        System.out.println("cibe It:"+cubeIt.apply(2));
        System.out.println("Chaning using andthen:"+doubleIt.andThen(cubeIt).apply(2));
        System.out.println("chaining using compose:"+doubleIt.compose(cubeIt).apply(2));

    }
}
