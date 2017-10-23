package com.结构型模式.外观模式;

/**
 * Created by Yuanping on 2017/10/20.
 */
public class Computer {
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        this.cpu = new CPU();
        this.disk = new Disk();
        this.memory = new Memory();
    }

    //启动电脑
    public void startup() {
        System.out.println("正在启动电脑...");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("电脑启动完毕...");
    }

    //关闭电脑
    public void shutdown() {
        System.out.println("正在关闭电脑...");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("电脑关闭完毕...");
    }
}
