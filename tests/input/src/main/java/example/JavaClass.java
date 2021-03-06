package example;

public class JavaClass {

    public JavaClass(int d) {
        this.d = d;
    }

    public static void a() {
    }

    public int b() {
        return 1;
    }

    public static int c = 2;
    public int d = 2;

    public class InnerClass {
        public int b() {
            return 1;
        }

        public int d = 2;
    }

    public static class InnerStaticClass {
        public static void a() {
        }

        public int b() {
            return 1;
        }

        public static int c = 2;
        public int d = 2;
    }

    public interface InnerInterface {
        public static void a() {
        }

        public int b();
    }

    public String publicName() {
        return "name";
    }

    // Weird formatting
    @Override
    public String
    toString() {
        return "";
    }
}
