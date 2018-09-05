package com.tjw.design.createmode.build;

/**
 * @author Mr.Tang
 * @date 2018/9/4
 */
public class Computer {
    private String cpu;
    private String hardDisk;
    private String memory;
    private String mainBoard;
    private String displayCard;

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", displayCard='" + displayCard + '\'' +
                '}';
    }

    public Computer(ComputerBuilder computerBuilder){
        this.cpu = computerBuilder.cpu;
        this.hardDisk = computerBuilder.hardDisk;
        this.memory = computerBuilder.memory;
        this.mainBoard = computerBuilder.mainBoard;
        this.displayCard = computerBuilder.displayCard;
    }
    public static class ComputerBuilder{
        private String cpu;
        private String hardDisk;
        private String memory;
        private String mainBoard;
        private String displayCard;
        public ComputerBuilder buildCpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public ComputerBuilder buildHardDisk(String hardDisk){
            this.hardDisk = hardDisk;
            return this;
        }
        public ComputerBuilder buildMemory(String memory){
            this.memory = memory;
            return this;
        }
        public ComputerBuilder buildMainBoard(String mainBoard){
            this.mainBoard = mainBoard;
            return this;
        }
        public ComputerBuilder buildDisplayCard(String displayCard){
            this.displayCard = displayCard;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }
}
