package saturday;

public class Person {

    // ctrl+d - kopiowanie linii
    private String name;
    private String surname;
    private int age;
    private Gender gender;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        Person person = (Person) other;
        return this.name.equals(person.name) &&
                this.surname.equals(person.surname) &&
                this.age == person.age &&
                this.gender == person.gender;
    }


}
