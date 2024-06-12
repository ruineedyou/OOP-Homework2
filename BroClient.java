//Muhammad Khiedir Iqbal (22003852)
public class BroClient {
    private ClientName name;
    private Address address;
    private String phoneNumber;
    private String carPlateNumber;
    private WashSessionList washSessions;

    public BroClient(ClientName name, Address address, String phoneNumber, String carPlateNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.carPlateNumber = carPlateNumber;
        this.washSessions = new WashSessionList();
    }

    public ClientName getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCarPlateNumber() {
        return carPlateNumber;
    }

    public WashSessionList getWashSessions() {
        return washSessions;
    }

    public void addWashSession(WashSession washSession) {
        washSessions.addWashSession(washSession);
    }

    public void removeWashSession(WashSession washSession) {
        washSessions.removeWashSession(washSession);
    }
}