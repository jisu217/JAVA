import java.net.SocketOption;

public class Calculator {

        private Calculator() {
            result = 0;
        }

        public void add() {
            result = result +1;
        }

        public void add(int a) {
            result = result + a;
        }
        
        public void add(int a, int b) {
            result = 1 + b;
        }

        public void add(String a, String b) {
            System.out.println(a + b);
        }

        public void add(String a, int b) {
            System.out.println(a + Integer.valueOf(b));
        }
    }
}

