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

When doing arithmetic with two integers in Ruby the result will always be an integer.

To get a float as a result you must use a float in the equation.

You can also convert between the two:

Integer to float

`13.to_f #=> 13.0`

float to integer

`13.0.to_i #=> 13`

`13.9.to_i #=> 13`

note: Ruby does not round, when converting a float to an integer, the decimals are simply cut off.

other number methods:

check for even

`6.even? #=> true`

`7.even? #=> false`

check for odd

`6.odd? #=> false`

`7.odd? #=> true`

### Strings

Strings can be formed with either double `""` or single `''` quotation marks, also known as string literals. String interpolation and the escape characters only work inside double quotation marks, not single.

#### Concatenation

There are multiple ways to concatenate strings

Plus operator

`"This " + "has been " + "concatenated" #=> "This has been concatenated"`

Shovel operator

`"This " << "has been " <<  "concatenated" #=> "This has been concatenated"`

Concat method

`"This ".concat("has been ").concat("concatenated") #=> "This has been concatenated"`

#### String slices (substrings)

You can access strings inside strings

integer slice
"When a non-negative integer argument index is given, the slice is the 1-character substring found in self at character offset index:" (ruby documentation)

`"hello"[0] #=> "h"`

`"hello"[2] #=> "l"`

"When a Range argument range is given, it creates a substring of string using the indices in range."

The first argument gives the starting index, the second argument gives the number of characters

e.g. `"hello"[0,2]` returns "he" because it starts at index 0 and takes 2 characters.

`[0, 2]` would mean "start at index 0, take 2 characters"

`"hello"[0,2] #=> "he"`
`"hello"[0,1] #=> "h"`

#### Escape characters

Escape characters allow you to insert whitespace characters inside a  string that includes double quotation marks without accidentally ending the string

Ex:

`"Hello \n\n Hello"`

will return

```ruby
"Hello

Hello"
```

More escape characters:

```text
\ Need a backslash in your string?
\b  #=> Backspace
\r  #=> Carriage return
\n  #=> Newline - common
\s  #=> Space
\t  #=> Tab
\"  #=> Double quotation mark
\'  #=> Single quotation mark
```

#### Interpolation

String interpolation allows you to evaluate a string that contains placeholder variables. Very common, used a lot

Example:

```ruby
name = "Odin"
`puts "Hello, #{name}"` #=> "Hello, Odin"
`puts 'Hello, #{name}'` #=> "Hello, #{name}"
```

#### String Methods

