# Ruby notes

Things to cover: 
- Object-oriented design
- Testing
- Data Structures

### Intro to Ruby

>"A task that takes dozens of lines of code to accomplish in Java or a hundred in C could take just a few in Ruby thanks to Ruby prepackaging so many useful functions into easy-to-use and convenient methods."

Ruby on Rails framework is great for the web and has been optimized for iteration.

Rails is built entirely on Ruby but debugging issues requires strong Ruby knowledge.

Reading:
- For history read [the Introduction of Launch School’s Introduction to Programming with Ruby](https://launchschool.com/books/ruby/read/introduction)
- For basics on interacting with Ruby read [the Your Tools chapter of The Ruby for Beginners book ](https://ruby-for-beginners.rubymonstas.org/your_tools.html)
- For helpful advice about using and learning Ruby read [the “Preparations” chapter of Launch School’s Introduction to Programming with Ruby book](https://launchschool.com/books/ruby/read/preparations#usingacodeeditor)
- For troubleshooting and experimenting check out [how to use code files inside IRB](https://stackoverflow.com/questions/13112245/ruby-how-to-load-a-file-into-interactive-ruby-console-irb/38533339) (hint: invoke it with `irb -r ./your_file.rb` if it is in the same directory.)

### Getting Started

Ruby is very object-oriented, almost everything in Ruby is an object, even most basic data types of which there are 4:

numbers (integers and floats)
strings
symbols
Booleans