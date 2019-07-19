import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FlowersSaver {
    public static void save(String filePath, List<Flowers> bouquet) {
        try (FileWriter writer = new FileWriter(filePath)) {
            int importantCounter = 0;
            for (Flowers f : bouquet) {

                String writerFruitName = importantCounter++ < bouquet.size() - 1 ? f.getClass().getSimpleName() + "\n" : f.getClass().getSimpleName();

                writer.write(writerFruitName);

//                if (importantCounter++ < bouquet.size() - 1) {
//                    writer.write(f.getClass().getSimpleName() + "\n");
//                } else {
//                    writer.write(f.getClass().getSimpleName());
//                }
            }

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}
