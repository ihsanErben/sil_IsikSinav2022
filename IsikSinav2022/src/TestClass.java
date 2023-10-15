
public class TestClass {
    
    public static void main(String[] args) {
        CarStore cstore = new CarStore("Istanbul Oto Plaza");
        cstore.printCarInventory();
        
        Car car1 = new Car("Audi", "A5", "Benzin", "Automatic", "Blue", 0,0,1350000);
        Car car2 = new Car("Volkswagen", "Passat", "Diesel", "Manual", "Black", 2220,565,850000);
        Car car3 = new Car("Ford", "Fiesta", "Diesel", "Manual", "Red", 0,0,625000);
        Car car4 = new Car("Toyota", "RAV4", "Hybrid", "Automatic", "Blue", 0,0,1397000);
        Car car5 = new Car("Peugeot", "206", "Benzin", "Manual", "White", 2000,505,497000);
        Car car6 = new Car("Peugeot", "2008", "Hybrid", "Automatic", "Black", 2200,550,397000);
        Car car7 = new Car("Hyundai", "SantaFe", "Electric", "Automatic","Red", 2000,505,1397000);
        Car car8 = new Car("Ford", "Fiesta", "Diesel", "Automatic", "Green", 2000,505,397000);
        
        cstore.addCar(car1);
        cstore.addCar(car2);
        cstore.addCar(car3);
        cstore.addCar(car4);
        cstore.addCar(car5);
        cstore.addCar(car6);
        cstore.addCar(car7);
        cstore.addCar(car8);
        
        cstore.printCarInventory();
        
       
        System.out.println("There are total "+ cstore.getTotalNumberOfCars() + " cars in the store.\n");
        
        System.out.print("Find number of Diesel Manuel cars in the store: ");
        System.out.println(cstore.getNumberOfCarsInAType(car2));
        System.out.print("Find number of Hybrid Automatic cars in the store: ");
        System.out.println(cstore.getNumberOfCarsInAType(car4));
       
        
        System.out.println("\nComparing volumes of car2 and car6: ");
        if (car2.hasAGreaterVolumeThan(car6)){
            System.out.println(car2.toString() +
                    " has a bigger volume than " +  
                    car6.toString());
        }
        
        System.out.println("\nTotal price of all cars in the store: " +
                cstore.getTotalValueOfAllCars() + "TL");
       
        
     
    }
    
}
