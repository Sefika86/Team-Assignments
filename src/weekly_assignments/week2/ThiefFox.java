package weekly_assignments.week2;

public class ThiefFox {

    //Find the suspect fox
    //We have a fox group consists of 4 foxes. Unfortunately one of them stole an egg from chicken barn.
    //Luckily guard rooster have some info to identify the guilty fox.
    //Sheriff Dog got the info from the rooster. Sheriff Dog announced that;
    //thief fox had a black coat, a torch and 3 bags.
    //Find the suspect foxes, if a fox is cleared of charges write that also

    public static void main(String[] args) {
        boolean fox1WearsCoat = true;
        boolean fox2WearsCoat = true;
        boolean fox3WearsCoat = true;
        boolean fox4WearsCoat = false;

        boolean fox1HasATorch = true;
        boolean fox2HasATorch = true;
        boolean fox3HasATorch = true;
        boolean fox4HasATorch = true;

        String fox1CoatColor = "BLACK";
        String fox2CoatColor = "BLACK";
        String fox3CoatColor = "BLACK";
        String fox4CoatColor = "GRAY";

        int fox1BagCount = 0;
        int fox2BagCount = 2;
        int fox3BagCount = 3;
        int fox4BagCount = 3;

        System.out.println("Is fox1 a suspect: " +suspectFox(true, "BLACK", true, 0));
        System.out.println("Is fox2  a suspect: " +suspectFox(true, "BLACK", true, 2));
        System.out.println("Is fox3  a suspect: " +suspectFox(true, "BLACK", true, 3));
        System.out.println("Is fox4  a suspect: " +suspectFox(false, "GRAY", true, 3));

    }

    public static String suspectFox(boolean hasCoat, String colorCoat, boolean hasTorch, int bags){
        if(hasCoat && colorCoat.equals("BLACK") && hasTorch && bags == 3){
            return "true, fox is going to be charged";
        }else{
            return "false, fox is cleared of charges ";
        }
    }
}
