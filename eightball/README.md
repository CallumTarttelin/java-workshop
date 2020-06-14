# Eight Ball Task

## Background

A magic 8 ball is a plastic ball which looks like the eight ball in a game of pool billiards.
They give a variety of supplied fortunes in roughly equal probability.

## Task

Create a virtual magic eightball be reading the fortunes from `src/main/resources/fortunes.txt`.
The fortunes are line separated and blank lines are to be ignored.

Select a random line from the file and return it.

## Running

Run with `./gradlew run`.

## Testing Solution

To test your solution remove the line `@Disabled` near the top of `src/test/java/eightball/EightBallTest.java`.
Then `./gradlew check` will test your solution and give you details of anything it failed.

## Example solution

If you get stuck `src/main/java/rover/EightBallDemo.java` has an example solution written by Jamie which passes all the tests.
