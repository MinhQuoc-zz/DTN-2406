package Assignment10.exercise03.entity;

public class CPU {
    private double price;

    public CPU(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public class Processor {
        private int coreAmount;
        private String manufacturer;

        public Processor(int coreAmount, String manufacturer) {
            this.coreAmount = coreAmount;
            this.manufacturer = manufacturer;
        }

        public double getCache() {
            return 4.3;
        }

        public int getCoreAmount() {
            return coreAmount;
        }

        public void setCoreAmount(int coreAmount) {
            this.coreAmount = coreAmount;
        }

        public String getManufacturer() {
            return manufacturer;
        }
        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
    }

    public class Ram{
        private int memory;
        private String manufacturer;
        public Ram(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public double getClockSpeed() {
            return 5.5;
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }
        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
    }


}
