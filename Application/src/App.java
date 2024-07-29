
public class App {

    public void rightHalfPyramid(int n) {
        StringBuilder str = new StringBuilder("*");

        for (int i = 0; i < n; i++) {
            System.out.println(str);
            str.append("*");
        }
    }

    public void leftHalfPyramid(int n) {
        StringBuilder str = new StringBuilder("*");
        int loop = n - 1;
        while (loop >= 0) {
            for (int i = 0; i < loop; i++) {
                System.out.print(" ");
            }
            System.out.print(str);
            str.append("*");
            System.out.println();
            loop--;
        }
    }

    public void pyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void rightHalfInvertedPyramid(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void leftHalfInvertedPyramid(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void invertedPyramid(int n) {

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void rhombus(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void hourGlass(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void hollowSquare(int n) {

        // To form a Square n > 2
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

    }

    public void hollowPyramid(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    System.out.print("* ");
                } else if (j == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }

    public void hollowInvertedPyramid(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    System.out.print("* ");
                } else if (j == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void hollowDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    System.out.print("* ");
                } else if (j == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    System.out.print("* ");
                } else if (j == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void floydsTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public void pascalsTriangle(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k * (i - j) / j;
            }
            System.out.println();
        }

    }

    public static void main(String Arg[]) {
        App obj = new App();
        obj.hollowDiamond(5);
    }

}