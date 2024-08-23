public class Tea extends Beverages{
    @Override
    void brew() {
        System.out.println("Steeping Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");

    }

    @Override
    void addExtras() {
        System.out.println("Adding honey");

    }
}
