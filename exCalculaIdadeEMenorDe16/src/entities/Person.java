package entities;

public class Person {
    String name;
    float height;
    int age;

    public Person(String name, float height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String isYoungerThan(){
        if(this.age < 16){
            return this.getName();
        }
        return null;
    }


}
