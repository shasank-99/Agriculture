
import java.util.*;

public class Main {
    
    public static void suggestCrop(String soilType, double phLevel) {
        if (soilType.equals("loamy") && phLevel >= 6.0 && phLevel <= 7.0) {
            System.out.println("Suggested Crop: Wheat");
        } else if (soilType.equals("sandy") && phLevel >= 5.5 && phLevel <= 6.5) {
            System.out.println("Suggested Crop: Groundnuts");
        } else {
            System.out.println("Suggested Crop: Rice");
        }
    }
    
    public static void adviseSoilManagement(String soilType) {
        switch (soilType.toLowerCase()) {
            case "clay":
                System.out.println("Advice: Incorporate organic materials to enhance drainage.");
                break;
            case "loamy":
                System.out.println("Advice: Soil has good balance, maintain a pH of 6.0 to 7.0.");
                break;
            case "sandy":
                System.out.println("Advice: Boost water retention by adding compost.");
                break;
            default:
                System.out.println("Advice: Unrecognized soil type, consider seeking expert advice.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ph = scanner.nextDouble();
        String soilType = scanner.next();
        suggestCrop(soilType, ph);
        adviseSoilManagement(soilType);
    }
}
