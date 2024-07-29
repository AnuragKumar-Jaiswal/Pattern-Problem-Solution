The `App.java` file contains various pattern functions such as right half pyramid, left half pyramid, pyramid, inverted pyramids, rhombus, diamond, hourglass, hollow patterns, Floyd's triangle, and Pascal's triangle.


This repository contains Java code for generating various pattern problems. Below are the pattern functions with their sample outputs.


[Uploading pattern-program-in-c.webp…]()

1. Right Half Pyramid
public void rightHalfPyramid(int n) {
    StringBuilder str = new StringBuilder("*");
    for (int i = 0; i < n; i++) {
        System.out.println(str);
        str.append("*");
    }
}
```
**Sample Output for n = 5:**
```

*
**
***
****
*****
```

### 2. Left Half Pyramid
```java
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
```
**Sample Output for n = 5:**
```
    *
   **
  ***
 ****
*****
```

### 3. Pyramid
```java
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
```
**Sample Output for n = 5:**
```
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
```

### 4. Right Half Inverted Pyramid
```java
public void rightHalfInvertedPyramid(int n) {
    for (int i = n; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
```
**Sample Output for n = 5:**
```
*****
****
***
**
*
```

### 5. Left Half Inverted Pyramid
```java
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
```
**Sample Output for n = 5:**
```
*****
 ****
  ***
   **
    *
```

### 6. Inverted Pyramid
```java
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
```
**Sample Output for n = 5:**
```
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
```

### 7. Rhombus
```java
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
```
**Sample Output for n = 5:**
```
*****
 *****
  *****
   *****
    *****
```

### 8. Diamond
```java
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
```
**Sample Output for n = 5:**
```
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
```

### 9. HourGlass
```java
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
```
**Sample Output for n = 5:**
```
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
```

### 10. Hollow Square
```java
public void hollowSquare(int n) {
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
```
**Sample Output for n = 5:**
```
*****
*   *
*   *
*   *
*****
```

### 11. Hollow Pyramid
```java
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
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    for (int i = 0; i < n; i++) {
        System.out.print("* ");
    }
}
```
**Sample Output for n = 5:**
```
    * 
   * * 
  *   * 
 *     * 
* * * * * 
```

### 12. Hollow Inverted Pyramid
```java
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
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
```
**Sample Output for n = 5:**
```
* * * * * 
 *     * 
  *   * 
   * * 
    * 
```

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
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    }
