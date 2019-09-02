import java.util.ArrayList;

public class TwoSum {
    public static int[] getindices(int[] numbers, int target){
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i =0; i<numbers.length;++i){
            num.add(numbers[i]);
        }
        for (int i=0; i<num.size();++i){
            int compliment = target-num.get(i);
            if(num.contains(compliment) && num.indexOf(compliment)!=i){
                return new int[] {i,num.indexOf(compliment)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int [] nums = {7,5,7,11,2,15};
        int target = 7;
        int[] ar = getindices(nums,target);
        System.out.println(ar[0]+" "+ar[1]);
    }
}
