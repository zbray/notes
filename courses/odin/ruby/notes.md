# Ruby Notes

Things to cover:

- Object-oriented design
- Testing
- Data Structures

## Intro to Ruby

>"A task that takes dozens of lines of code to accomplish in Java or a hundred in C could take just a few in Ruby thanks to Ruby prepackaging so many useful functions into easy-to-use and convenient methods."

Ruby on Rails framework is great for the web and has been optimized for iteration.

Rails is built entirely on Ruby but debugging issues requires strong Ruby knowledge.

Reading:

- For history read [the Introduction of Launch School’s Introduction to Programming with Ruby](https://launchschool.com/books/ruby/read/introduction)
- For basics on interacting with Ruby read [the Your Tools chapter of The Ruby for Beginners book](https://ruby-for-beginners.rubymonstas.org/your_tools.html)
- For helpful advice about using and learning Ruby read [the “Preparations” chapter of Launch School’s Introduction to Programming with Ruby book](https://launchschool.com/books/ruby/read/preparations#usingacodeeditor)
- For troubleshooting and experimenting check out [how to use code files inside IRB](https://stackoverflow.com/questions/13112245/ruby-how-to-load-a-file-into-interactive-ruby-console-irb/38533339) (hint: invoke it with `irb -r ./your_file.rb` if it is in the same directory.)

## Basic Data Types

Ruby is very object-oriented, almost everything in Ruby is an object, even most basic data types of which there are 4:

numbers (integers and floats)
strings
symbols
Boolean

REPL stands for Read-Eval-Print-Loop. It's a program that allows you type Ruby code & see the result directly. The most popular REPL is irb.

### Numbers

Ruby has all the typical math operators you would expect:

Addition 

`1 + 1 #=> 2`

Subtraction

`2 - 1 #=> 1`

Multiplication

`2 * 2 #=> 4`

Division

`10 / 5 #=> 2`

Exponent

`2 ** 2 #=> 4`
`3 ** 4 #=> 81`

Modulus

`8 % 2 #=> 0`
`10 % 4 #=> 2`

#### Integers and floats

The two main number types in Ruby are integers (whole numbers) and floats (numbers that contain decimal points)

When doing arithmetic with two integers in Ruby the resule will always be an integer.

To get a float as a result you must use a float in the equation.

You can also convert between the two:

Integer to float

`13.to_f` #=> 13.0

float to integer
13.0.to_f #=> 13
13.9.to_f #=> 13

note: Ruby does not round, when converting a float to an integer, the decimals are simply cut off.

other number methods:

check for even

`6.even?` #=> true
`7.even?` #=> false

check for odd

`6.odd?` #=> false
`7.odd?` #=>

### Strings

Strings can be formed with either double `""` or single `''` quotation marks, also known as string literals. String interpolation and the escape characters only work inside double quotation marks, not single.

#### Concatenation

There are multiple ways to concatenate strings

Plus operator
`"This " + "has been " + "concatenated"` #=> "This has been concatenated"
 
Shovel operator
`"This " << "has been " <<  "concatenated"` #=> "This has been concatenated"

Concat method
`"This ".concat("has been ").concat("concatenated")` #=> "This has been concatenated"


