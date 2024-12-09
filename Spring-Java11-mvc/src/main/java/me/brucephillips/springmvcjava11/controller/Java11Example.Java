import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class Java11Example {
    public static void main(String[] args) throws IOException {
        // Reading a file and printing its content
        Path filePath = Path.of("example.txt");
        String fileContent = Files.readString(filePath);
        System.out.println("File Content: " + fileContent);

        // Handling Optional values
        Optional<String> optionalValue = Optional.ofNullable(getNullableValue());
        if (optionalValue.isPresent()) {
            System.out.println("Value is present: " + optionalValue.get());
        } else {
            System.out.println("Value is not present");
        }

        // Using a traditional switch-case
        int day = 5;
        String dayType;
        switch (day) {
            case 1:
            case 7:
                dayType = "Weekend";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dayType = "Weekday";
                break;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
        System.out.println("Day type: " + dayType);

        // Checking type with instanceof
        Object obj = getNullableValue();
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("Object is a String: " + str);
        } else {
            System.out.println("Object is not a String");
        }
    }

    private static String getNullableValue() {
        return null; // Simulates a nullable value
    }
}
