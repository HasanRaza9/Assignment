import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandlingExample {

    public static void main(String[] args) {

        String path = "D://Hasan Raza//Weekend.txt";
        try{

            System.out.println("Please input data: ");
            Scanner input = new Scanner(System.in);

            String s = input.nextLine();
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(s);
            fileWriter.close();

            char[] array = new char[60];
            FileReader fileReader = new FileReader(path);

            // Step 2: Reads characters
            fileReader.read(array);

            System.out.println("Data in the file:");
            System.out.println(array);

            // Step 3: Closes the reader
            input.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
