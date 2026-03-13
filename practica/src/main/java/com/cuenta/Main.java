package com.cuenta;

public class Main { 
public static void main(String[] args) { 
      
        System.out.println("Cuenta de Ahorros");

        CuentaAhorros cuenta = new CuentaAhorros(150000, 3);

        cuenta.consignar(250000);

        cuenta.retirar(100000);
        cuenta.retirar(10000);
        cuenta.retirar(10000);
        cuenta.retirar(10000);
        cuenta.retirar(20000);

        cuenta.extractoMensual();
        cuenta.imprimir();


        System.out.println("Cuenta Corriente");

        CuentaCorriente cuenta2 = new CuentaCorriente(80000, 2);

        cuenta2.retirar(15000); 
        cuenta2.consignar(35000);

        cuenta2.extractoMensual();
        cuenta2.imprimir();
    }
}
