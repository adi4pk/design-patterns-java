package app.ex5.models;

import java.util.List;

public class IncarcatorUtilizatori {
    private final List<FabricaUtilizator> fabrici;

    public IncarcatorUtilizatori(List<FabricaUtilizator> fabrici) {
        if (fabrici == null || fabrici.isEmpty()) {
            throw new IllegalArgumentException("At least one factory is required");
        }
        this.fabrici = fabrici;
    }

    public List<Utilizator> incarca(List<String> linii) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
