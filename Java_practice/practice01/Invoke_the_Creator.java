package practice01;

class SuperCLS {
    public SuperCLS() {
        System.out.println("...");
    }

    public SuperCLS(int i) {
        System.out.println("...");
    }

    public SuperCLS(int i, int j) {
        System.out.println("...");
    }
}

class SubCLS extends SuperCLS {
    public SubCLS() {
        super();
        System.out.println("...");
    }

    public SubCLS(int i) {
        super(i);
        System.out.println("...");
    }

    public SubCLS(int i, int j) {
        super(i, j);
        System.out.println("...");
    }
}