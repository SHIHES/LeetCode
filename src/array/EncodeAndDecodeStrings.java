package array;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    static public void main(String[] args) {
        EncodeAndDecodeStrings code = new EncodeAndDecodeStrings();
        List<String> strs = List.of("lint");
        String e = code.encode(strs);
        System.out.println(e);
        List<String> d = code.decode(e);
        d.forEach(System.out::println);

    }

    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here
        StringBuilder answer = new StringBuilder();
        for (String str : strs) {
            answer.append(str.length()).append('#').append(str);
        }
        return answer.toString();
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        List<String> answer = new ArrayList<>();
        int pointer = 0;
        while (pointer < str.length()) {
            int init = pointer;
            while (str.charAt(pointer) != '#') {
                pointer += 1;
            }
            int stringLength = Integer.parseInt(str.substring(init, pointer));
            pointer += 1;
            String decode = str.substring(pointer, pointer + stringLength);
            pointer += stringLength;
            answer.add(decode);
        }
        return answer;
    }
}
