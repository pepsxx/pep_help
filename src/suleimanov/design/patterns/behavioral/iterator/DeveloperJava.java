package suleimanov.design.patterns.behavioral.iterator;

public class DeveloperJava {

    private String name;
    private String[] skills;

    public DeveloperJava(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Iterator getIterator() {
        return new SkillIterator();
    }

    // СМ
    public Iterator getIteratorBack() {
        return new SkillIteratorBack();
    }
    // СМ

    private class SkillIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < skills.length;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }

    // СМ
    private class SkillIteratorBack implements Iterator {
        int index = skills.length - 1;
        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Object next() {
            return skills[index--];
        }
    }
    // СМ
}
