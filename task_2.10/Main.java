/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,7,7,3,1,9};
        for(int i=0; i<5; i++)
            if (nums[i]!=nums[i+1]) System.out.println("нет");
            else System.out.println("да");
        }
    }
