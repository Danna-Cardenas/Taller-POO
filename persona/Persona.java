/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

import java.util.Random;

/**
 *
 * @author DANNA
 */
public class Persona {

   private String nombre;
   private int edad;
   private String cedula;
   private char sexo;
   private double peso;
   private double altura;
   
   public static final int bajoPeso = -1;
   public static final int pesoIdeal = 0;
   public static final int sobrePeso = 1;

    
   public Persona (){
       this.nombre = "";
       this.edad = 0;
       this.cedula = "";
       this.sexo = 'H';
       this.peso = 0;
       this.altura = 0;
       
   }
   
   public Persona (String nombre, int edad, char sexo){
       this.nombre = nombre;
        this.edad = edad;
        this.cedula = "";
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
       
   }

    public Persona(String nombre, int edad, String cedula, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public int calcularIMC() {
        float pesoActual = (float) (peso / Math.pow(altura, 2));
        
        if (pesoActual >= 20 && pesoActual <= 25) {
            return pesoIdeal;
        } else if (pesoActual < 20) {
            return bajoPeso;
        } else {
            return sobrePeso;
        }
    }
    
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
     public void toStringPersona() {
        String _sexo = (sexo == 'H') ? "hombre" : "mujer";
        System.out.println("Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Edad: " + edad + "\n"
                + "Sexo: " + _sexo + "\n"
                + "DNI:\n"
                + "Peso: " + peso + "\n"
                + "Altura: " + altura);
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setNombre("Jaime");
        persona1.setEdad(32);
        persona1.setSexo('H');
        persona1.setPeso(78);
        persona1.setAltura((double) 1.85);

        System.out.println("Persona 1");
        MuestraMensajePeso(persona1);
        MuestraMayorEdad(persona1);
        persona1.toStringPersona();
    }
    public static void MuestraMensajePeso(Persona _persona) {
        int IMC = _persona.calcularIMC();
        switch (IMC) {
            case 0:
                System.out.println("La persona esta en su peso ideal");
                break;
            case -1:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case 1:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }

    public static void MuestraMayorEdad(Persona _persona) {
        if (_persona.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }

    
    private void comprobarSexo() {
        if (sexo != 'H' && sexo != 'M') {
            sexo = 'H';
        }
        System.out.print(sexo);
    }
        
        private void generarCedula() {
        Random rand = new Random();
        StringBuilder cedulaBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            cedulaBuilder.append(rand.nextInt(10));
        }
        cedula = cedulaBuilder.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
   
}
