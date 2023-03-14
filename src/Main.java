import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> noblePeople = new ArrayList<>();
        noblePeople.add(new Person("Sergey", "Martynov", 15));
        noblePeople.add(new Person("Nadya", "Vi Conte De Li", 28));
        noblePeople.add(new Person("Andrei", "Shumakov Jr", 25));
        noblePeople.add(new Person("Julia", "Popova Jr", 9));
        noblePeople.add(new Person("Sasha", "Bz Bz Wake Up Samurai", 26));

        noblePeople.removeIf(person -> person.getAge() < 18); //лямбда выражение
        //использовали встроенный интерфейс Predicate, который принимает объект и возвращает boolean значение

        noblePeople.sort(new AmountWordsInSurnameComparator(3));
        System.out.println(noblePeople);
    }
}