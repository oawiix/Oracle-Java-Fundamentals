package Java.OracleJavaFundamentals.Veiculos;

public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Vehicle.Make);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
        Vehicle vehicle1 = new Vehicle("Vision"); // cria um novo veiculo
        //System.out.println(vehicle1.chassisNo);
        //System.out.println(vehicle1.model);
        Vehicle vehicle2 = new Vehicle("Edict"); // cria um novo veiculo
        //System.out.println(vehicle2.chassisNo);
        //System.out.println(vehicle2.model);
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());
        vehicle2.setMake("Seer"); // muda a fabricante (static) da classe Vehicle pelo objeto Vehicle2
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());
        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
        System.out.println(
        "Vehicle number " + vehicle3.getChassisNo() 
        + " is a " + vehicle3.getModel() + " model"
        + " and has an engine capacity of " + Vehicle.Engine.getCapacity() + "cc"
        );

    }
}
