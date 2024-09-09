
import java.util.Arrays;

public class Main{
    public static void main(String []args){
    // x<Float> obj = new x<>(10f);
    // int x = Math.abs(-40);
    // System.out.println(x);
    // System.out.println(Integer.toBinaryString(10));

    // System.out.println("\\/");
    // System.out.println("/\\");

    int arr1[] = {1,2,3};
    int arr2[] = {4,5,6};

    int l1 =arr1.length;
    int l2 =arr2.length;

    int arr3[] = new int[(l1+l2)];
    
    int i;
    for( i=0;i<l1;i++)
    {
        arr3[i] = arr1[i];
    }
    for(int j=0;j<l2;j++)
    {
        arr3[i] = arr2[j];
        i++;
    }

    System.out.println(Arrays.toString(arr3));
    }
}

class x <E> {
    x(E e){
        System.out.println(e);
    }
}