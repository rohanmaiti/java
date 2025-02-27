package tools;
public class AdvCal {
    int a;
    int b;
    public void load(int a, int b){
        this.a = a;
        this.b = b;
    }
    public  int mul(int a, int b){
        return a*b;
    }
    public int mul(){
        return this.a * this.b;
    }
}
