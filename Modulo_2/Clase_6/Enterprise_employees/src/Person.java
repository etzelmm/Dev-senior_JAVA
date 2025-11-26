public abstract class Person {
    //atributes
    private String name;
    private Integer age;

    //constructor
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    //getters
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public abstract void showInfomation();
    
}
