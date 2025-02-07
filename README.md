# Sum of Last 4 Even Numbers

## Description
This Java program calculates the sum of the last four even numbers in a user-input array. It takes an integer array as input, iterates backward through the array, and sums up the last four even numbers encountered. If there are fewer than four even numbers, it sums all available even numbers.

## How the Code Works

1. **Reading Input:**
   - The program first takes the size of the array as input from the user.
   - It then initializes an array of the given size and takes `size` number of inputs from the user.

2. **Finding and Summing Last 4 Even Numbers:**
   - The program initializes `count = 0` to track how many even numbers have been summed.
   - It also initializes `sum = 0` to store the cumulative sum of the last 4 even numbers.
   - A `for` loop runs in reverse (from the last index to the first) to traverse the array backward.
   - Inside the loop, the program checks if the number is even (`arr[i] % 2 == 0`).
   - If even, it adds the number to `sum` and increments `count`.
   - The loop breaks when `count == 4`, ensuring that only the last 4 even numbers are summed.

3. **Output:**
   - The final sum is displayed as output.

## Code

```java
package primeNum_and_Summations;

import java.util.Scanner;

public class SumOfLast_4EvenNums 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = s.nextInt();
        int arr[] = new int[size];
        
        for(int i = 0; i < arr.length; i++) // Storing input values
        {
            arr[i] = s.nextInt();
        }
        
        int count = 0;
        int sum = 0;
        
        for(int i = arr.length - 1; i >= 0; i--) // Traversing in reverse
        {
            if(arr[i] % 2 == 0) // Checking if number is even
            {
                count++;
                sum += arr[i];
            }
            if(count == 4) // Stop when 4 even numbers are summed
                break;
        }
        
        System.out.println("Sum Of Last 4 Even Numbers: " + sum);
    }
}
```

## Example Execution

### **Input:**
```
Enter the Size of Array
6
1 2 3 4 5 6
```

### **Processing:**
- Even numbers in the array: **2, 4, 6**
- Last four even numbers available: **6, 4, 2**
- Sum = `6 + 4 + 2 = 12`

### **Output:**
```
Sum Of Last 4 Even Numbers: 12
```

## Edge Cases Considered
- If the array has **less than 4 even numbers**, it sums all available even numbers.
- Works for both small and large arrays efficiently.

# Cloning the Repository

## Steps to Clone

To clone this repository to your local machine, follow these steps:

### Using HTTPS:
```sh
git clone https://github.com/Ananthadatta02/Java-Last4EvenSum-Array.git
```
