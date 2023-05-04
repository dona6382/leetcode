import java.util.*;

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            char c = senate.charAt(i);
            if (c == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int radiantIndex = radiant.poll();
            int direIndex = dire.poll();

            if (radiantIndex < direIndex) {
                radiant.offer(radiantIndex + senate.length());
            } else {
                dire.offer(direIndex + senate.length());
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
