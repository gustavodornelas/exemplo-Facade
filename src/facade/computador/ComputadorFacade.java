/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade.computador;

/**
 *
 * @author gusta
 */
public class ComputadorFacade {

    private Cpu cpu;
    private Memoria memoria;
    private HardDrive hardDrive;

    public ComputadorFacade(Cpu cpu, Memoria memoria, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memoria = memoria;
        this.hardDrive = hardDrive;
    }

    public void ligarComputador() {

        int BOOT_ADDRESS = 15;

        cpu.start();
        String hdBootInfo = hardDrive.read(BOOT_ADDRESS, 2048);
        memoria.load(BOOT_ADDRESS, hdBootInfo);
        cpu.load();
        cpu.execute();
        memoria.free(BOOT_ADDRESS, hdBootInfo);
        cpu.free();
    }
}
