//Muhammad Adam Zafran bin Mohd Ridza (22005617)
import java.util.ArrayList;
import java.util.List;

public class WashSessionList {
    private List<WashSession> washSessions;

    public WashSessionList() {
        this.washSessions = new ArrayList<>();
    }

    public void addWashSession(WashSession washSession) {
        washSessions.add(washSession);
    }

    public void removeWashSession(WashSession washSession) {
        washSessions.remove(washSession);
    }

    public List<WashSession> getWashSessions() {
        return washSessions;
    }
}