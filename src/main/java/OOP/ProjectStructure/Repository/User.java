package OOP.ProjectStructure.Repository;

public class User {

    // Инкапсуляция: private поля и доступ к ним через getter и setter

    private String name;

    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User with " +
                "name='" + name + '\'' +
                " and age=" + age +
                '}';
    }
}
