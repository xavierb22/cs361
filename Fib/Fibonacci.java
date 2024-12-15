class Main {
    public static void main(String[] args) {
        int n = 10; 
        int x = 0, y = 1;

        System.out.println("Fibonacci Sequence:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(x + " ");
            int temp = x + y; 
            x = y;           
            y = temp;        
        }
    }
}