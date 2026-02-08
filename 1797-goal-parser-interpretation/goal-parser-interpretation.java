class Solution {
    public String interpret(String command) {
        int length = command.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = command.charAt(i);
            if (ch == 'G') {
                sb.append('G');
            } else if (ch == '(' && i + 1 < length && command.charAt(i + 1) == ')') {
                sb.append('o');
                i++;
            } else {
                //as the question clearly states the command can have threee kinds of values so if its not the two above it must be this so no need to check.
                sb.append("al");
                i += 3;
            }
        }
        return sb.toString();
    }
}