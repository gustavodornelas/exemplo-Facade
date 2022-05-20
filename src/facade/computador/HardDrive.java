/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade.computador;

/**
 *
 * @author gusta
 */
public class HardDrive {

    public String read(int startPosition, int size) {
        return "lê dados do HD";
    }

    public void write(int position, String info) {
        System.out.println("escreve dados no HD");
    }
}
