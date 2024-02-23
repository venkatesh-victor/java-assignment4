import java.util.Scanner;
import java.util.HashMap;

public class SecondOccurrence
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements one by one: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be searched: ");
        int search = sc.nextInt();

        sc.close();

        if(secondOccurrence(arr, search) != -1) {

            System.out.println("The number " + search + " has occured second time in the index "
                + secondOccurrence(arr, search));
        }

        else {
            System.out.println("The number " + search + " has not occured second time.");
        }

    }

    static int secondOccurrence(int[] arr, int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++)
        {
           
            if(map.containsKey(arr[i]))
            {
                int val = map.get(arr[i]);
                val++;
                map.put(arr[i], val);
            }

            else
            {
                map.put(arr[i], 1);
            }

            if(arr[i] == n && map.get(arr[i]) == 2)
            {
                return i;
            }
            

        }

        return -1;
    }
}
