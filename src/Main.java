import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String cadena = "Emanuel Flavio Faillace";
        Map<Character, Integer> map = map = Ejercicios.getFrecuencia(cadena);
        for(Character c : map.keySet()){
            System.out.println(c + " -> " + map.get(c));
        }
    }
}