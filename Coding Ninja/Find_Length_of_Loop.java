public class Solution {
    public static int lengthOfLoop(Node head) {
        HashMap<Node, Integer> map = new HashMap<>();

        int i = 0;
        while (head != null) {
            if (map.containsKey(head)) {
                return map.size() - map.get(head);
            }

            map.put(head, i);
            i++;
            head = head.next;
        }
        return 0;

    }
}
