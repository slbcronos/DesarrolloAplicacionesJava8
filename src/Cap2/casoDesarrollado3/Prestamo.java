/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cap2.casoDesarrollado3;

/**
 *
 * @author slb_18
 */
public class Prestamo {
    //Atributos de la Clase
    private String moneda;
    private String bien;
    private int meses;
    private double tasa;
    private double inicial;
    private double valor;
    
    //Get y Set

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getBien() {
        return bien;
    }

    public void setBien(String bien) {
        this.bien = bien;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public double getInicial() {
        return inicial;
    }

    public void setInicial(double inicial) {
        this.inicial = inicial;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    //Metodo para calcular el monto inicial
    public double calculaCuotaInicial(){
        return valor * 0.2;
    }
        
    //Metodo para calcular el monto del riesgo
    public double calcularRiesgo(){
        return valor - calculaCuotaInicial();
    }
    
    //Metodo para calcular cuota mensual
    public double calculaCuotaMensual(){
        return (calcularRiesgo()*1.12)/meses;
    }
    
}
