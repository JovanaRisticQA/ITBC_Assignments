package home_assignment_17;

public class Device {
    protected String processors;
    protected String ram;
    protected String memory;

    public Device(){

    }

    public Device(String processors, String ram, String memory) {
        setProcessors(processors);
        setRam(ram);
        setMemory(memory);
    }

    public String getProcessors() {
        return processors;
    }

    public void setProcessors(String processors) {
        this.processors = processors;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Processors: " + processors +
                ", ram: " + ram +
                ", memory: " + memory;
    }
}