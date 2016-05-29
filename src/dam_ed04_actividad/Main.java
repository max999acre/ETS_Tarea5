/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;


public class Main {
    
    private static final int RETIRAR = 0;
    private static final int INGRESAR = 1;

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            operativa_cuenta(cuenta1, RETIRAR, 2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        try {
            System.out.println("Ingreso en cuenta");
            operativa_cuenta(cuenta1, INGRESAR, 695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        
    }
    
    public static void operativa_cuenta(CCuenta cuenta, int operacion, float cantidad) throws Exception{
        switch(operacion){
            case RETIRAR:
                cuenta.retirar(cantidad);
                break;
            case INGRESAR:
                cuenta.ingresar(cantidad);
                break;
        }
    }
}
