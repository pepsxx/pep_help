package suleimanov.design.patterns.behavioral.chainOfResponsibility.v2;

public interface Redactor {

    void setNext (Redactor redactor);

    void redact (String string);
}
