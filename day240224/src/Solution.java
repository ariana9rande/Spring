import java.util.ArrayList;
import java.util.Arrays;

class Solution
{
    static int[] dr = {1, 0, 0, 1};
    static int[] dc = {0, -1, 1, 0};
    static ArrayList<Integer> answer = new ArrayList<>();

    public static int solution(String[] drum)
    {
        int[][] map = new int[drum.length][drum[0].length()];

        for (int r = 0; r < drum.length; r++)
        {
            for (int c = 0; c < drum[0].length(); c++)
            {
                char ch = drum[r].charAt(c);
                if (ch == '#')
                    map[r][c] = 0;
                else if (ch == '<')
                    map[r][c] = 1;
                else if (ch == '>')
                    map[r][c] = 2;
                else if (ch == '*')
                    map[r][c] = 3;
            }
        }

        for (int[] line : map)
            System.out.println(Arrays.toString(line));

        for (int i = 0; i < map[0].length; i++)
            move(i, map);

        return answer.size();
    }

    public static void move(int n, int[][] map)
    {
        int r = 0;
        int c = n;

        int nr, nc, flag = 0;

        while (r < map.length - 1)
        {
            nr = r + dr[map[r][c]];
            nc = c + dc[map[r][c]];

            if (map[r][c] == 3)
            {
                if (flag == 1)
                {
                    System.out.println("flag twice");
                    flag++;
                    break;
                }
                else if (flag == 0)
                {
                    System.out.println("flag");
                    flag++;
                }
            }

//            if (nr >= 0 && nc >= 0 && nc < map[0].length)
//            {
//                r = nr;
//                c = nc;
//            }
//            else
//                continue;

            r = nr;
            c = nc;

            System.out.println("[" + r + ", " + c + "]");
        }
        if (r >= map.length - 1 && flag < 2)
        {
            System.out.println(n + " passed");
            answer.add(n);
        }
        else
            System.out.println(n + " not passed");
    }

    public static void main(String[] args)
    {
        String[] drum =
               {"######",
                ">#*###",
                "####*#",
                "#<#>>#",
                ">#*#*<",
                "##*##*"};

        for (String s : drum)
        {
            System.out.println(s);
        }

        System.out.println(solution(drum));
    }
}