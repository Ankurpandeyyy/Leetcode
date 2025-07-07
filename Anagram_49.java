import java.util.*;

class Anagram_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] fre = new char[26];
            for (char c : word.toCharArray()) {
                fre[c - 'a']++;
            }

            String sorted = new String(fre);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(word);
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        Anagram_49 sol = new Anagram_49();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = sol.groupAnagrams(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
