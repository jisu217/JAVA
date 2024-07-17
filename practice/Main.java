public class JavaStudy81 {
    public static void main(String[] args) {
        DivideCalculator cal = new DivideCalculator(10, 5); // 상속 계층 구조에서 최상위 클래스
        cal.add();
        cal.minus();
        cal.divide();
    }
}

// 덧셈을 수행하는 클래스
class AddCalculator {
    int a;
    int b;

    public AddCalculator(int pa, int pb) {
        a = pa;
        b = pb;
    }

    public int add() {
        System.out.println(a + b);
    }
}

// 뺄셈을 수행하는 클래스
class MinusCalculator extends AddCalculator {
    public MinusCalculator(int pa, int pb) {
        super(pa, pb);
    }

    public int minus() {
        System.out.println(a - b);
    }
}

// 나눗셈을 수행하는 클래스
class DivideCalculator extends MinusCalculator {
    public DivideCalculator(int pa, int pb) {
        super(pa, pb);
    }

    public int divide() {
        System.out.println(a / b);
    }
}


