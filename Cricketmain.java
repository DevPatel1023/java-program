import java.util.Scanner;

class Cricket {
    protected String name;
    protected int age;

    public void setdata(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Match extends Cricket {
    private int no_of_odi;
    private int no_of_test;

    public void setdata(String name, int age, int no_of_odi, int no_of_test) {
        super.setdata(name, age);
        this.no_of_odi = no_of_odi;
        this.no_of_test = no_of_test;
    }

    public void display() {
        super.display();
        System.out.println("Number of ODIs played: " + no_of_odi);
        System.out.println("Number of Tests played: " + no_of_test);
    }
}

public class CricketMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Match[] matches = new Match[5];

        for (int i = 0; i < 5; i++) {
            
            System.out.println("Enter details for match " + (i+1) + ":");

            System.out.print("Name of player: ");
            String name = scanner.nextLine();
            
            System.out.print("Age of player: ");
            int age = scanner.nextInt();
           
            System.out.print("Number of ODIs played by player: ");
            int no_of_odi = scanner.nextInt();
           
            System.out.print("Number of Tests played by player: ");
            int no_of_test = scanner.nextInt();

            scanner.nextLine();

            Match match = new Match();
            match.setdata(name, age, no_of_odi, no_of_test);
            matches[i] = match;
        }

        System.out.println("Information for all matches:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Match " + (i+1) + ":");
            matches[i].display();
            System.out.println();
        }
    }
}
