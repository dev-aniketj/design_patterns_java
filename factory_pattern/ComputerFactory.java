public class ComputerFactory {
    public Computer getComputer(String computer){
        if(computer.equalsIgnoreCase("Laptop")){
            return new Laptop();
        }
        else if(computer.equalsIgnoreCase("Phone")){
            return new Phone();
        }
        else if(computer.equalsIgnoreCase("SmartTV")){
            return new SmartTv();
        }

        return null;
    }
}
