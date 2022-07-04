
package com.mycompany.reto1;

public class CalculadoraNew {
    int operando1;
    int operando2;
    
    public CalculadoraNew(){
        
    }
    
    // Atributos
    public CalculadoraNew(int operando1, int operando2)
    {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    
    //Métodos
    public int sumar(){
        int suma = this.operando1 + this.operando2;
        return suma;
    }
    
    public int restar(){
        int resta = this.operando1 - this.operando2;
        return resta;
    }
    
    public int multiplicacion(){
        int multiplicacion = this.operando1 * this.operando2;
        return multiplicacion;
    }
    
    public double division() {
        double division = (double) this.operando1 / (double) this.operando2;
        return ((double) Math.round(division * 100d) / 100d);
    }

    public double potencia() {
        double potencia = Math.pow(this.operando1, this.operando2);
        return potencia;
    }

    public double raiz_cuadrada() {
        double raiz_cuadrada = Math.sqrt(this.operando1);
        return raiz_cuadrada;
    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
