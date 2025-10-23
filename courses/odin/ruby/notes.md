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

`2 ** 2 #=> 4

3 ** 4 #=> 81`

Modulus

`8 % 2 #=> 0

10 % 4 #=> 2`

#### Integers and floats

The two main number types in Ruby are integers (whole numbers) and floats (numbers that contain decimal points)

When doing arithmetic with two integers in Ruby the result will always be an integer.

To get a float as a result you must use a float in the equation.

You can also convert between the two:

Integer to float

`13.to_f` #=> 13.0

float to integer
`13.0.to_i` #=> 13

`13.9.to_i` #=> 13`

note: Ruby does not round, when converting a float to an integer, the decimals are simply cut off.

other number methods:

check for even

`6.even?` #=> true

`7.even?` #=> false

check for odd

`6.odd?` #=> false

`7.odd?` #=> true

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

#### String slices (substrings)

You can access strings inside strings

integer slice
"When a non-negative integer argument index is given, the slice is the 1-character substring found in self at character offset index:" (ruby documentation)

`"hello"[0]` #=> "h"`

`"hello"[2]` #=> "l"`

"When a Range argument range is given, it creates a substring of string using the indices in range."

The first argument gives the starting index, the second argument gives the number of characters

e.g. `"hello"[0,2]` returns "he" because it starts at index 0 and takes 2 characters.

`[0, 2]` would mean "start at index 0, take 2 characters"

`"hello"[0,2]` #=> "he"
`"hello"[0,1]` #=> "h"

#### Escape characters

Escape characters allow you to insert whitespace characters inside a  string that includes double quotation marks without accidentally ending the string

Ex:

`"Hello \n\n Hello"` will return

"Hello

Hello"

More escape characters:

`\ Need a backslash in your string?
\b  #=> Backspace
\r  #=> Carriage return
\n  #=> Newline - common
\s  #=> Space
\t  #=> Tab
\"  #=> Double quotation mark
\'  #=> Single quotation mark`

#### Interpolation

String interpolation allows you to evaluate a string that contains placeholder variables. Very common, used a lot

Example:

name = "Odin"
`puts "Hello, #{name}"` #=> "Hello, Odin"
`puts 'Hello, #{name}'` #=> "Hello, #{name}"

#### String Methods

strings come with loads of methods, see the [Ruby Docs](https://docs.ruby-lang.org/en/3.4/String.html) for more about them

capitalize

`"hello".capitalize` #=> "Hello"

include

`"hello".include?("lo")` #=> true

upcase

`"hello".upcase` #=> "HELLO"

downcase

`"Hello".downcase` #=> "hello"

empty?

`"hello".empty?` #=> false
`"".empty?` #=> true

length
`"hello".length` #=> 5

reverse
`"hello".reverse` #=> "olleh"

split
`"hello world".split` #=> `["hello", "world"]`
`"hello".split("")` #=> `["h", "e", "l", "l", "o"]`

strip
`" hello, world      ".strip` #=> "hello, world"

#### Converting other objects to strings

`5.to_s` #=> "5"

`nil.to_s` #=> ""

`:symbol.to_s` #=> "symbol"

### Symbols

Strings are mutable and each string literal is stored separately in memory. Symbols, by contrast, are immutable and stored only once — which saves memory.

One common use for symbols over strings are the keys in hashes.

To create a symbol, put a colon at the beginning of some text

:my_symbol

### Booleans

True and false - means what it says on the tin

Nil - Nil means "nothing." everything in Ruby has a return value, when a piece of code doesn't have anything to return it will return nil.

## Reading

- [Basics chapter of LaunchSchool's _Intro to Programming With Ruby_](https://launchschool.com/books/ruby/read/basics)
- Alex Chaffee's [Objects write up](https://codelikethis.com/lessons/learn-to-code/objects)

## Homework

- Follow the cloning and installation instructions in the main README of our ruby-exercise repo to set up the exercises.
- Then, follow the usage instructions in the ruby-basics README to complete the exercises in the 1_data_types folder.
- After completing the exercises, check out the solutions branch on GitHub to compare solutions.

### Additional Resources

- [The Bastards Book of Ruby’s “Numbers” chapter](http://ruby.bastardsbook.com/chapters/numbers/)
- [The Bastards Book of Ruby’s “Strings” chapter](http://ruby.bastardsbook.com/chapters/strings/)
- [Ruby Monstas “Numbers” section](http://ruby-for-beginners.rubymonstas.org/built_in_classes/numbers.html)
- [Ruby Monstas “Strings” section](http://ruby-for-beginners.rubymonstas.org/built_in_classes/strings.html)
- [Ruby Monstas “Symbols” section](http://ruby-for-beginners.rubymonstas.org/built_in_classes/symbols.html)
- [Ruby Monstas “True, False, and Nil” section](http://ruby-for-beginners.rubymonstas.org/built_in_classes/true_false_nil.html)

### Quick Notes

`puts` and `print` both output text but `puts` adds a newline after the output and `print` keeps the cursor on the same line

To Create an array we use brackets

ex:

`[1, 2, 3, 4, 5]`

`gets.chomp` is used to get user input.
`gets` reads a line from the keyboard, including the newline at the end
`chomp` removes that newline.

It's how to safely get user input without an extra blank line

ex:

```print "What's your name? "

name = gets.chomp

puts "Hello, #{name}!"```

A hash is like a dictionary, it stores key/value pairs

ex:

```person = { name: "Ruby", age: 40 }
puts person[:name] #=> "Ruby"```

#### Run this block times explainer

```3.times do |i|
  puts i
end```

`3.times` tells ruby to run this block 3 times
`do |i| .. end` defines the block 
`i` is the looper counter starting at 0

So it runs 3 times with i being 0, then 1, then 2

Key notes: interpolation means inserting a variable's value into a string

