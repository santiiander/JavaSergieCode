import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "inteligencia";
        int intentosMax = 10;
        int intento = 0;
        boolean palabraAdivinada = false;

        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];


        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }
        
        while(!palabraAdivinada && intento < intentosMax){
            System.out.println("Palabra a adivinar" + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra por favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0)); 

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }
            }
            if (!letraCorrecta){
                intento++;
                System.out.println("Incorrecto, te quedan "+ (intentosMax-intento) + " intentos");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades! adivinaste la palabra: "+ palabraSecreta);

            }
        }
        if (!palabraAdivinada){
            System.out.println("Perdiste no intentos :C");
        }
        scanner.close();
    
    }
}
