package com.cuenta;

public class CuentaAhorros extends Cuenta {
   private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        activa = saldo >= 10000;
    }

    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        }
    }

    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }
    }

    public void extractoMensual() {

        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }

        super.extractoMensual();

        activa = saldo >= 10000;
    }

    public void imprimir() {

        super.imprimir();

        int totalTransacciones = numeroConsignaciones + numeroRetiros;

        System.out.println("Cuenta activa: " + activa);
        System.out.println(" El total de transacciones es: " + totalTransacciones);
    }  
}
