import templates.MoroccoTemplate;
import templates.SpaineTmplate;
import templates.Template;

public class Test {

    public static void main(String[] args) {

        Template moroccoTemplate=new MoroccoTemplate();
        System.out.println("Morocco: "+moroccoTemplate.perform(2,5));

        Template spainTemplate=new SpaineTmplate();
        System.out.println("Spain: "+spainTemplate.perform(2,5));

    }
}
