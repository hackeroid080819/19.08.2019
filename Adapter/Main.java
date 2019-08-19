public class Main {

    public static void main(String[] args) {

        Add(new AddFloat(), 1.0f, 2.0f);

        Add(new Adapter(), 1.0f, 2.0f);

    }
    public static void Add(IAddFloat add, float a, float b)
    {
        System.out.println(add.add(a, b));

    }
}
