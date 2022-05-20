/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade.computador;

/**
 *
 * @author gusta
 */
public class Memoria {

    public void load(int position, String info) {
        System.out.println("carrega dados na memória");
    }

    public void free(int position, String info) {
        System.out.println("libera dados da memória");
    }
}
