package polimorfimsExample.entities;

public class Employees {
    protected String name;
    protected Integer hours;
    protected Double valuePerHour;

    public Employees() {
    }

    public Employees(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        double total = 1.0;
        total = valuePerHour * hours;
        return total;
    }
}
