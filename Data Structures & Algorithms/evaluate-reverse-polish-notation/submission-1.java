
class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> list = new Stack<>();

        for (String n : tokens) {

            if (n.equals("+")) {
                int b = list.pop();
                int a = list.pop();
                list.push(a + b);

            } else if (n.equals("*")) {
                int b = list.pop();
                int a = list.pop();
                list.push(a * b);

            } else if (n.equals("/")) {
                int b = list.pop();
                int a = list.pop();
                list.push(a / b);

            } else if (n.equals("-")) {
                int b = list.pop();
                int a = list.pop();
                list.push(a - b);

            } else {
                list.push(Integer.parseInt(n));
            }
        }

        return list.pop();
    }
}
