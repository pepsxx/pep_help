package suleimanov.design.patterns.behavioral.memento;

import java.util.Date;

public class Memento {
    private final String version;
    private final Date date;
    private String code;

    public Memento(String version, String code, Date date) {
        this.version = version;
        this.code = code;
        this.date = date;
    }

    public Date getDate() {
        return date;

    }

    public String getVersion() {
        return version;
    }

    public String getCode() {
        return code;
    }
}
