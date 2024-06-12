import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Muhammad Khiedir Iqbal (22003852)
class Client {
    private String name;
    private String phoneNumber;
    private String carPlateNumber;
    private List<WashSession> washSessions;

    public Client(String name, String phoneNumber, String carPlateNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.carPlateNumber = carPlateNumber;
        this.washSessions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCarPlateNumber() {
        return carPlateNumber;
    }

    public List<WashSession> getWashSessions() {
        return washSessions;
    }

    public void addWashSession(WashSession washSession) {
        washSessions.add(washSession);
    }

    public void removeWashSession(WashSession washSession) {
        washSessions.remove(washSession);
    }
}

//Rayyan Kamil (22005640)
class WashSession {
    private String start;
    private String expectedEnd;
    private String status;
    private WashType washType;
    private Client client;

    public WashSession(String start, String expectedEnd, String status, WashType washType, Client client) {
        this.start = start;
        this.expectedEnd = expectedEnd;
        this.status = status;
        this.washType = washType;
        this.client = client;
    }

    public String getStart() {
        return start;
    }

    public String getExpectedEnd() {
        return expectedEnd;
    }

    public String getStatus() {
        return status;
    }

    public WashType getWashType() {
        return washType;
    }

    public Client getClient() {
        return client;
    }
}

//Muhammad Adam Zafran bin Mohd Ridza (22005617)
class WashType {
    private String name;
    private String description;
    private int timeRequired;
    private Worker workerInCharge;
    private boolean rainCoating;
    private boolean fullWaxInterior;
    private boolean fullWaxExterior;

    public WashType(String name, String description, int timeRequired, Worker workerInCharge, boolean rainCoating, boolean fullWaxInterior, boolean fullWaxExterior) {
        this.name = name;
        this.description = description;
        this.timeRequired = timeRequired;
        this.workerInCharge = workerInCharge;
        this.rainCoating = rainCoating;
        this.fullWaxInterior = fullWaxInterior;
        this.fullWaxExterior = fullWaxExterior;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getTimeRequired() {
        return timeRequired;
    }

    public Worker getWorkerInCharge() {
        return workerInCharge;
    }

    public boolean hasRainCoating() {
        return rainCoating;
    }

    public boolean hasFullWaxInterior() {
        return fullWaxInterior;
    }

    public boolean hasFullWaxExterior() {
        return fullWaxExterior;
    }

    @Override
    public String toString() {
        return "WashType{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' + 
                ", timeRequired=" + timeRequired +
                ", workerInCharge=" + workerInCharge.getName() +
                ", rainCoating=" + rainCoating +
                ", fullWaxInterior=" + fullWaxInterior +
                ", fullWaxExterior=" + fullWaxExterior +
                '}';
    }
}

//Rayyan Kamil (22005640)
class Worker {
    private String name;
    private int id;

