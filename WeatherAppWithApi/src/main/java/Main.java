import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        readCVSfile("C:\\Programming\\Java_fstetler\\WeatherAppWithApi\\src\\main\\java\\cvsfilepath\\forecast.csv");
    }


    public static void readCVSfile(String cvsPath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(cvsPath));
        scanner.useDelimiter(",");

        while(scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }

}
