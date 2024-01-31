// first answer is : 18
// second answer is : 17
// third answer is : 5
public class Main {
    public static void transe(LinkedListStack S, LinkedListStack T) {
        while (!S.isEmpty()) {
            T.push(S.pop());
        }

        public static void remove(LinkedListStack amr){
            if (!amr.isEmpty()) {
                amr.pop();
                remove(amr);
            }
        }
    }
    public static void main(String[] args) {
        LinkedListStack<Integer> s = new LinkedListStack<>();
        s.push(1);
        s.push(2);
        LinkedListStack<Integer> s2 = new LinkedListStack<>();
        transe(s,s2);
        remove(s2);

    }
}