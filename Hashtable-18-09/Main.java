import java.util.Arrays;
import java.util.LinkedList;
public class Main{
    public static void main(String []args){
    HashTable table = new HashTable(10);
    table.insert(10);
    table.insert(20);
    table.insert(50);
    table.insert(53);
    table.insert(55);
    table.insert(28);
    System.out.println(table.search(28)); 
    System.out.println(table.search(29));
    table.delete(20);
    table.printHashTable();

    LinearTable table2 = new LinearTable(10);
    table2.insert(10);
    table2.insert(22);
    table2.insert(24);
    table2.insert(34);
    table2.insert(44);

    // table2.printlnLinerarProbTable();
    // System.err.println(table2.search(44));
    // System.err.println(table2.search(54));
    // table2.delete(24);
    // table2.printlnLinerarProbTable();


    }
}
class HashTable{
    int size;
    LinkedList<Integer> table[];
    HashTable(int size){
    this.size = size;
    table = new LinkedList[size];

    for(int i=0;i<size;i++)
    table[i] = new LinkedList<>();

    }
    int hashFunction(int ele){
        return ele%size;
    }
    void insert(int ele){
        table[this.hashFunction(ele)].add(ele);
    }
    boolean search(int ele){
        return table[this.hashFunction(ele)].contains(ele);
    }
    boolean delete(int ele){
        if((hashFunction(ele) >= 0) && (hashFunction(ele) < size) )
        {
            table[hashFunction(ele)].remove(Integer.valueOf(ele));
            return true;
        }
        else 
        return false;
    }

    void printHashTable(){
        for(int i=0;i<size;i++){
            
            if(table[i].size() == 0)
            {
                System.out.print("index "+i+" : ");    
                System.out.println("no element in his index");
                continue;
            }
            else{
            System.out.print("index "+i+" : ");    
            for(int j=0;j<table[i].size();j++)
            {
            System.out.print(table[i].get(j)+" ");
            }

            }
           
            System.out.println();

        }
    }
    
}

class LinearTable{
    int size;
    int arr[];
    int filledNo;
    LinearTable(int size){
    filledNo = size;
    arr = new int[size];
    Arrays.fill(arr,-1);
    }
    
    int hashFunction(int ele){
        return ele%size;
    }
    void insert(int ele){
    // constrain if array is fill
    if(filledNo != 0){
    int index = this.hashFunction(ele);
    while(arr[index] != -1)
    {
        index = (index+1)%size;
    }
    arr[index] = ele;
    filledNo--;
    }
    else{
        System.out.println("Does not have size to Store data");
    }
  
    }

    boolean search(int ele){
        int index = this.hashFunction(ele);
        int n = 0;
        while( arr[index] != -1 || n!=(size-1))
        {
            if(arr[index] == ele)
            return true;
            index = (index+1)%size;
            n++;
        }
        return false;
    }

    boolean delete(int ele){
        int index = hashFunction(ele);
        int n = 0;
        while( arr[index] != -1 || n!=(size-1))
        {
            if(arr[index] == ele)
            {
                arr[index] = -2;
                filledNo++;
                return true;

            }
            index = (index+1)%size;
            n++;
        }
        System.out.println(ele+" not present");
        return false;
    }

    void printlnLinerarProbTable(){
        for(int i=0;i<size;i++)
        {
            System.out.println("index : "+i+"ele: "+arr[i]);
        }
    }

}