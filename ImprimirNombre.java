package imprimirnombre;

public class ImprimirNombre {
    
    public static void main(String[] args) {
        /*
        Mi programa imprime en patanlla Fer.
        
        Puede utilizarse para imprimir nombres, etc.
        
        Está en función de "s" en los enteros positivos, para poder cambiarle el
        valor asignado (en este caso le asigne de 8 para que tenga buen aspecto)
        siempre y cuando sea un entero positivo, y sigue funcionando correctamente.
        
        Para poder hacer mas breve mi programa, cree dos funciones: lleno y vacio.
        "lleno" crea un bloque de 1 fila y de s columnas (en este caso, de 1
        fila y 6 columnas, es decir, 8 puntos alineados horizontalmente).
        Por otro lado, vacio imprime una fila de s espacios.
        */
        
        int i, s;
        
        s = 6;
        /*
        En cada for, al final, puse un System.out.println("") para indicar
        que, como ya termino un "ciclo" del for, comenzaremos un ciclo distinto
        (ya sea del mismo for o del siguiente), para que imprima el siguiente
        bloque
        */
        
        for(i = 0; i < s; i++){ //Este for imprime la parte de arriba. 
            lleno(s*3);
            vacio(s);
            lleno(s*3);
            vacio(s);
            lleno(s*3);
            System.out.println("");
        }
        for(i = 0; i < s; i++){ //Este for imprime la segunda seccion
            lleno(s);
            vacio(s*3);
            lleno(s);
            vacio(s*3);
            lleno(s);
            vacio(s);
            lleno(s);
            System.out.println("");
        }
        for(i = 0; i < s/2; i++){ //Este for imprime la seccio tercera.
            lleno(s*3);
            vacio(s);
            lleno(s*3);
            vacio(s);
            lleno(s*3);
            System.out.println("");
        }
        for(i = 0; i < s/2; i++){ //Este for imprime la seccio tercera.
            lleno(s*3);
            vacio(s);
            lleno(s*3);
            vacio(s);
            lleno(s);
            vacio(s/2);
            lleno(s);
            System.out.println("");
        }
        for(i = 0; i < s; i++){ //Este for imprime la seccion que esta antes del espacio.
            lleno(s);
            vacio(s*3);
            lleno(s);
            vacio(s*3);
            lleno(s);
            vacio(s);
            lleno(s);
            System.out.println(""); //Indica que, como ya termino un "ciclo" del for, comenzaremos un ciclo distinto (ya sea del mismo for o del siguiente), para que imprima el siguiente bloque
        }
        for(i = 0; i < s; i++){ //Evidentemente, este for "imprime" el vacio antes mencionado.
            lleno(s);
            vacio(s*3);
            lleno(s*3);
            vacio(s);
            lleno(s);
            vacio(s);
            lleno(s);
            System.out.println("");
        }

        /*
        Autor: Yizuz
        Fecha: 6/abril/2016
        */
    }
    
    public static void lleno(int n){
        int i;
        char caracter = '*';
        for(i=0; i < n*2; i++){
            System.out.print(caracter);
        }
    }
    
    public static void vacio(int n){
        int i;
        for(i = 0; i<n*2; i++){
            System.out.print(" ");
        }
    }
    
}