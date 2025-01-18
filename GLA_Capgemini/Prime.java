public class Prime{
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  
            }
        }
        return true;
    }
}
