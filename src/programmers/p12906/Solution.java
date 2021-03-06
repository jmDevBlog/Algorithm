package programmers.p12906;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList();
        int tmp = -1;
        for (int i = 0; i < arr.length; i++) {
            if(tmp != arr[i]){
                list.add(arr[i]);
                tmp = arr[i];
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
