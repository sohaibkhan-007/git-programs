import java.util.Scanner;

class qques {
    int quesNo, ans, userAns;
    String question, opt1, opt2, opt3, opt4;
}

class Quiz1 {
    qques que1[];
    int questionCount;

    Quiz1() {
        que1 = new qques[2];
        questionCount = -1;

    }

    public void result() {
        int W = 0, R = 0, nA = 0;
        for (int i = 0; i <= questionCount; i++) {
            if (que1[i].userAns == 0)
                nA++;
            if (que1[i].userAns == que1[i].ans)
                R++;
            else
                W++;
        }
        System.out.println("Right:" + R + " Wrong:" + W + " not atempted" + nA);
    }

    public void getQuestions1() {
        /* ================================================= */
        qques q = new qques();
        q.quesNo = 1;
        q.question = "Full form of OOPs?";
        q.opt1 = "object Operational program";
        q.opt2 = "Optional Object program";
        q.opt3 = "Object oreinted program";
        q.opt4 = "Oreantd object program";
        q.ans = 3;
        que1[++questionCount] = q;
        /* ================================================= */
        q = new qques();
        q.quesNo = 2;
        q.question = "Premitive data types in java?";
        q.opt1 = "9";
        q.opt2 = "7";
        q.opt3 = "8";
        q.opt4 = "10";
        q.ans = 3;
        que1[++questionCount] = q;
    }

    public void showQuestion1() {
        getQuestions1();
        char ch;
        int quesNo = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            int i;
            System.out.println(que1[quesNo].quesNo + ": " + que1[quesNo].question);
            System.out.println("1=>" + que1[quesNo].opt1);
            System.out.println("2=>" + que1[quesNo].opt2);
            System.out.println("3=>" + que1[quesNo].opt3);
            System.out.println("4=>" + que1[quesNo].opt4);
            if (que1[quesNo].userAns != 0)

                System.out.println("your Answer:" + que1[quesNo].userAns);
            System.out.println("Enter your option:");
            try {
                i = sc.nextInt();
                que1[quesNo].userAns = i;
            } catch (Exception e) {

            }
            System.out.println("Press [P] for previous,Press [N] for Next,Press [S] for Subbmit.");
            ch = sc.next().charAt(0);
            if (ch == 'P' || ch == 'p') {
                if (quesNo != 0) {
                    quesNo--;
                }
            } else if (ch == 'n' || ch == 'N') {
                if (quesNo != questionCount) {
                    quesNo++;
                }
            } else if (ch == 'S' || ch == 's') {
                result();
                break;
            }
        }
    }
}

public class Quizzz1 {
    public static void main(String[] args) {
        Quiz1 q = new Quiz1();
        q.showQuestion1();
    }
}