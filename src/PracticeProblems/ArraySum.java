package PracticeProblems;


public class ArraySum {
    public static void main(String[] args){
        int nums[] = {2,3,4,5,6};
        int total = 0;
        
        for(int x: nums){
            total+=x;
        }
        
        System.out.println(total);
    }
}
