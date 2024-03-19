package Java.OracleJavaFundamentals.Veiculos;

public class Vehicle {
    public static String Make = "Augur";
    public static int numVehicles = 0;
    String chassisNo;
    String model;

    public Vehicle(){  // construtor padrão
        chassisNo = "null";
        model = "null";
    }
    public Vehicle(String model){  // construtor com parametro
        numVehicles++;
        chassisNo = "ch" + numVehicles;
        this.model = model;
        System.out.println("Vehicle manufactured");
    }
    public void setMake(String Make){ // metodo para setar a fabricante
        Vehicle.Make = Make;
    }
    public void setChassisNo(String chassisNo){ // metodo para setar o chassis
        this.chassisNo = chassisNo;

    }
    public void setModel(String model){ // metodo para setar o modelo
        this.model = model;
    }   
    public String getChassisNo(){ // metodo para pegar o chassis
        return chassisNo;
    }
    public String getModel(){  // metodo para pegar o modelo
        return model;
    }
    public int totalVehicles(){ // metodo para pegar o total de veiculos
        return numVehicles;
    }   
    public static class Engine extends Vehicle{
        public Engine(String model){
           super(model);
        }
        private static String MAKE = "Predicter";
        private static int CAPACITY = 1600;
        public static String getMake(){
            return MAKE;
        }
        public static int getCapacity(){
            return CAPACITY;
        }
        
    }
    public String toString(){
        return 
        "The vehicle is manufactured by: " + Make 
      //  + "\nNumber of vehicles manufactured:" + numVehicles
        + "\nThe model type is: " + model 
        + "\nThe chassis number is: " + chassisNo
        + "\nThe engine make is: " + Engine.getMake()
        + "\nThe engine capacity is: " + Engine.getCapacity() 
        + "\nVehicle manufactured";
    }

}
