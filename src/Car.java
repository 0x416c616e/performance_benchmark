public class Car implements Runnable {

    private int horsepower;
    private int torque;
    private String make;
    private String model;
    private int year;
    private double price;
    private boolean isManual;
    private String type;

    public void run() {
        int sum = 0;
        for (int i = 0; i < 25_000; i++) {
            sum += i;
            sum /= 2;
            sum *= 2;
            sum -= 1;
            sum += 1;
        }
    }


    public Car() {
        this.setHorsepower(200);
        this.setTorque(200);
        this.setMake("Toyota");
        this.setModel("Camry");
        this.setYear(2020);
        this.setPrice(20000);
        this.setManual(false);
        this.setType("Sedan");
    }

    public Car(int horsepower, int torque, String make, String model, int year, double price, boolean isManual, String type) {
        this.setHorsepower(horsepower);
        this.setTorque(torque);
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
        this.setPrice(price);
        this.setManual(isManual);
        this.setType(type);
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public int getTorque() {
        return torque;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }
    public boolean getManual() {
        return isManual;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsepower=" + horsepower +
                ", torque=" + torque +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", isManual=" + isManual +
                ", type='" + type + '\'' +
                '}';
    }
}
