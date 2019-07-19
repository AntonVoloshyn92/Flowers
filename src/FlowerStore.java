import java.util.ArrayList;
import java.util.List;

public class FlowerStore {

    private int purse = 0;

    public List<Flowers> sell(int rose, int chamomile, int tulip) {
         List<Flowers> listFlowers = new ArrayList<>();
        for (int i = rose; i >= 0; i--) {
            listFlowers.add(new Rose());
        }

        for (int i = chamomile; i >= 0; i--) {
            listFlowers.add(new Chamomile());
        }

        for (int i = tulip; i >= 0; i--) {
            listFlowers.add(new Tulip());
        }
        for (Flowers flower : listFlowers) {
            purse += flower.getPrice();
        }
        return listFlowers;
    }


    public List<Flowers> sellSequence(int rose, int chamomile, int tulip){
        List<Flowers> listFlowers = new ArrayList<>();
        int r1 = rose;
        int ch1 = chamomile;
        int t1 = tulip;

        while (r1>0||ch1>0||t1>0){
            if(r1>0){
                listFlowers.add(new Rose());
                r1--;
            }
            if (ch1>0){
                listFlowers.add(new Chamomile());
                ch1--;
            }
            if(t1>0){
                listFlowers.add(new Tulip());
                t1--;
            }
        }
        for (Flowers flower : listFlowers) {
            purse += flower.getPrice();
        }
        return listFlowers;
    }
}
