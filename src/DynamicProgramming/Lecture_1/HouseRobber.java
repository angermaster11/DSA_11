package DynamicProgramming.Lecture_1;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        System.out.println(robbed(arr,0));
    }
    public static int robbed(int[] arr,int i) {
        if(i >= arr.length){
            return 0;
        }
        int leftX = arr[i] + robbed(arr,i+2);
        int rightX = robbed(arr,i+1);
        return Math.max(leftX,rightX);
    }
}
