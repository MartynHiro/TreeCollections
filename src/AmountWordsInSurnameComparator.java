import java.util.Comparator;

public class AmountWordsInSurnameComparator implements Comparator<Person> {
    protected int maxSurnameWords;
    protected int firstLength;
    protected int secondLength;

    public AmountWordsInSurnameComparator(int maxSurnameWords) {
        this.maxSurnameWords = maxSurnameWords;
    }

    @Override
    public int compare(Person o1, Person o2) { //будем делить наши фамилии на слова
        String[] ar1 = o1.getSurname().split(" ");
        String[] ar2 = o2.getSurname().split(" ");

        firstLength = ar1.length;
        secondLength = ar2.length;

        if (ar1.length > maxSurnameWords) { //приравниваем к лимиту, если фамилии длиннее установленного
            firstLength = maxSurnameWords;
        }

        if (ar2.length > maxSurnameWords) {
            secondLength = maxSurnameWords;
        }

        if (firstLength == secondLength) { //если длина фамилий одинаковая, то сравниваем по возрасту
            return o1.getAge() - o2.getAge();
        } else {
            return firstLength - secondLength;
        }
    }
}
