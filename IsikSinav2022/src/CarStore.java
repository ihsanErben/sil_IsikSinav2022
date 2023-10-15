

import java.util.ArrayList;


public class CarStore {
    private String storeName;
    private static final int MAX_NUMBER_OF_CARS = 15;
    private ArrayList<Car> listOfCars = new ArrayList<Car>();
    private int numberOfCarTypes = 0;
    private int totalNumberOfCars = 0;

    public CarStore(String storeName) {
        this.storeName = storeName;
    }
    public String getStoreName() {
        return storeName;
    }public void setStoreName(String storeName) {
        this.storeName = storeName;
    }public int getNumberOfCarTypes() {
        return numberOfCarTypes;
    }public int getTotalNumberOfCars() {
        return totalNumberOfCars;
    }

    public void printCarInventory() {
        System.out.println("Printing cars available in " + storeName + "...");
        if (listOfCars.isEmpty()){
            System.out.println("Car store’s inventory is empty at the moment.");
            return;
        }
            
        for (Car c : listOfCars) {
            System.out.println(c.toString());
        }
    }

    public int addCar(Car c) {
        if (totalNumberOfCars < MAX_NUMBER_OF_CARS) {
            listOfCars.add(c);
            totalNumberOfCars++;
            return listOfCars.size()-1;
        }else
            return -1;
    }

    public int findCarInStore(Car c) {
        return listOfCars.indexOf(c);
    }

    public int getNumberOfCarsInAType(Car cType){ 
        int numOfCarsInThisType = 0;
        for (int i = 0; i < listOfCars.size(); i++){
            Car current = listOfCars.get(i);
            if (cType.isTheSameType(current))
                numOfCarsInThisType++;            
        }
        
        return numOfCarsInThisType;
    }
    
    public double getTotalValueOfAllCars() {
        double sum = 0;
        for (Car c : listOfCars) {
            sum += c.getPrice();
        }
        return sum;
    }
    
  
}//end of class
