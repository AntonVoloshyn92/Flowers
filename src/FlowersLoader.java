import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FlowersLoader {
    public static List<Flowers> load(String path) throws FileNotFoundException {

        List<Flowers> list = new ArrayList<>();
        try {
            FileInputStream fstream = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                list.add(createFlowersObject(strLine));
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        return list;
    }

    private static Flowers createFlowersObject(String strLine) {
        switch (strLine) {
            case "Rose":
                return new Rose();
            case "Chamomile":
                return new Chamomile();
            case "Tulip":
                return new Tulip();
            default:
                return null;
        }
    }

}
