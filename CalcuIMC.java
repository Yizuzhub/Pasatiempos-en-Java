package calculadoraimc;

public class CalculadoraIMC {

    public static void main(String[] args) {
        /*
        Autor: Yizuz
        Fecha de creación: 27/08/2016

        Este programa calcula el imc.
        */
                
        double peso, altura, imc;
        String captura, msg;
        
        JOptionPane.showMessageDialog(null,"Bienvenido a la calculadora de IMC\nLos rangos de valores son:\nPeso(kg): 0-300\nEstatura(metros): 0-3");
        
        captura = System.out.println("Ingresa tu peso(en kg):");
        peso = Double.parseDouble(captura);
        
        //Si el usuario no introduce un valor dentro del rango indicado, termina la ejecucion del programa
        if(0>peso || peso>300){
            System.out.println("Debes dar el peso en kg, y debe ser positivo e inferior a 300.");
        }
        else{
            captura = JOptionPane.showInputDialog("Ingresa tu estatura(en metros)");
            altura = Double.parseDouble(captura);

            //Si el usuario no introduce un valor dentro del rango indicado, termina la ejecucion del programa            
            if(0>altura || altura>3){
                System.out.println("Debes dar la estatura en metros, y debe ser positiva e inferior a 3.");
            }            
            else{//Se calcula el imc y en base a ello se almacena informacion en el String msg, el cual se le mostrara al usuario
                imc = peso/Math.pow(altura, 2);
                msg="Su imc es: " + imc + ", por lo que ";
                        
                if(imc < 18.5){
                    msg+="tiene bajo peso";
                }
                else if(imc < 24.99){
                    msg+="esta en el rango normal";
                }
                else if(imc < 30){
                    msg+="tiene bajo sobrepeso";
                }
                else{
                    msg+="tiene obesidad.";
                }
                System.out.println(msg);
            }
        }            
    }
    
}