strings come with loads of methods, see the [Ruby Docs](https://docs.ruby-lang.org/en/3.4/String.html) for more about them

capitalize

`"hello".capitalize #=> "Hello"`

include

`"hello".include?("lo") #=> true`

upcase

`"hello".upcase #=> "HELLO"`

downcase

`"Hello".downcase #=> "hello"`

empty?

`"hello".empty? #=> false`
`"".empty? #=> true`

length

`"hello".length #=> 5`

reverse

`"hello".reverse #=> "olleh"`

split

`"hello world".split #=> ["hello", "world"]`

`"hello".split("") #=> ["h", "e", "l", "l", "o"]`

strip

`" hello, world      ".strip #=> "hello, world"`

#### Converting other objects to strings

`5.to_s #=> "5"`

`nil.to_s #=> ""`

`:symbol.to_s #=> "symbol"`

### Symbols

Strings are mutable and each string literal is stored separately in memory. Symbols, by contrast, are immutable and stored only once — which saves memory.

One common use for symbols over strings are the keys in hashes.

To create a symbol, put a colon at the beginning of some text

`:my_symbol`

### Booleans

True and false - means what it says on the tin

Nil - Nil means "nothing." everything in Ruby has a return value, when a piece of code doesn't have anything to return it will return nil.

### Reading

- [Basics chapter of LaunchSchool's _Intro to Programming With Ruby_](https://launchschool.com/books/ruby/read/basics)
- Alex Chaffee's [Objects write up](https://codelikethis.com/lessons/learn-to-code/objects)

### Homework

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

```ruby
print "What's your name?"

name = gets.chomp

puts "Hello, #{name}!"
```

A hash is like a dictionary, it stores key/value pairs

ex:

```ruby
person = { name: "Ruby", age: 40 }
puts person[:name] #=> "Ruby"
```

### Run this block times explainer

```ruby
3.times do |i|
  puts i
end
```

`3.times` tells ruby to run this block 3 times
`do |i| .. end` defines the block
`i` is the looper counter starting at 0

So it runs 3 times with i being 0, then 1, then 2

Key notes:

- interpolation means inserting a variable's value into a string

- A Ruby Hash is similar to a JavaScript Object

## Variables

Declaring a Variable in Ruby:

```ruby
year = 2025 #=> 2025
```

You can also assign the result of an expression to a variable

```ruby
year = 2020 + 5 #=> 2025
```

Variable names are reusable and can be assigned new variables - doing so will override the previous value

```ruby
year = 2020
year #=> 2020
year = 2025
year #=> 2025
```

### Assignment Operators

There may be scenarios where you want to perform an operation on the original value of a variable and then assign the result of that operation to the variable

```ruby
year = 2020
year #=> 2020
year = year + 5
year #=> 2025
```

This is common enough in Ruby there is a shorthand assignment operator for doing this: `+=`

```ruby
year = 2020
year += 4 #=> 2025
```

Here are some similar assignment operators:

```ruby
year = 2025
year -= 2 #=> 2023

cash = 10
cash *= 2 #=> 20

temperature = 40
temperature /= 10 #=> 4
```

### Naming Conventions

Ruby aims to be a language that is easy to read and write. Variable naming conventions reflect this and variables should be named clearly as possible describing what the value of the variable represents.

Naming variables should make it easy for strangers to the code to read and understand, whether someone else or you in a few months when you can't remember the details as well.

Ruby variables should be lowercase and multiple words that make up a variable name should be split by an underscore, snake_case

```ruby
# bad
a = 19
string = "John"

# good
age = 19
name = "John"
can_swim = false
```

### Variables as references

Data is stored in memory so when a variable is declared it creates a pointer to that memory location. This can create an issue when a variable is used to point to the memory location pointed to by a different variable

```ruby
desired_location = "Barcelona"
johns_location = desired_location
```

both variables here would return `"Barcelona"`, weird things can happen when that string is modified.

lets modify that string with the upcase! method

```ruby
johns_location.upcase! #=> "BARCELONA"

desired_location #=> "BARCELONA"
```

This has changed the value of desired_location to `BARCELONA`

### Assignments

- Read the [Variables](https://launchschool.com/books/ruby/read/variables) chapter from LaunchSchool's _Introduction to Programming With Ruby_. Most important to note here: you should not use `$global_variables` and `@@class_variables` are rarely needed and easily misused.

- Read these variable lessons by Ruby Monstas:
  - [Overview of Variables](http://ruby-for-beginners.rubymonstas.org/variables.html)
  - [Reusing Variable Names](http://ruby-for-beginners.rubymonstas.org/variables/reusing_names.html)
  - [Things on the Right Go First](http://ruby-for-beginners.rubymonstas.org/variables/right_goes_first.html)

- Use IRB in your command line or an appropriate online REPL environment and try naming some variables and assigning values to them. Don’t worry so much about good naming conventions at this stage. Instead, experiment with different variable names and see what is valid. Try using symbols or numbers in your variable names. Try assigning a variable to another variable and observe the behavior when using upcase!, as in the example above. If you come across anything quirky, Google it to find out why it happened.

## Input and Output

Lesson Overview:

- Differentiate between the print and puts commands
- Describe the method used to get input from the user

### Output commands

To output information we can use the print command.

`puts` appends a new line to the argument passed in
`print` keeps things on one line.

both `puts` and `prints` return `nil` after printing whatever argument they are passed.

Semicolons are never required in ruby but they allow you run multiple commands all on one line. This type of code golf is not generally recommended but is helpful to see what's happening with `puts` and `prints`.

### Input commands

To accept input from a user we use the `gets` command.

When using `gets` program execution will stop and wait for user input. After the user inputs and sends their input the program will continue its execution.

```ruby
irb(main):001:0> gets
The Odin Project
=> "The Odin Project\n"
```

Whereas `puts` and `print` return `nil` at the end, `gets` returns the user input. This means the input can be assigned to a variable so that we can use, manipulate, twist and turn, and spit back out.

### Assignment

1. Read through and complete the exercise from [learnrubyonline.org’s “Hello, World” lesson](https://www.learnrubyonline.org/en/Hello_World)
2. Read the first four sections (puts, gets, putc, and print) of the Ruby - [File I/O](https://www.tutorialspoint.com/ruby/ruby_input_output.htm) from TutorialsPoint.
3. Read [this Ruby guides article](https://www.rubyguides.com/2018/10/puts-vs-print/) describing the differences between puts, print, and p.

## Conditional Logic

Conditional logic is when code will only execute under certain conditions.

Any conditional statement, (ex `if room_dirty`) will always evaluate to either true or false.

Conditional statements that evaluate true will execute code, if the statement evaluates false the code will be skipped. You can provide code to run for false statements as well as adding multiple conditional statements on one line but this is not clean code.

Conditional statements introduce many bugs so be sure to understand the logic behind the expression being evaluated so you can step through the code to fix any bugs.

### Section Overview

- Describe and list falsy values
- Explain how to use `if`, `elsif`, and `else`.
- Explain the difference between `if` and `unless`
- Describe what `||`, `&&` and `!` do.
- Explain what short circuit evaluation is.
- Describe what the ternary operator is and how to use it.
- Explain what a `case` statement is and how it works.

### True and Falsy in Ruby

False values are simple in ruby, just `nil` and `false` values. Everything else is considered true. Even the string `"false"` is true in conditional expressions. Other programming languages may consider the number 0 or an empty string ("") to be false, but not in ruby.

### Basic conditional statement

The simplest way to control the flow of your code using conditionals is with the `if` statement.

```ruby
if statement_to_be_evaluated == true
  # do something
end

if 1 < 2
  puts "1 is less than 2!"
end
#=> 1 is less than 2!
```

You can also make the code fit on one line:

```ruby
puts "1 is less than 2" if 1 > 2
```

One line conditional statements do not require `end` statement

Conditional statements can be anything that returns true or false; it can be a mathematical expression, a variable value, or a call to a method. Only if the expression evaluates to true does the code inside the block run.

### else and elsif

You'll often need to run a condition if a statement is true and run something else if the code is false, that's done with an `if else` statement.

```ruby
if attack_by_land == true
  puts "release the goat"
else
  puts "release the shark"
end
```

But what if there's a third option? attacked by air? that'll require an `if...elsif...else` statement

```ruby
if attack_by_land == true
  puts "release the goat"
elsif attack_by_sea == true
  puts "release the shark"
else
  puts "release Starro"
end
```

You can use as many `elsif` statements as you want. The else clause is optional, but you'll usually want to provide some default value.

### Boolean logic

To determine whether an expression evaluates to `true` or `false` you'll need a comparison operator, Ruby provides many:

`==` returns true if the values compared are equal

```ruby
5 == 5 #=> true
5 == 6 #=> false
```

`!=` (not equal) returns `true` if the values compared are not equal.

```ruby
5 != 7 #=> true
5 != 5 #=> false
```

`>` (greater than) than returns `true` if the value on the left of the operator is lager than the value on the right

```ruby
7 > 5 #=> true
5 > 7 #=> false
```

`<` (less than)  returns `true` if the value on the left of the operator is less than the value on the right
`>=` (greater than or equal to) returns `true` if the value on the left of the operator is larger than or equal to the value on the right.

```ruby
7 >= 7 #=> true
7 >= 5 #=> true
```

`<=` (less than or equal to) returns true if the value on the left of the operator is smaller than or equal to the value on the right.

```ruby
5 <= 5 #-> true
5 <= 5 #=> true
```

`equal?` checks whether both values are the exact same object in memory. Two variables pointing to the same number will usually return `true`

```ruby
a = 5
b = 5
a.equal?(b) #=> true
```

Because of the way integers are stored in memory these will return `true`

However, look at the next example:

```ruby
a = "hello"
b = "hello"
a.equal?(b) #=> false
```

This happens because computers don't store different string objects at the same location in memory and since equal is checking both sides of the operator for being the same object in memory it will return false.

Ruby has a special operator called the "spaceship operator." `<=>`

Unlike the other comparison operators, which all return true or false, the spaceship operator has 3 potential results:

`-1` if the value on the left is less than the value on the right
`0` if both values are equal
`1` if the value on the left is greater than the value on the right

The spaceship operator is most commonly used in sorting functions, which we'll cover more later.

All these operators work on data types other than numbers, such as strings.

### Logical operators

Some operators will need more than one condition. in ruby we do that using logical operators, `&&` (and) `||` (or) and `!` (not)

There are some differences between the word versions and their symbolic equivalents in the way they evaluate code. See this [video](https://avdi.codes/how-to-use-rubys-english-andor-operators-without-going-nuts/)

The `&&` operator returns `true` if both the left and right expressions return `true`

```ruby
if 1 < 2 && 5 < 6
  puts "Party at Kevin's!"
end

# This can also be written as
if 1 < 2 and 5 < 6
  puts "Party at Kevin's!"
end
```

Note: the `&&` and `||` operators follow an order of logic that evaluates from left to right.

Using the `&&` operator both expressions must return `true`. If the first expression encountered returns `false` the second expression is never checked.

Using the `||` operator, if the first expression evaluates to `true`, then the second expression is never checked because the complete expression is already `true`, and the code in the block is run.

This is known as a short circuit evaluation.

```ruby
if 10 < 2 || 5 < 6 #=> although the left expression is false, it returns true because the right expression returns true.
  puts "Party at Kevin's!"
end

# This can also be written as
if 10 < 2 or 5 < 6
  puts "Party at Kevin's!"
end
```

The `!` operator reverses the logic of the expression. If the expression returns `false` using the `!` operator makes the expression `true` and the code inside the block will be executed.

```ruby
if !false #=> true

if !(10 < 5) #=> true
```

### Case statements

Case statements are a neat way of writing several conditional expressions that would normally be written as a messy if...elsif statement. You can even assign the return value from a case statement to a variable for use later.

Casae statements process each condition in turn, and if the condition returns `false` it will move onto the next one until a match is found. An `else` clause can be provided to serve as a default if no match is found.

```ruby
grade = 'F'

did_i_pass = case grade
  when 'A' then "Hell yeah!"
  when 'D' then "Don't tell your mother."
  else "'You shall not pass"
end
```

As soon as a match is found the value of that match is returned and the case statement stops executing.

If you need to do 