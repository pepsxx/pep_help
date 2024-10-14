package suleimanov.design.patterns.behavioral.memento;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Project project = new Project();
        GitHubRepo repo = new GitHubRepo();

        System.out.println("Creating new project v1.0");
        project.addCode("firstCode ");
        project.setVersionAndDate("1.0");
        System.out.println("project = " + project);
        System.out.println("save project");
        repo.setSave(project.save());
        System.out.println("-------------------------");
        Thread.sleep(1000);

        System.out.println("updating project  to v1.1");
        project.addCode("secondCode ");
        project.setVersionAndDate("1.1");
        System.out.println("project = " + project);
        System.out.println("save project");
        repo.setSave(project.save());
        System.out.println("-------------------------");
        Thread.sleep(1000);

        System.out.println("updating project  to v1.2");
        project.addCode("badCode ");
        project.setVersionAndDate("1.2");
        System.out.println("project = " + project);
        System.out.println("save project");
        repo.setSave(project.save());
        System.out.println("-------------------------");
        Thread.sleep(1000);

        System.out.println("cod is bad to v1.2");
        System.out.println("load project v1.1");
        project.load(repo.getSave("1.1"));
        System.out.println("project = " + project);
        System.out.println("-------------------------");
        Thread.sleep(1000);


    }
}
