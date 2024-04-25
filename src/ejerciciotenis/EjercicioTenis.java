package ejerciciotenis;

import java.util.Scanner;

public class EjercicioTenis {
    /*
     Un periodista debe relatar un partido de tenis, pero no conoce las reglas 
    del deporte. En particular, no ha logrado aprender cómo saber si un set ya 
    terminó, y quién lo ganó. Un partido de tenis se divide en sets. Para ganar
    un set, un jugador debe ganar 6 juegos, pero además debe haber ganado por lo
    menos dos juegos más que su rival. Si el set está empatado a 5 juegos, el 
    ganador es el primero que llegue a 7. Si el set está empatado a 6 juegos, 
    el set se define en un último juego, en cuyo caso el resultado final es 7-6.
    Sabiendo que el jugador A ha ganado m juegos, y el jugador B, n juegos, al 
    periodista le gustaría saber: 
    si A ganó el set 
    si B ganó el set
    si el set todavía no termina
    si el resultado es inválido (por ejemplo, 8-6 o 7-3)
     */
    public static void main(String[] args) {
        Scanner puntos = new Scanner(System.in);
        
        System.out.println("ingresa el puntaje del primer jugador");
        int puntA = puntos.nextInt();
        
        System.out.println("ingresa el puntaje del segundo jugador");
        int puntB = puntos.nextInt();
        
        if(puntA < 7 && puntB < 7){
            System.out.println("el partido aún no termimnó");
        }else if((puntA == 6 && puntB <=4) || (puntA == 7 && (puntB == 5 || puntB == 6))){
            System.out.println("gano el jugador A");
        }else if((puntB == 6 && puntA <=4) || (puntB == 7 && (puntA == 5 || puntA == 6))){
            System.out.println("gano el jugador B");
        }else{
            System.out.println("invalido");
        }
        
            /* if((puntA > 6 && puntB > 6) || (puntA > 7 || puntB > 7)){
            System.out.println("resultado invalido");
        }else if((puntA == 7 && puntB <= 4) || (puntB == 7 && puntA <= 4)){
            System.out.println("puntos invalidos");
        }*/
    }
    
}
