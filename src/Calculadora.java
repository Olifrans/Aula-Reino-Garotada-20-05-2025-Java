public class Calculadora {

//    double diariaDia = 140.44;
//    public Calculadora(double diariaDia) {
//        this.diariaDia = diariaDia;
//    }
//
//    public Calculadora() {
//    }

    public int soma(int a, int b) {
        return a + b;
    }

    public long mult(long a, long b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public float sub(float a, float b) {
        return a - b;
    }

    public double CoverteCelFar(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double CoverteFarCel(double fare) {
        return (fare - 32) * 5 / 9;
    }

    public double areRetangulo(double larg, double comprim) {
        return larg * comprim;
    }


}
