package suleimanov.design.patterns.structural.proxy;

public class ProjectProxy implements Project {
    private final String url;
    private ProjectReal projectReal;

    public ProjectProxy(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (projectReal == null) {
            projectReal = new ProjectReal(url);
        }
        projectReal.run();
    }
}
