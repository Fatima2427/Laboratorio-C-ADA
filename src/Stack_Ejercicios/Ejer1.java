package Stack_Ejercicios;

public class Ejer1 {
    public static void main(String[] args) {

        Stack<Double> pesos = new Stack<Double>();
        System.out.println(pesos.EstaVacio()); //true

        pesos.Apilar(41.2);
        System.out.println(pesos.EstaVacio()); //false

        pesos.Apilar(1.2);
        pesos.Apilar(5.2);
        pesos.Apilar(4.3);
        pesos.Apilar(3.21);

        System.out.println(pesos.ObtenerValorTope());//3.21

        pesos.Desapilar();
        System.out.println(pesos.ObtenerValorTope());//4.3

    }
}
