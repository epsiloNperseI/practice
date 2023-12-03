import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String allIdsFilePath = "C:/Users/user/all_ids.csv";
        String publicIdsFilePath = "C:/Users/user/deactivated_ids.csv";
        String otherIdsFilePath = "C:/Users/user/other_ids.csv";

        List<String> allIds = readFile(allIdsFilePath);
        List<String> publicIds = readFile(publicIdsFilePath);

        Set<String> otherIds = new HashSet<>();
        for (String id : allIds) {
            if (!publicIds.contains(id)) {
                otherIds.add(id);
            }
        }

        writeFile(otherIdsFilePath, otherIds);
    }

    private static List<String> readFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    private static void writeFile(String filePath, Set<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
