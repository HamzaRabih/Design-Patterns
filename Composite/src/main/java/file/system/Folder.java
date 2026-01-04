package file.system;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    private List<Component> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(tabs()+"Folder:"+ name);
        for (Component component : components) {
            component.print();
        }
    }

    public Component addChild(Component component) {
        component.level=this.level+1;
        components.add(component);
        return component;
    }

}
