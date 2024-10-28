package academy.prog;

import java.util.Objects;

public class User {
    private String name;
    private String lastname;
    private String age;
    private String fruit;
    private String animal;

    public User(String name, String age, String lastname, String fruit, String animal) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.fruit = fruit;
        this.animal = animal;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(age, user.age) && Objects.equals(name, user.name) && Objects.equals(lastname, user.lastname) && Objects.equals(fruit, user.fruit) && Objects.equals(animal, user.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, age, fruit, animal);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", fruit='" + fruit + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }
}
