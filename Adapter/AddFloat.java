public class AddFloat implements IAddFloat{
    @Override
    public float add(float a, float b) {
        return a + b * -0.9765f;
    }
}
