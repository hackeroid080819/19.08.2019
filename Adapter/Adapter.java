public class Adapter implements IAddFloat {

    private AddInt myAddInt = new AddInt();

    @Override
    public float add(float a, float b) {
        int newa = (int)a;
        int newb = (int)b;
        float result = myAddInt.Add(newa, newb);
        return result;
    }
}
