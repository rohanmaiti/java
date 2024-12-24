
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
    int arr1[] = {1,3,4,2,5,10,9,8};
    int arr2[] = {8,7,6,5,4,3,2,1};
    Pair arr[] = new Pair[8];
    int n = 8;

    for(int i=0;i<n;i++){
       arr[i] = new Pair(arr1[i], arr2[i]); 
    } 

    // Arrays.sort(arr,(a,b)-> Integer.compare(b.s, a.s));
    // Arrays.sort(arr,(a,b)-> Integer.compare(a.s, b.s));
    Arrays.sort(arr,(a,b)-> b.s - a.s);

    for(var obj : arr){
        System.out.println(obj.s+" "+obj.e+" "+obj.r);
    }
    }
   
}
class Pair{
    int s;
    int e;
    double r;
    Pair(int s, int e){
        this.s = s;
        this.e = e;
        this.r = (double)s/e;
    }
}
