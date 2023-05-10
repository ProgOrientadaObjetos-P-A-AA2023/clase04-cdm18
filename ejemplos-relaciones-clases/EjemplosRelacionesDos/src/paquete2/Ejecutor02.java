/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {

    public static void main(String[] args) {
        // 1. Crear una persona de Barrio el Valle de la ciudad de Loja
        // 2. Crear una persona del Barrio Central de la ciudad de Cuenca
        // 3. Crear una persona del Barrio Centenario de la ciuda de Guayaquil

        Ciudad ciudad = new Ciudad("Loja");
        Ciudad ciudad1 = new Ciudad("Cuenca");
        Ciudad ciudad2 = new Ciudad("Guayaquil");

        Barrio barrio = new Barrio("El Valle", ciudad);
        Barrio barrio1 = new Barrio("Barrio Central", ciudad1);
        Barrio barrio2 = new Barrio("Barrio Centenario", ciudad2);

        Persona persona = new Persona("Carlos Mejia", "1100909909", barrio);
        Persona persona1 = new Persona("Daniel Febres", "1150631438", barrio1);
        Persona persona2 = new Persona("Mark Wallaces", "22131515151", barrio2);

        System.out.printf("%s\n", persona);
        System.out.printf("%s\n", persona1);

        System.out.printf("%s\n", persona2);

    }
}
