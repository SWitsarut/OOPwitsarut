import java.util.Scanner;

public class No9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt(), colCount = scanner.nextInt();
        int arr[][] = new int[colCount][rowCount];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        if (isConsecutiveFour(arr)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static boolean isConsecutiveFour(int[][] value) {
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {

                int currentVal = value[i][j];

                if (j < value.length - 3) {
                    boolean rightCon = false;
                    for (int k = j + 1; k < j + 4; k++) {
                        if (currentVal != value[i][k]) {
                            rightCon = false;
                            break;
                        } else {
                            rightCon = true;
                        }
                    }
                    if (rightCon) {
                        return rightCon;
                    }
                }

                if (i < value[i].length - 3) {
                    boolean downCon = false;
                    for (int k = i + 1; k < i + 4; k++) {
                        if (currentVal != value[k][j]) {
                            downCon = false;
                            break;
                        } else {
                            downCon = true;
                        }
                    }
                    if (downCon) {
                        return downCon;
                    }
                }

                if ((j < value.length - 3) && (i < value[i].length - 3)) {
                    boolean rightDiaCon = false;
                    for (int k = 1; k < 4; k++) {
                        if (currentVal != value[i + k][j + k]) {
                            rightDiaCon = false;
                            break;
                        } else {
                            rightDiaCon = true;
                        }
                    }
                    if (rightDiaCon) {
                        return rightDiaCon;
                    }
                }

                if (j > 2 && (i < value[i].length - 3)) {
                    boolean leftDiaCon = false;
                    for (int k = 1; k < 4; k++) {
                        if (currentVal != value[i + k][j - k]) {
                            leftDiaCon = false;
                            break;
                        } else {
                            leftDiaCon = true;
                        }
                    }
                    if (leftDiaCon) {
                        return leftDiaCon;
                    }
                }
            }
        }
        return false;
    }
}
