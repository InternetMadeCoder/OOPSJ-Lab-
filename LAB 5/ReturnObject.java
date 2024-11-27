// prob 5
class ReturnObject {
    int value;

    public ReturnObject(int val) {
        this.value = val;
    }

    public static ReturnObject createObject(int val) {
        return new ReturnObject(val);
    }

    public static void main(String[] args) {
        ReturnObject obj = createObject(100);
        System.out.println("Value in returned object: " + obj.value);
    }
}
