import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution2
{
    public static int solution(int[] abilities, int k)
    {
        ArrayList<Integer> abilities_list = new ArrayList<>();

        for(int i : abilities)
            abilities_list.add(i);

        Collections.sort(abilities_list);
        Collections.reverse(abilities_list);
        System.out.println(abilities_list);

        int n = abilities_list.size();
        int answer = 0;

        if (n % 2 == 0)
        {
            for (int i = 1; i < n; i += 2)
                answer += abilities_list.get(i);
        }
        else
        {
            for (int i = 1; i < n; i += 2)
                answer += abilities_list.get(i);
            answer += abilities_list.get(n - 1);
        }


        return answer;
    }

    public static void main(String[] args)
    {
        int[] abilities = {7, 6, 8, 9, 10};
        int k = 1;
        System.out.println(solution(abilities, k));
    }
}
