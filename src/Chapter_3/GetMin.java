package Chapter_3;

public class GetMin {
    public static void main(String[] args){
        int[] prieces ={5, 1, 123, 4, 23, 5, 3, 124, 5};
        int min = prieces[0];

        for(int i = 1; i < prieces.length; i++){
            if(min > prieces[i]){
                min = prieces[i];
            }
        }

        System.out.println("최소값은 " + min + "입니다.");
    }
}
