import java.util.ArrayList;

public class World {
    private ArrayList<Object> content = new ArrayList<>();

    public void add(Object obj) {
        content.add(obj);
    }

    public String getWorldContent(){
        var sb = new StringBuilder();
        for (Object o : content) {
            sb.append(o + " ");
        }
        return sb.toString();
    }
}