    public Worker(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

//Nik Muhammad Adam (22005624)
class ClientManager {
    private List<Client> clients;

    public ClientManager() {
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }

    public void printClients() {
        for (Client client : clients) {
            System.out.println("Client's Name: " + client.getName());
            System.out.println("Client's Phone Number: " + client.getPhoneNumber());
            System.out.println("Client's Car Plate Number: " + client.getCarPlateNumber());
            System.out.println("______________________________________________________________");
        }
    }

    public Client findClient(String name) {
        for (Client client : clients) {
            if (client.getName().equals(name)) {
                return client;
            }
        }
        return null;
    }
}

//Muhammad Khiedir Iqbal (22003852)
class WashSessionManager {
    private List<WashSession> washSessions;

    public WashSessionManager() {
        this.washSessions = new ArrayList<>();
    }

    public void addWashSession(WashSession washSession) {
        washSessions.add(washSession);
    }

    public void removeWashSession(WashSession washSession) {
        washSessions.remove(washSession);
    }

    public void printWashSessions() {
        for (WashSession washSession : washSessions) {
            System.out.println("-----: Worker's In Charge :-----");
            System.out.println("Worker's Name: " + washSession.getWashType().getWorkerInCharge().getName());
            System.out.println("Worker's ID: " + washSession.getWashType().getWorkerInCharge().getId());
            System.out.println("-----: Client :-----");
            System.out.println("Client's Name: " + washSession.getClient().getName());
            System.out.println("Client's Phone Number: " + washSession.getClient().getPhoneNumber());
            System.out.println("Client's Car Plate Number: " + washSession.getClient().getCarPlateNumber());
            System.out.println("Wash Type: " + washSession.getWashType().getName());
            System.out.println("Rain Coating: " + washSession.getWashType().hasRainCoating());
            System.out.println("Full Wax Interior: " + washSession.getWashType().hasFullWaxInterior());
            System.out.println("Full Wax Exterior: " + washSession.getWashType().hasFullWaxExterior());
            System.out.println("Session Start: " + washSession.getStart());
            System.out.println("Session End: " + washSession.getExpectedEnd());
            System.out.println("______________________________________________________________");
        }
    }

    public WashSession findWashSession(String start) {
        for (WashSession washSession : washSessions) {
            if (washSession.getStart().equals(start)) {
                return washSession;
            }
        }
        return null;
    }
}

//Muhammad Adam Zafran bin Mohd Ridza (22005617)
public class BroFreshAndClean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ClientManager clientManager = new ClientManager();
        WashSessionManager washSessionManager = new WashSessionManager();

        System.out.println("Enter client first name:");
        String clientFirstName = scanner.nextLine();
        System.out.println("Enter client last name:");
        String clientLastName = scanner.nextLine();
        ClientName clientName = new ClientName(clientFirstName, clientLastName);

        System.out.println("Enter client street:");
        String clientStreet = scanner.nextLine();
        System.out.println("Enter client city:");
        String clientCity = scanner.nextLine();
        System.out.println("Enter client state:");
        String clientState = scanner.nextLine();
        System.out.println("Enter client zip:");
        String clientZip = scanner.nextLine();
        Address clientAddress = new Address(clientStreet, clientCity, clientState, clientZip);

        System.out.println("Enter client phone number:");
        String clientPhoneNumber = scanner.nextLine();
        System.out.println("Enter client car plate number:");
        String clientCarPlateNumber = scanner.nextLine();
        Client client = new Client(clientFirstName + " " + clientLastName, clientPhoneNumber, clientCarPlateNumber);

        System.out.println("Enter worker name for basic wash:");
        String workerName = scanner.nextLine();
        System.out.println("Enter worker ID for basic wash:");
        int workerId = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        Worker worker = new Worker(workerName, workerId);

        System.out.println("Do you want to add rain coating? (yes/no)");
        boolean rainCoating = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Do you want full wax interior? (yes/no)");
        boolean fullWaxInterior = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Do you want full wax exterior? (yes/no)");
        boolean fullWaxExterior = scanner.nextLine().equalsIgnoreCase("yes");

        WashType washType = new WashType("Basic Wash", "Basic wash service", 30, worker, rainCoating, fullWaxInterior, fullWaxExterior);

        System.out.println("Enter wash session start time (e.g., 10:00 AM):");
        String washSessionStart = scanner.nextLine();
        System.out.println("Enter wash session expected end time (e.g., 11:00 AM):");
        String washSessionExpectedEnd = scanner.nextLine();
        System.out.println("Enter wash session status (In Progress/Completed):");
        String washSessionStatus = scanner.nextLine();

        WashSession washSession = new WashSession(washSessionStart, washSessionExpectedEnd, washSessionStatus, washType, client);
        washSessionManager.addWashSession(washSession);
        client.addWashSession(washSession);

        System.out.println("______________________________________________________________");
        System.out.println("Clients:");
        clientManager.printClients();
        System.out.println("Wash Sessions:");
        washSessionManager.printWashSessions();
        System.out.println("______________________________________________________________");
    }
}