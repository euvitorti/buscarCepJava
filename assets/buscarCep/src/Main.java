public class Main {
    public static void main(String[] args) {
        SearchCep searchCep = new SearchCep();
        Address address = searchCep.searchAddress("40490238");
        System.out.println(address);
    }
}
    