package suleimanov.design.patterns.behavioral.memento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;
    private String code = "";

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public void addCode(String code) {
        this.code += code;
    }

    public Memento save() {
        return new Memento(version, code, date);
    }

    public void load(Memento memento) {
        this.version = memento.getVersion();
        this.code = memento.getCode();
        this.date = memento.getDate();
    }

    @Override
    public String toString() {
        return "version: " + version +
                ", code: " + code +
                ", date: " + date;
    }
}
