# StringCalculator-Kata-TDD

## Test Driven Development

Test driven development (TDD) ia a method of implementing software programming that interlaces unit testing, programming and refactoring on source code.
TDD was introduced a part of a large software design paradigm known as Extreme Programming(XP), which part of the Agile software development methodology.

The steps is generally followed:
 
 1. Write a test
 2. Run all test
 3. Write the code that passes the test case
 4. Run the test cases
 5. Refactor code
 
 Motto of TDD :
 
 1.Red - Create a test case and make it fall
 2.Green - Make the test case pass by any means.
 3.Rafactor - Change the code to remove duplicate/redundancy.
 
## IDE
Eclips

## Problem Statement

1. Create a simpe class named String Calculator and a method **int add(String numbers)**

  - The method can take numbers as a string separated by comma and will return their sum (for an 
      empty string, it will return 0). For example:

      Input: ""
      Output: 0

      Input: "1"
      Output: 1

      Input: "1,2"
      Output: 3

 - Start with the simplest test case of an empty string and move to one & two numbers.
 - Remember to solve things as simply as possible so that you force yourself to write tests you did 
      not think about
 - Remember to refactor after each passing test.
  
2. Allow the add method to handle an unknown amount of numbers

3. Allow alphabets to be included with numbers.
    The numeric value for the alphabet would be equal to its position.
    Such as a = 1, b = 2, c = 3 … y = 25, z = 26.
    
    For example:
  Input: "1,2,a,c"
  Output: 7 (1 + 2 + 1 + 3)
  
4. Calling add with a negative number will throw an exception “Negatives not allowed” - and the negative 
that was passed.

5. If there are multiple negatives, show all of them in the exception message

6. Numbers bigger than 1000 should be ignored.
  For example:
  Input: "2,1001"
  Output: 2
  
 
