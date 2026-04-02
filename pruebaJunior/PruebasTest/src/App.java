import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        punto5();
    }

    public static void punto1(){
        Integer[] numeros = {3, 7, 2, 9, 4};
        Integer mayor = 0;
        for(int n : numeros){
            if(n > mayor){
                mayor = n;
            }
        }
        System.out.println("punto 1: el mayor es: " + mayor);
    }

    public static void punto2(Integer n){
        System.out.println("La entrada es: " + n);
        if(n%2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("impart");
        }

        if (n < 0 ) {
            System.out.println("negativo");
        } else{
            System.out.println("positivo");
        }
    }

    public static Integer punto3(Integer[] nuemros){
        Integer suma = 0;
        for(Integer n : nuemros){
            suma += n;
        }
        return suma;
    }

    public static void punto4(String[] elementos){
        Map<String, Integer> numeroElementos = new HashMap<>();
        Integer repeticionElemento = 0;
        for(String elemento: elementos){
            if (numeroElementos.containsKey(elemento)) {
                repeticionElemento += 1; 
            }
            numeroElementos.put(elemento, repeticionElemento);
        }
        System.out.println(numeroElementos);
    }

    public static void punto5(){
        Integer[] numeros = {1, 2, 3, 4};

        for(int i= 0; i < numeros.length; i++){
            System.out.println(i+1);
        }
    }
}
