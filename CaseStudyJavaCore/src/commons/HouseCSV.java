package commons;

import models.House;
import models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class HouseCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LIFE_SEPARATOR = "\n";
    private static final String fileNameHouse = "src/data/House.csv";
    private static final String FILE_HEADER_HOUSE = "id,serviceName,area,rentalFee,maxGuest,rentalType,roomStandard,houseDescription,numberOfFloors";

    public static void writerHouseToFileCSV(ArrayList<House> houseArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameHouse);
            fileWriter.append(FILE_HEADER_HOUSE);
            fileWriter.append(NEW_LIFE_SEPARATOR);
            for (House house : houseArrayList) {
                fileWriter.append(house.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getRentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getMaxGuest()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRentalType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getHouseDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getNumberOfFloors()));
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
    public static ArrayList<House> getFileCSVtoListHouse() {
        BufferedReader br = null;
        ArrayList<House> houseArrayList = new ArrayList<>();
        Path path = Paths.get(fileNameHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameHouse);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameHouse));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                House house = new House();
                house.setId(splitData[0]);
                house.setServiceName(splitData[1]);
                house.setArea(Double.parseDouble(splitData[2]));
                house.setRentalFee(Double.parseDouble(splitData[3]));
                house.setMaxGuest(Integer.parseInt(splitData[4]));
                house.setRentalType(splitData[5]);
                house.setRoomStandard(splitData[6]);
                house.setHouseDescription(splitData[7]);
                house.setNumberOfFloors(Integer.parseInt(splitData[8]));
                houseArrayList.add(house);
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
        return houseArrayList;
    }
}
