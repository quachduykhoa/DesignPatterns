package Builder;

public class Client {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom.BedroomBuilder()
                .buildBed("Giường đôi")
                .buildBeds(2)
                .buildColor("Xanh")
                .buildTV(true)
                .buildWifi(true)
                .buildAC(true)
                .buildWindows(2)
                .buildSize(25)
                .build();

        System.out.println(bedroom);
    }
}