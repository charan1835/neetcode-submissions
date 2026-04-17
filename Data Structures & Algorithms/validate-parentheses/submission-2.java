class Solution {
    public boolean isValid(String s) {

        Stack<Character> list = new Stack<>();

        for(char ch : s.toCharArray()) {

            if(ch=='[' || ch=='(' || ch=='{') {
                list.push(ch);
            } else {

                if(list.isEmpty()) return false;

                char c = list.pop();

                if(ch==')' && c!='(') return false;
                if(ch==']' && c!='[') return false;
                if(ch=='}' && c!='{') return false;
            }
        }

        return list.isEmpty();
    }
}
