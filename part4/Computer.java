
public class Computer {

    enum Brand {
        DELL, HP, LENOVO, ASUS, APPLE
    }

    abstract static class Processor {
        protected String model;
        protected int cores;
        protected double frequency;

        public Processor(String model, int cores, double frequency) {
            this.model = model;
            this.cores = cores;
            this.frequency = frequency;
        }

        public abstract String getDescription();
    }

    abstract static class Memory {
        protected int capacity;
        protected String type;

        public Memory(int capacity, String type) {
            this.capacity = capacity;
            this.type = type;
        }

        public abstract String getDescription();
    }

    abstract static class Monitor {
        protected double diagonal;
        protected String resolution;

        public Monitor(double diagonal, String resolution) {
            this.diagonal = diagonal;
            this.resolution = resolution;
        }

        public abstract String getDescription();
    }

    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor,
                    Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public void printInfo() {
        System.out.println("Марка компьютера: " + brand);
        System.out.println("Процессор: " + processor.getDescription());
        System.out.println("Память: " + memory.getDescription());
        System.out.println("Монитор: " + monitor.getDescription());
    }

    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i5", 6, 3.5) {
            @Override
            public String getDescription() {
                return model + ", ядер: " + cores
                        + ", частота: " + frequency + " ГГц";
            }
        };

        Memory memory = new Memory(16, "DDR4") {
            @Override
            public String getDescription() {
                return capacity + " ГБ, тип: " + type;
            }
        };

        Monitor monitor = new Monitor(24, "1920x1080") {
            @Override
            public String getDescription() {
                return diagonal + " дюйма, разрешение: " + resolution;
            }
        };

        Computer computer = new Computer(
                Brand.LENOVO, processor, memory, monitor
        );

        computer.printInfo();
    }
}
