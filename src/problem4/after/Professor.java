package problem4.after;

public class Professor implements Teacher,Researcher{
    private final String name;

    public Professor(String name) {
        this.name = name;
    }

    @Override
    public void teach(String code) {
        System.out.println("Prof. " + name + " teaches " + code);
    }

    @Override
    public void grade(String code) {
        System.out.println("Prof. " + name + " grades " + code);
    }

    @Override
    public void publish(String title) {
        System.out.println("Prof. " + name + " publishes " + title);
    }
}
