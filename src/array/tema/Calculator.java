package array.tema;

public class Calculator {
    public int addition(int x, int y, int z) {
        return x + z+(-y);
    }

    public int addition(double x, int y) {
        return (int) x + y;
    }

    public double addition(int y, int z) {
        return y + z;
    }

    public int substration(float x, double y, double z, double w) {
        return (int) (x - z - y - w);
    }

    public float substration(int x, float z, float w) {
        return x - z - w;
    }

    public double substration(int x, double u, float w) {
        return x - u - w;
    }

    public int division(int a, float g, double c, int l, double p) {
        return (int) (a / g / c / l / p);
    }

    public int division(int a, double p) {
        return (int) (a / p);
    }

    public int division(double c, int l, double p) {
        return (int) (c / l / p);
    }

    public int multiplication(int b, int s, int k) {
        return b * s * k;
    }

    public int multiplication(int b, int s, int k, int f) {
        return b * s * (k * f);
    }

    public double multiplication(float b, double s, int k) {
        return b * s * k;
    }


}
