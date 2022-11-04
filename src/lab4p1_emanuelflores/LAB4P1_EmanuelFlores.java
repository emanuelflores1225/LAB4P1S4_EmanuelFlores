package lab4p1_emanuelflores;
import java.util.Scanner;

public class LAB4P1_EmanuelFlores {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("------------------------------");
            System.out.println("Bienvenid@ a laboratorio 4");
            System.out.println("1-> Sumador binario");
            System.out.println("2-> Contiene");
            System.out.println("3-> Alpha");
            System.out.println("4-> Salida");
            opcion = leer.nextInt();
            switch (opcion){
                case 1 -> {
                    String num1;
                    String num2;
                    System.out.println("Bienvenid@ a sumador de numeros binarios");
                    System.out.println("Ingrese el primer numero binario: ");
                    num1 = leer.next();
                    System.out.println("Ingrese el segundo numero binario: ");
                    num2 = leer.next();
                        if (num1.length() == num2.length()){
                            int numero1 = Integer.parseInt(num1,2);
                            int numero2 = Integer.parseInt(num2,2);
                            int sum = numero1 + numero2;
                            String suma = Integer.toBinaryString(sum);
                            System.out.println("La suma de binarios es de: " + suma);
                        }
                    break;
                }
                
                case 2 -> {
                    String frase;
                    String sub;
                    System.out.println("Bienvenid@ a contains");
                    System.out.println("Ingrese la primera frase: ");
                    frase = leer.next();
                    System.out.println("Ingrese parte de la frase: ");
                    sub = leer.next(); 
                    int cont=0;
                    for (int i = 0; i < frase.length(); i++){
                        if(frase.charAt(i)== sub.charAt(cont)){
                            if (++cont >= sub.length()){
                                break;
                            }
                        }
                        else{
                            i -= cont;
                            cont = 0;
                        }
                    }
                    if (cont == sub.length()){
                        System.out.println("La segunda parte ESTA incluida en la primera");
                    }
                    else{
                        System.out.println("La segunda parte NO ESTA incluida en la segunda");
                    }
                    break;
                }
                
                case 3 -> {
                    String palabra;
                    System.out.println("Bienvenid@ a Alpha");
                    System.out.println("Ingrese la palabra SIN VALORES APARTE DE LETRAS: ");
                    palabra = leer.next();
                    boolean visited=false;
                    for (int i = 0; i < palabra.length(); i++){
                        char letter = palabra.toUpperCase().charAt(i);
                        int valorASCII = (int) letter;
                        visited = !(valorASCII != 165 && valorASCII < 65 || valorASCII > 90);
                    }
                    if (visited == false){
                        System.out.println("Este valor TIENE MAS QUE LETRAS");
                    }
                    else {
                        System.out.println("Este valor SOLO CONTIENE LETRAS");
                    }
                    break;
                }
                
                case 4 -> {
                    System.out.println("Saliendo");
                }
                
            }
        }while (opcion != 4);
    }
    
}
