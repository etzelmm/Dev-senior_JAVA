public abstract class Animal {
    //atributes
    private String name;
    private Integer age;

    //constructor
    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    //getters
    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //make noise 
    public abstract void makeNoise();
}
