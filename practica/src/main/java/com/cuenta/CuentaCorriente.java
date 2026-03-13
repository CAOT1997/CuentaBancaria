package com.cuenta;

public class CuentaCorriente extends Cuenta {
      private float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public void retirar(float cantidad) {

        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            sobregiro = cantidad - saldo;
            saldo = 0;
        }

        numeroRetiros++;
    }

    public void consignar(float cantidad) {

        if (sobregiro > 0) {

            if (cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
                saldo += cantidad;
            } else {
                sobregiro -= cantidad;
            }

        } else {
            saldo += cantidad;
        }

        numeroConsignaciones++;
    }

    public void imprimir() {

        super.imprimir();

        int totalTransacciones = numeroConsignaciones + numeroRetiros;

        System.out.println(" El total de transacciones es: " + totalTransacciones);
        System.out.println(" El valor del Sobregiro es: " + sobregiro);
    }
}
