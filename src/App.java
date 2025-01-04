public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.SIZE);
        System.out.println(Byte.SIZE);
        System.out.println(Long.TYPE);
        System.out.println(Float.SIZE);
        int x = 12;
        int y = 11;
        if(x<y){
            System.out.println("x is greaterthan y");
        }
        else{
            System.err.println("x is lessthan y");
        }
        }
}
