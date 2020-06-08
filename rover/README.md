# Mars Rover Task

## Background

Mars rover is another popular coding kata.
You write the software for the rover which gives the coordinates and direction
for a given set of instructions.

## Task

Implement software for the rover which takes 4 instructions,
"f" (forward), "b" (backward), "l" (left), "r" (right).
Starting at (0, 0) North, f (Forward) goes forward one eg. when facing North y+1, West x-1.
b (backwards) does the opposite. l turns left, North to West, r turns right North to East.

Example `ffrff`:\
Start (0, 0) North,
go forwards 2 (0, 2) North,
turn right (0, 2) East,
go forwards 2 (2, 2) East

A position class is provided. You can create a position with `Position.at(0, 1, Direction.NORTH)`
for x, y, direction. The elements inside can be accessed with getX(), getY(), and getDirection().

## Running

Run for `ffrff` with `./gradlew run`.

## Testing Solution

To test your solution remove the line `@Disabled` near the top of `src/test/java/rover/Rover.java`.
Then `./gradlew check` will test your solution and give you details of anything it failed.

## Example solution

If you get stuck `src/test/java/rover/RoverDemo.java` has an example solution written by Jamie which passes all the tests.
