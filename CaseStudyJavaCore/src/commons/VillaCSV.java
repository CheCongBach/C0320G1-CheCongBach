package commons;

import models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class VillaCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LIFE_SEPARATOR = "\n";
    private static final String fileNameVilla = "src/data/Villa.csv";
    private static final String FILE_HEADER_VILLA = "id,serviceName,area,rentalFee,maxGuest,rentalType,roomStandard,villaDescription," +
            "numberOfFloors,poolArea";
    public static void writerVillaToFileCSV(ArrayList<Villa> villaArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameVilla);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LIFE_SEPARATOR);
            for (Villa villa : villaArrayList) {
                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getRentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getMaxGuest()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRentalType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getVillaDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumberOfFloors()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getPoolArea()));
                fileWriter.append(NEW_LIFE_SEPARATOR);
            }
            System.out.println("Success add");
        } catch (Exception ex) {
            System.out.println("Error in CSV file writer !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }
    public static ArrayList<Villa> getFileCSVtoListVilla() {
        BufferedReader br = null;
        ArrayList<Villa> villaArrayList = new ArrayList<>();
        Path path = Paths.get(fileNameVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameVilla);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameVilla));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setId(splitData[0]);
                villa.setServiceName(splitData[1]);
                villa.setArea(Double.parseDouble(splitData[2]));
                villa.setRentalFee(Double.parseDouble(splitData[3]));
                villa.setMaxGuest(Integer.parseInt(splitData[4]));
                villa.setRentalType(splitData[5]);
                villa.setRoomStandard(splitData[6]);
                villa.setVillaDescription(splitData[7]);
                villa.setNumberOfFloors(Integer.parseInt(splitData[8]));
                villa.setPoolArea(Double.parseDouble(splitData[9]));
                villaArrayList.add(villa);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return villaArrayList;
    }
}
