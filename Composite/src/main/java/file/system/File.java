package file.system;

public class File extends Component {

    public File(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(tabs() +"File:"+ name);
    }

}
