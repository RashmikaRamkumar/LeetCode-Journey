import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> s = new HashSet<>();
        boolean flag = false;

        for (String i : wordList) {
            if (i.compareTo(endWord) == 0) {
                flag = true;
            }
            s.add(i);
        }

        if (!flag) {
            return 0;
        }

        int level = 1;
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);

        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                String curr = q.poll();

                for (int i = 0; i < curr.length(); i++) {
                    StringBuilder temp = new StringBuilder(curr);

                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        temp.setCharAt(i, ch);
                        String newWord = temp.toString();

                        if (newWord.compareTo(curr) == 0) continue;

                        if (newWord.compareTo(endWord) == 0) {
                            return level + 1;
                        }

                        if (s.contains(newWord)) {
                            q.add(newWord);
                            s.remove(newWord);
                        }
                    }
                }
            }
            level++;
        }

        return 0;
    }
}

