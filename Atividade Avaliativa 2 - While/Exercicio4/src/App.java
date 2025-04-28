public class App {
    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;
        int Fibonacci;
        int i = 0;

        System.out.println(primeiro);
        System.out.println(segundo);
        
        while (i <= 8) {
            Fibonacci = primeiro+segundo;
            System.out.println(Fibonacci);

            primeiro = segundo;
            segundo = Fibonacci;
            
            i++;
        }
    }
}
