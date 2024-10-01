package suleimanov.design.patterns.structural.proxy;

public class ProjectReal implements Project{
    private String url;

    public ProjectReal(String url) {
        this.url = url;
        loadProject();
    }

    public void loadProject() {
        System.out.println("Loading project " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + "...");
    }
}
