package suleimanov.design.patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {

        ProducerJobs producerJobs = new ProducerJobs();
        producerJobs.addVacancy("Java developer");
        producerJobs.addVacancy("C++  developer");

        Subscriber subscriber1 = new Subscriber("Alex");
        Subscriber subscriber2 = new Subscriber("Jonn");

        subscriber1.subscribe(producerJobs);
        subscriber2.subscribe(producerJobs);

        producerJobs.addVacancy("Python developer");

        subscriber1.unsubscribe(producerJobs);

        producerJobs.removeVacancy("Java developer");

    }
}
