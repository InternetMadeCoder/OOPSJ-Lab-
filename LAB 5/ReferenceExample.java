class ReferenceExample {
    int data;

    public static void modify(ReferenceExample obj) {
        obj.data = obj.data + 10;
    }

    public static void main(String[] args) {
        ReferenceExample obj = new ReferenceExample();
        obj.data = 50;
        System.out.println("Before modification: " + obj.data);
        modify(obj);
        System.out.println("After modification: " + obj.data);
    }
}
