package file.system;

public abstract class Component {

    protected String name;
    protected int level = 0;

    protected abstract void print();

    public Component(String name) {
        this.name = name;
    }

    protected String tabs() {
        String tabs = "";
        for (int i = 0; i < level; i++) {
            tabs = tabs + "\t";
        }
        return tabs;
    }
}
