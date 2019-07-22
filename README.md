# Kaprekars-Constant

A snippet of Java code to demonstrate Kaprekar's Constant (https://en.wikipedia.org/wiki/6174_(number) ), a curious and counter-intuitive mathematical fact:

6174 is known as Kaprekar's constant after the Indian mathematician D. R. Kaprekar. This number is notable for the following rule:

* Take any four-digit number, using at least two different digits. (Leading zeros are allowed.)
* Arrange the digits in descending and then in ascending order to get two four-digit numbers, adding leading zeros if necessary.
* Subtract the smaller number from the bigger number.
* Go back to step 2 and repeat.
* The above process, known as Kaprekar's routine, will usually reach its fixed point, 6174, in at most 8 iterations.

## To use:
The routine is hard-coded with 1234. Change this value on line 10 in order to run with different values.
