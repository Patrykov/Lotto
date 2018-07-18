import java.util.*;

public class lotto {


    public static void main(String[] args) {

        Set<Integer> randNumbers = null;

        //Get 6 random numbers from 49
        Set<Integer> allNumbers = new HashSet<>();
        for (int i = 1; i < 2; i++) {
            Set<Integer> set = new HashSet<>();
            while (set.size() < 6) {
                int random = (int) (Math.random() * 49 + 1);
                if (allNumbers.add(random)) {
                    set.add(random);
                }
            }
            randNumbers = set;
            Arrays.sort(new Set[]{randNumbers});
//            System.out.println(Arrays.toString(new Set[]{randNumbers}));
        }

        //Get 6 numbers from client
        System.out.println("Type Your's 6 unique numbers from 1 to 49");
        TreeSet<Integer> ticket = new TreeSet<>();
        Scanner scanner1 = new Scanner(System.in);
        while (ticket.size() < 6) {
            int number = scanner1.nextInt();
            ticket.add(number);
        }
        //Check the result of game
        TreeSet<Integer> intersection = new TreeSet<>(ticket);
        intersection.retainAll(randNumbers);

        // print results
        System.out.println("Your ticket numbers are " + ticket);
        System.out.println("The winning numbers are " + randNumbers);
        System.out.println();
        if (intersection.size() < 6) {
            System.out.println("You had " + intersection.size() + " matching numbers.");
        }
        if (intersection.size() == 6) {
            System.out.println(" Congratulations You are Millionaire, matching numbers " + intersection.size());
        }
    }
}
