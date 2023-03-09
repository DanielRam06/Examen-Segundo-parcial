import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Mian1 {

	    public static void main(String[] args) {
	    	 Scanner sc = new Scanner(System.in);
	        Personas[] persona = new Personas[10];
	        for (int i = 0; i < 10; i++) {
	            persona[i] = new Personas() {};
	        }
	        //contadores de los atributos
	        int espada = 0;
	        int millonario = 0;
	        int mamado = 0;
	        int Feo = 0;
	        int miedoCucarachas = 0;
	        int estaCansado = 0;
	        int estaEnfermo = 0;
	        int estaTriste = 0;
	        int estaFeliz = 0;
	        System.out.println("JUEGO ADIVINA QUIEN? (JUGADORES)");

	        List<String> caracteristicasImportantes = Arrays.asList("Tiene Espada", "Es Millonario", "Está Mamado", "Está Feo", "Tiene Miedo a Cucarachas", "Está Cansado", "Está Enfermo", "Está Triste", "Está Feliz");

	        for (Personas personas : persona) {
	            System.out.print(personas.getNombre() + ": ");
	            int contador = 0;
	            for (String caracteristica : caracteristicasImportantes) {
	                switch (caracteristica) {
	                    case "Tiene Espada":
	                        if (personas.getTieneEspada()) {
	                            espada++;
	                            System.out.print("Tiene Espada, ");
	                            contador++;
	                        }
	                        break;
	                    case "Es Millonario":
	                        if (personas.getEsMillonario() ) {
	                            millonario++;
	                            System.out.print("Es Millonario, ");
	                            contador++;
	                        }
	                        break;
	                    case "Está Mamado":
	                        if (personas.getEstaMamado()) {
	                            mamado++;
	                            System.out.print("Está Mamado, ");
	                            contador++;
	                        }
	                        break;
	                    case "Está Feo":
	            if (personas.getEstaFeo()) {
	                Feo++;
	                System.out.print("Está Feo, ");
	                contador++;
	            }
	            break;
	                    case "Tiene Miedo a Cucarachas":
	            if (personas.getMiedoCucarachas()) {
	                miedoCucarachas++;
	                System.out.print("Tiene Miedo a Cucarachas, ");
	                contador++;
	            }
	            break;
	                    case "Está Cansado":
	            if (personas.getEstaCansado()) {
	                estaCansado++;
	                System.out.print("Está Cansado, ");
	                contador++;
	            }
	            break;
	                    case "Está Enfermo":
	            if (personas.getEstaEnfermo()) {
	                estaEnfermo++;
	                System.out.print("Está Enfermo, ");
	                contador++;
	            }
	            break;
	                    case "Está Triste":
	            if (personas.getEstaTriste()) {
	                estaTriste++;
	                System.out.print("Está Triste, ");
	                contador++;
	            }
	            break;
	                    case "Está Feliz":
	            if (personas.getEstaFeliz()) {
	                estaFeliz++;
	                System.out.print("Está Feliz, ");
	                contador++;
	            }
	            break;
	                }
	                if (contador == 4) {
	                    break;
	                }
	            }
	            System.out.println("");
	        }
	        
	 	    
	        System.out.println();
	        System.out.println("REPETICION DE ATRIBUTOS");
	        System.out.println("El Atributo Tiene Espada se repite: " + espada);
	        System.out.println("El Atributo es Millonario se repite: " + millonario);
	        System.out.println("El Atributo esta Mamado se repite: " + mamado);
	        System.out.println("El Atributo esta Feo se repite: " + Feo);
	        System.out.println("El Atributo Miedo a cucarachas se repite: " + miedoCucarachas);
	        System.out.println("El Atributo está cansado se repite: " + estaCansado);
	        System.out.println("El Atributo está enfermo se repite: " + estaEnfermo);
	        System.out.println("El Atributo está triste se repite: " + estaTriste);
	        System.out.println("El Atributo está feliz se repite: " + estaFeliz);
	        System.out.println();
	       
	         
	        System.out.println("QUE COMIENCE EL JUEGO");
	        
	        int personaElegida = new Random().nextInt(10);
	        
	        //Menú que permite realizar 3 preguntas
	        for (int contadorPreguntas = 0; contadorPreguntas < 3; contadorPreguntas++) {
	            System.out.println("Elija una opción para descartar jugadores:");
	            System.out.println("1. ¿Tiene Espada?");
	            System.out.println("2. ¿Es Millonario?");
	            System.out.println("3. ¿Está Mamado?");
	            System.out.println("4. ¿Está Feo?");
	            System.out.println("5. ¿Tiene Miedo a las Cucarachas?");
	            System.out.println("6. ¿Está Cansado?");
	            System.out.println("7. ¿Está Enfermo?");
	            System.out.println("8. ¿Está Triste?");
	            System.out.println("9. ¿Está Feliz?");
	            
	            int opcion = sc.nextInt();
	            switch (opcion) {
	                case 1:
	                    for (int i = 0; i < 10; i++) {
	                    	  if (persona[i] != null && !persona[i].getTieneEspada()) {
	                              persona[i] = null;
	                          }
	                      }
	                      break;
	                case 2:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEsMillonario()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 3:
	                		for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEstaMamado()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 4:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEstaFeo()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 5:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getMiedoCucarachas()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 6:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEstaCansado()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 7:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEstaEnfermo()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 8:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEstaTriste()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 9:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEstaFeliz()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	}
	         // Aquí es donde debemos actualizar el número de personas elegidas después de cada pregunta.
	            int numeroPersonasElegidas = 0;
	            for (int i = 0; i < 10; i++) {
	            if (persona[i] != null) {
	            numeroPersonasElegidas++;
	            }
	            }
	            // Si después de la pregunta sólo queda una persona, podemos asumir que esa es la elegida y terminar el juego.
	            if (numeroPersonasElegidas == 1) {
	            for (int i = 0; i < 10; i++) {
	            if (persona[i] != null) {
	            	System.out.println("La persona elegida es " + persona[i].getNombre());
	            	break;
	            	}
	            	}
	            	return;
	            	}
	            System.out.println("Las personas que cumplen con la característica son: ");
	            for (int i = 0; i < 10; i++) {
	            if (persona[i] != null) {
	            System.out.println((i + 1) + ". " + persona[i].getNombre());
	            }
	            }
	            System.out.println("");
	            }
	        System.out.println("Elige la persona que crees que es la elegida (Introduce el número de la persona):");
	        int eleccionUsuario = sc.nextInt();
	        eleccionUsuario--;

	      //Comprobamos si la elección del usuario es correcta
	        if (persona[eleccionUsuario] != null) {
	            System.out.println("¡Correcto! La persona elegida es " + persona[eleccionUsuario].getNombre());
	        } else {
	            System.out.println("Incorrecto, la persona elegida no cumplía con las características");
	        }
	        }

	        }
	            