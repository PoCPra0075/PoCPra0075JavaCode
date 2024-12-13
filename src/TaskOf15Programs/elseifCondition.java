package TaskOf15Programs;

public class elseifCondition {
    public static void main(String[] args) {
        String examstatus ="Pass";
        if (examstatus.equals("Pass")) {
            System.out.println("Please wait for the next round");
            String round1status = "Pass";
            if (round1status == "Pass") {
                System.out.println("you have cleared round 1, Please Wait for round2");
                String round2status = "Pass";
                if (round2status == "Pass") {
                    System.out.println("you have cleared round2, Please Wait for HR round");
                }else {
                    System.out.println("you can go to home");
                }
            }
        }else {
            System.out.println("you are not selected for the interview");
        }

        int a = 2;
        switch (a){
            case 1:
                System.out.println("This is the first statement");
            break;
            case 2:
                System.out.println("This is the second statement");
                break;
            case 3:
                System.out.println("This is the third statement");
                break;
            default:
                System.out.println("This is the default statement");
                break;
        }
    }
}
