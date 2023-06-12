package problem8;

public class Ship implements java.io.Serializable {
    String type;
    double weight;
    double length;
    String cargoType;
    String companyName;

    public Ship(String type, double weight, double length, String cargoType, String companyName) {
        this.type = type;
        this.weight = weight;
        this.length = length;
        this.cargoType = cargoType;
        this.companyName = companyName;
    }

    public void printShip() {
        System.out.printf("Type: %s%nWeight: %.2f%nLength: %.2f%nCargo type: %s%nCompany name: %s",
                this.type, this.weight, this.length, this.cargoType, this.companyName);
    }
}
