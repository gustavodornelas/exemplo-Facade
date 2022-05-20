/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade.computador;

/**
 *
 * @author gusta
 */
public class Cpu {

    public void start() {
        System.out.println("inicialização inicial");
    }

    public void execute() {
        System.out.println("executa algo no processador");
    }

    public void load() {
        System.out.println("carrega registrador");
    }

    public void free() {
        System.out.println("libera registradores");
    }
}
