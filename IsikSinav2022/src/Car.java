import java.util.Date;
import java.util.Random;


public class Car {
    private String brand;
    private String model;
    private String energySource;
    private String gearType;
    private String color;
    private int[] volumes;
    private double price;
    private int barcodeID;
    private Date dateCreated;

    private static int idInitValue = (new Random()).nextInt(9999999);

    public Car(String brand, String model, String energySource, String gearType) {
        this.brand = brand;
        this.model = model;
        this.energySource = energySource;
        this.gearType = gearType;

    }

    public Car(String brand, String model, String energySource, String gearType, String color, int innerVolume, int bootVolume, double price) {
        this.brand = brand; //nc
        this.model = model; //nc
        this.energySource = energySource; //nc
        this.gearType = gearType; //nc

        this.color = color;
        this.volumes = new int[2];
        this.volumes[0] = innerVolume;
        this.volumes[1] = bootVolume;
        this.price = price;

        this.barcodeID = idInitValue++;
        this.dateCreated = new Date();
    }
    
    public String getBrand() {
        return brand;
    }public String getModel() {
        return model;
    }public String getEnergySource() {
        return energySource;
    }public String getGearType() {
        return gearType;
    }public int getBarcodeID() {
        return barcodeID;
    }public String getDateCreated() {
        return dateCreated.toString();
    }public String getColor() {
        return color;
    }public void setColor(String color) {
        this.color = color;
    }public double getPrice() {
        return price;
    }public void setPrice(double price) {
        this.price = price;
    }public int getInnerVolume() {
        return volumes[0];
    }public void setInnerVolume(int innerVolume) {
        this.volumes[0] = innerVolume;
    }public int getBootVolume() {
        return volumes[1];
    }public void setBootVolume(int bootVolume) {
        this.volumes[1] = bootVolume;
    }
    
    public int getAgeOfCarInDays () {
        Date now = new Date();
        int ageInDays = (int) (dateCreated.getTime() - now.getTime()) / (24 * 60 * 60 * 1000);
        return ageInDays;
    }
    
    
        public boolean isTheSameType(Car another) {

        if (this.energySource.equals(another.energySource)
                && this.gearType.equals(another.gearType)) {
            return true;
        }

        return false;

    }

    public String toString() {
        return this.barcodeID + ": " + this.brand + "-" + this.model + "-"
                + this.energySource + "-" + this.gearType + "-" + this.price + "TL";
    }
    
    
    //Q4
    public boolean hasAGreaterVolumeThan(Car another){
        //If this car’s total volume is greater than another car’s total volume, 
        //the method returns true; otherwise it returns false.
        
        if ((this.volumes[0] + this.volumes[1]) > 
                (another.volumes[0] + another.volumes[1]))
            return true;
        else
            return false;       
    }

}
