package md.tekwill.operationsandciclicfunctions;

public class WeatherForecast {

    public static void main(String[] args) {

        String weatherToday = "snowing";

        switch (weatherToday.toUpperCase()){
            case "SUNNY":
                System.out.println("Is sunny! Go out!");
                break;
            case "RAINNY":
                System.out.println("Is rainny! Stay home!");
                break;
            case "SNOWING":
                System.out.println("Is snowing! Let's go to ski!");
                break;
            case "COLD":
                System.out.println("Is cold! You may need a jaket!");
                break;
            case "HOT":
                System.out.println("Is hot! Grab the hat and water!");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
