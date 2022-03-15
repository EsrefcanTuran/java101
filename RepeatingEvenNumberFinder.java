
public class RepeatingEvenNumberFinder {

	static boolean isFound(int [] arr, int value){
        for (int i: arr){
            if (i==value)
            	return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] list = {3,7,3,2,2,4,5,6,8,70,4,5,6,8,10,1,70};
        int [] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i=0; i<list.length; i++){
            for (int j=0; j<list.length; j++){
                if ((i!=j) && (list[i]==list[j]) && (list[i]%2==0) && !isFound(duplicate, list[i])){
                    duplicate[startIndex++] = list[i];
                 }
            }
        }
        for (int value: duplicate)
        	if (value != 0)
        		System.out.println(value);
    }

}
