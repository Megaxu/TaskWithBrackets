import java.util.ArrayList;

public class Main {

    public static int index = -1;
    public static ArrayList<Character> bracketList = new ArrayList<>();

    public static void main(String[] args) {
        String s = "([](){([])})";
        for (int i = 0; i < s.length(); i++) {
            if (checkBracket(s.charAt(i))) {
                addBracket(s.charAt(i));
            }
            else {
                popBracket(s.charAt(i));
            }
        }

        for (Character character : bracketList) {
            System.out.println(character);
        }

        System.out.println(index);
    }

    private static void addBracket(char b) {
        bracketList.add(b);
        index++;
    }

    private static void popBracket(char b) {
/*        bracketList.remove(index - 1);
        index--;*/

        // где-то тут
        if (bracketList.get(index - 1) == b) {
            bracketList.remove(index - 1);
            index--;
        }
    }

    private static boolean checkBracket(char b) {
        return b == '(' || b == '[' || b == '{';
    }
}
