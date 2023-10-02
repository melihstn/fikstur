import java.util.LinkedHashSet;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        LinkedHashSet<String> teams = new LinkedHashSet<>();

        teams.add("FB");
        teams.add("GS");
        teams.add("TS");
        teams.add("BJK");
        teams.add("Samsun");
        teams.add("Bursa");

        LinkedHashSet<String> copyTeams = new LinkedHashSet<>();
        LinkedHashSet<String> copyTeams2 = new LinkedHashSet<>();

        for (int i = 0; i < teams.size() ; i++){

            copyTeams.add((String) teams.toArray()[i]);
        }

        for (int i = 0; i < (teams.size()/2); i++){
            int rand1 = random.nextInt(copyTeams.size());
            copyTeams2.add((String)copyTeams.toArray()[rand1]);
            copyTeams.add((String)copyTeams.toArray()[rand1]);
            copyTeams.remove((String) copyTeams.toArray()[rand1]);

        }

        copyTeams2.add(null);

        for (int i = 0; i < copyTeams.size(); i++){

            if (copyTeams2.toArray()[i] !=null){

                System.out.println(copyTeams.toArray()[i] + " vs " + copyTeams2.toArray()[i]);
            }
            else {
                System.out.println(copyTeams.toArray()[i] + " vs " + "Bay");
            }

        }

    }
}