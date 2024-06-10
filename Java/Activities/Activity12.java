package Activities.Session3;

public class Activity12 {
    interface Addable {
        int add(int a1, int b1);
    }

        public static void main(String[] args) {
       //---------------------------Lambda expression--------------------------------
            // without return keyword.
            Addable ad1 = (a1, b1) -> (a1 + b1);
            System.out.println(ad1.add(10, 20));

            // with return keyword.
            Addable ad2 = (int a1, int b1) -> {
                return (a1 + b1);
            };
            System.out.println(ad2.add(100, 200));

    }
}
