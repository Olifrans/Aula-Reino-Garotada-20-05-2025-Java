//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        int result = cal.soma(77, 777);
        System.out.println(result);

        long result1 = cal.mult(77L, 777L);
        System.out.println(result1);

        double result2 = cal.div(77.4, 777.6);
        System.out.println(result2);

        float result3 = cal.sub(77F, 777F);
        System.out.println(result3);


        //Conversor de temperatura
        System.out.println();
        System.out.println("----------------------");

        double celsius = cal.CoverteCelFar(100.0);
        System.out.println(celsius);


        double fareh = cal.CoverteFarCel(212.0);
        System.out.println(fareh);

        double retangula = cal.areRetangulo(5.0, 7.4);
        System.out.println("O total de pisos em metros é: " + retangula);


    }
}