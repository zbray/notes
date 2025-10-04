# Ruby notes

From "Ruby in 100 Seconds" by Fireship

Benefits of Ruby:

- reduced complexity required to build a full stack web application
- minimal syntax using plain english words
- use of blocks to write concise functional code

It's a true Object Oriented Programming language

Everything is an object

Every object can be modified

This gives developers the flexibility to extend or modify the behavior of the underlying language

Developer ecosystem is large and mature, developers share code with Ruby Gems Package Manager. A program is organized into a self-contained format called a gem.

## Coding

to declare a local variable give it a name followed by a value

`hello = "hi mom"`

There is no variable keyword but you can define constants in all caps

`HELLO = "hi mom"`

or global variables with a dollar sign

`$hello = "hi mom"`

Every value is an instance of an object which means we can call methods directly on a string like this:

`hello = "hi mom".upcase()`

note: parentheses are usually optional

Ruby is dynamically typed which means there's no type annotations however modern tools like RBS can add a type system on top if akin to typescript on top of javascript

to print a value to standard output use the puts method:

`hello = "hi mom"

puts hello`

we can define our own custom methods using the def keyword which end with the end keyword.

Every method will always return exactly one object

No return keyword is necessary

if you don't want a named method you can create a block with the do keyword which works like an anonymous function

`3.times do
  "Ruby is awesome"
end`

blocks can also take arguments found between pipe characters

`3.times do |time|
  "Ruby is awesome ${time}"
end`

you can use the class keyword to create blueprints for custom objects

`class Human
  def quack()
    puts "quack!"
  end
end`

it uses duck typing (coined by Ben Koshy) meaning if it quacks like a duck and walks like a duck, it's a duck. it won't throw type errors based on the class itself but rather the methods that are implemented on it

use the initialize method to run code when a new object is constructed

any variable that starts with @ belongs to an object instance while any variable but any variable with a double @@ is static and belongs to the class itself

you can add getters and setters to a class using the attribute accessor method

`attr_accessor :face

now we can create a new object instance by calling the new method on the class
