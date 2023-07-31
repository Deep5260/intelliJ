public class Functions {
    public Functions() {
    }

    public void showExample() {
        System.out.println("I am called from function");
    }

    public int showExample(int a) {
        System.out.println("I am called from function a = " + a);
        return a;
    }

    public double showExample(float a) {
        System.out.println("I am called from function a = " + a);
        return (double)a;
    }

    public static void main(String[] args) {
        Functions obj1 = new Functions();
        obj1.showExample();
        int a = obj1.showExample(6);
        double d = obj1.showExample(6.7F);
        System.out.println((double)a + d);
    }
}
