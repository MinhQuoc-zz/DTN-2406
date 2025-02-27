package Assignment10.exercise03.entity;

import org.w3c.dom.ls.LSOutput;

public class Program {
    public static void main(String[] args) {
        CPU cpu = new CPU(1000.0);
        CPU.Processor processor = cpu.new Processor(8, "Intel");
        CPU.Ram ram = cpu.new Ram(16, "Samsung");

        System.out.println(processor.getCache());
        System.out.println(ram.getClockSpeed());
    }

}
