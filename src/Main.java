import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> noblePeople = new ArrayList<>();
        noblePeople.add(new Person("Sergey", "Martynov", 30));
        noblePeople.add(new Person("Nadya", "Vi Conte De Li", 28));
        noblePeople.add(new Person("Andrei", "Shumakov Jr", 25));
        noblePeople.add(new Person("Julia", "Popova Jr", 54));
        noblePeople.add(new Person("Sasha", "Bz Bz Wake Up Samurai", 26));

        Comparator<Person> comparator = Person::surnameLengthComparator;
//  знаю что в задании было использовать лямбда-выражение, но как говорилось в лекции ссылка на метод - это
//  более компактная версия лямбда-выражения, извиняюсь за фривольность

        noblePeople.sort(comparator);

        System.out.println(noblePeople);
    }
}