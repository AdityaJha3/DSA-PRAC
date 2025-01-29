import java.util.ArrayList;

public class WaterContainer {

    public static int storeWater(ArrayList<Integer> height){
        int maxwater = 0;
        
        for(int i=0;i<height.size();i++){
            for (int j=i+1;j<height.size();j++){
                int heightt=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int area=heightt*width;
                if(area>maxwater){
                    maxwater=area;
                }
            }
        }

        return maxwater;
    }

    public static int optimizedStoreWater(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;

        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int area=ht*width;
            maxWater=Math.max(maxWater, area);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("max area to store water is " + storeWater(height));
        System.out.println("max area to store water using optimized method wit TC O(n) is " + optimizedStoreWater(height));

    }
}
