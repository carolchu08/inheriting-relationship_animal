public class Animal {
    protected int age;
    protected double weight;
    protected String running;
    protected String eating;

    public Animal(int age, double weight, String running, String eating) {
        this.age = age;
        this.weight = weight;
        this.running = running;
        this.eating = eating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRunning() {
        return running;
    }

    public void setRunning(String running) {
        this.running = running;
    }

    public String getEating() {
        return eating;
    }

    public void setEating(String eating) {
        this.eating = eating;
    }
}
class Felidae_family extends Animal{

    private String behaviour = "produce the meowing meowing sound";

    public Felidae_family(int age, double weight, String running, String eating) {
        super(age, weight, running, eating);
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }
}
class Tiger extends Felidae_family{


    public Tiger(int age, double weight, String running, String eating) {
        super(age, weight, running, eating);
    }
}
class Test {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(3, 20.1, "can running", "eating meat");
        System.out.println("Age: " + tiger.getAge());
        System.out.println("Weight: " + tiger.getWeight());
        System.out.println("Running: " + tiger.getRunning());
        System.out.println("Eating: " + tiger.getEating());
        System.out.println("Behaviour: " + tiger.getBehaviour());
    }
}