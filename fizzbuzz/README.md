# FizzBuzz Task

## Background

Fizzbuzz is a game for children to teach division.
The game is each player counts up from 1, if the number is divisible by three they say "fizz" instead,
if the number is divisible by 5 they say "buzz" instead, if it's divisible by both they say "fizzbuzz".

This would give an output such as: \
1, 2, fizz, 4, buzz, 5, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz, 16, 17, fizz, 19, buzz...

This is now used as a common screening question for technical interviews to filter out bad candidates.

## Task

Implement a version of fizzbuzz that counts up to a given range and gives a list of the output as strings.
Define this in `src/test/java/fizzbuzz/FizzBuzz.java` in method `List<String> fizzbuzz(Integer range)`,
remove the `throw` line and solve this however you want.

## Running

Run for 20 with `./gradlew run`.

## Testing Solution

To test your solution remove the line `@Disabled` near the top of `src/test/java/fizzbuzz/FizzBuzzTest.java`.
Then `./gradlew check` will test your solution and give you details of anything it failed.

## Example solution

If you get stuck `src/test/java/fizzbuzz/FizzBuzzDemo.java` has an example solution written by Jamie which passes all the tests.
