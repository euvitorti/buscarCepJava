import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CEP: ");
        String cep = scanner.nextLine();

        SearchCep searchCep = new SearchCep();

        try {
            Address address = searchCep.searchAddress(cep);
            System.out.println(address);
            SaveFile saveFile = new SaveFile();
            saveFile.saveJson(address);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Finish");
    }
}
