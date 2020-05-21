package commons;

import models.Room;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class RoomCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LIFE_SEPARATOR = "\n";
    private static final String fileNameRoom = "src/data/Room.csv";
    private static final String FILE_HEADER_ROOM = "serviceName,area,rentalFee,maxGuest,rentalType,externalServices";

    public static void writerRoomToFileCSV (ArrayList<Room> roomArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameRoom);
            fileWriter.append(FILE_HEADER_ROOM);
            fileWriter.append(NEW_LIFE_SEPARATOR);
            for (Room room : roomArrayList) {
                fileWriter.append(room.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getRentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getMaxGuest()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getRentalType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getExternalServices());
                fileWriter.append(NEW_LIFE_SEPARATOR);
                System.out.println("Success add");
            }
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
    public static ArrayList<Room> getFileCSVtoListRoom() {
        BufferedReader br = null;
        ArrayList<Room> roomArrayList = new ArrayList<>();
        Path path = Paths.get(fileNameRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameRoom);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameRoom));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("serviceName")) {
                    continue;
                }
                Room room = new Room();
                room.setServiceName(splitData[0]);
                room.setArea(Double.parseDouble(splitData[1]));
                room.setRentalFee(Double.parseDouble(splitData[2]));
                room.setMaxGuest(Integer.parseInt(splitData[3]));
                room.setRentalType(splitData[4]);
                room.setExternalServices(splitData[5]);
                roomArrayList.add(room);
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
        return roomArrayList;
    }
}
