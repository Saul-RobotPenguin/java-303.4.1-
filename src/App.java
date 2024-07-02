import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        one();
        two();
        three();
        four();
        five();
        six();
        seven();
    }

    static void one() {
        int x = 15;

        if (x < 7) {
            System.out.println("Less than 7");
        }

    }

    static void two() {
        int x = 14;

        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10) {
            System.out.println("X is greater than 10");
        }
    }

    static void three() {
        int x = 50;
        if (x < 10) {
            System.out.println("X is less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 or 20");
        } else if (x >= 20) {
            System.out.println("Greater than or equal to 20");
        }
    }

    static void four() {
        int x = 15;
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else if (x >= 10 || x <= 20) {
            System.out.println("In range");
        }
    }

    static void five() {
        Scanner input = new Scanner(System.in);

        int grade = input.nextInt();

        if (grade > 100 || grade < 0) {
            System.out.println("Score Out Of Range");
        } else if (grade <= 100 && grade >= 90) {
            System.out.println("A");
        } else if (grade <= 89 && grade >= 80) {
            System.out.println("B");
        } else if (grade <= 79 && grade >= 70) {
            System.out.println("C");
        } else if (grade <= 69 && grade >= 60) {
            System.out.println("D");
        } else if (grade < 60) {
            System.out.println("F");
        } else {
            System.out.println("An error has occurred");
        }
    }

    static void six() {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out Of Range");
                break;
        }
    }

    static void seven() {
        Scanner input = new Scanner(System.in);

        // S, MFJ or QW, MFS, HOH
        System.out.println(
                "Please put your filing status using the following abbreviations , S = Single, MFJ = Married Filing Jointly, QW = Qualifying Widow, MFS = Married Filing Separately, HOH = Head of Household");
        String status = input.nextLine();

        System.out.println("Please put your income, note: dollar $ is not needed");
        int income = input.nextInt();

        System.out.println(status);
        System.out.println(income);
        // Single
        if (status.equals("S")) {
            if (income >= 0 && income <= 8350) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.10);
            } else if (income >= 8351 && income <= 33950) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.15);
            } else if (income >= 33951 && income <= 82250) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.25);
            } else if (income >= 82251 && income <= 171550) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.28);
            } else if (income >= 171551 && income <= 372950) {
                System.out.printf("The amount of tax you need to pay is %.2f" + income * 0.33);
            } else if (income > 372951) {
                System.out.printf("The amount of tax you need to pay is %.2f" + income * 0.35);
            }
        }
        // Married Filing Jointly || Qualifying Window
        if (status.equals("MFJ") || status.equals("QW")) {
            if (income >= 0 && income <= 16700) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.10);
            } else if (income >= 16701 && income <= 67900) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.15);
            } else if (income >= 67901 && income <= 137050) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.25);
            } else if (income >= 137051 && income <= 208850) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.28);
            } else if (income >= 208851 && income <= 372950) {
                System.out.printf("The amount of tax you need to pay is %.2f", (income * 0.33));
            } else if (income > 372951) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.35);
            }
        }

        // Married Filing Separately
        if (status.equals("MFS")) {
            if (income >= 0 && income <= 8350) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.10);
            } else if (income >= 8351 && income <= 33950) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.15);
            } else if (income >= 33951 && income <= 68525) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.25);
            } else if (income >= 68526 && income <= 104425) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.28);
            } else if (income >= 104426 && income <= 186475) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.33);
            } else if (income > 186476) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.35);
            }
        }

        // Head of Household
        if (status.equals("HOH")) {
            if (income >= 0 && income <= 11950) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.10);
            } else if (income >= 11951 && income <= 45500) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.15);
            } else if (income >= 45501 && income <= 117450) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.25);
            } else if (income >= 117451 && income <= 190200) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.28);
            } else if (income >= 190201 && income <= 372950) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.33);
            } else if (income > 372951) {
                System.out.printf("The amount of tax you need to pay is %.2f", income * 0.35);
            }
        }

    }

}
