package suleimanov.design.patterns.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

public class GitHubRepo {
    private Map<String, Memento> mapSave = new HashMap<>();

    public void setSave(Memento memento) {
        mapSave.put(memento.getVersion(), memento);
    }

    public Memento getSave(String version) {
        return mapSave.get(version);
    }

}
