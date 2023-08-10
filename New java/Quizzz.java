import java.util.Scanner;

class ques {
    int quesNo;
    String question;
    String opt1, opt2, opt3, opt4;
    int ans, userAns;
}

class Quiz {
    ques que[];
    int quesCount;

    Quiz() {
        que = new ques[5];
        quesCount = -1;
        getQuestions();
    }

    public void result() {
        int r = 0, w = 0, na = 0;
        for (int i = 0; i <= quesCount; i++) {
            if (que[i].userAns == 0)
                na++;
            if (que[i].userAns == que[i].ans)
                r++;
            else
                w++;
        }
        System.out.println("Right: " + r + " Wrong: " + w + " Not Attempted:" + na);
    }

    public void getQuestions() {
        /* ........................................................... */
        ques q = new ques();
        q.quesNo = 1;
        q.question = "Full form of OOPs?";
        q.opt1 = "object Operational program.";
        q.opt2 = "Optional Object program";
        q.opt3 = "Object oreinted program";
        q.opt4 = "Oreantd object program";
        q.ans = 3;
        que[++quesCount] = q;
        /* ........................................................... */
        q = new ques();
        q.quesNo = 2;
        q.question = "Primitive data types in java are?";
        q.opt1 = "8";
        q.opt2 = "7";
        q.opt3 = "9";
        q.opt4 = "10";
        q.ans = 1;
        que[++quesCount] = q;
        /* ........................................................... */
        q = new ques();
        q.quesNo = 3;
        q.question = "Java do not support?";
        q.opt1 = "Multilevel?";
        q.opt2 = "single";
        q.opt3 = "multiple";
        q.opt4 = "Both 1 & 2";
        q.ans = 3;
        que[++quesCount] = q;
        /* ........................................................... */
        q = new ques();
        q.quesNo = 4;
        q.question = "Which member is not visible in chaild class?";
        q.opt1 = "public";
        q.opt2 = "private";
        q.opt3 = "protected";
        q.opt4 = "both 1 & 2";
        q.ans = 2;
        que[++quesCount] = q;
        /* ........................................................... */
        q = new ques();
        q.quesNo = 5;
        q.question = "Which keyword is not available in java?";
        q.opt1 = "this";
        q.opt2 = "super";
        q.opt3 = "goto";
        q.opt4 = "null";
        q.ans = 3;
        que[++quesCount] = q;
    }

    public void showQuestion() {
        int quesNo = 0;
        char ch;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int i;
            System.out.println(que[quesNo].quesNo + ": " + que[quesNo].question);
            System.out.println("1->" + que[quesNo].opt1);
            System.out.println("2->" + que[quesNo].opt2);
            System.out.println("3->" + que[quesNo].opt3);
            System.out.println("4->" + que[quesNo].opt4);
            if (que[quesNo].userAns != 0)
                System.out.println("your ans:" + que[quesNo].userAns);
            System.out.println("Enter your option ");
            try {
                i = sc.nextInt();
                que[quesNo].userAns = i;
            } catch (Exception e) {
            }
            System.out.println("For previous press[P],For Next press[N],For Submit press[S]");
            ch = sc.next().charAt(0);
            if (ch == 'p
            ' || ch == 'P') {
                if (quesNo != 0)
                    quesNo--;
            } else if (ch == 'n' || ch == 'N') {
                if (quesNo != quesCount)
                    quesNo++;
            } else if (ch == 's' || ch == 'S') {
                result();
                break;
            }

        }
    }
}

public class Quizzz {
    public static void main(String[] args) {
        Quiz q = new Quiz();
        q.showQuestion();
    }
}