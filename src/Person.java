public class Person {
    protected String name;
    protected String surname;
    protected int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + age + " лет";
    }

    public static int surnameLengthComparator(Person o1, Person o2) {
        int maxSurnameWords = 3; // так как сигнатура нашего метода должна соответствовать функциональному интерфейсу,
        //теперь выставляем максимальную длину тут, а не передаем в параметре
        int firstLength;
        int secondLength;

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
