package efrei.fr.util;

import efrei.fr.repository.EmployeeRepository;

import java.io.*;
import java.util.UUID;

public class Helper {
    public static boolean isNullOrEmpty(String s) {
        if ((s == null) || (s.isEmpty())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isZero(int s) {
        if ((s == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static String generateId() {
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        return id;
    }

    public static void Serialization(EmployeeRepository repositoryemp) {
        try {
            FileOutputStream foutstr = new FileOutputStream("STARTUP.ser");
            ObjectOutputStream ooutstr = new ObjectOutputStream(foutstr);
            ooutstr.writeObject(repositoryemp);
            ooutstr.flush();
            ooutstr.close();
            foutstr.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static EmployeeRepository DeSerialization() {
        EmployeeRepository repositoryemp = EmployeeRepository.getRepository();
        try {
            FileInputStream fintstr = new FileInputStream("STARTUP.ser");
            ObjectInputStream ointstr = new ObjectInputStream(fintstr);
            repositoryemp = (EmployeeRepository) ointstr.readObject();
            ointstr.close();
            fintstr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return repositoryemp;
    }

}