# Higher-order functions

## Part 1: Filter

Definition: 

Reason: You can use high-order functions to write less bugs in less time

Filter: is a method on the array object  that accepts another function as it’s argument which it will use to return another filtered version of the array.

Let’s start with an array of animals [1] and you want to create a new array from that animals array with just the dogs, you could do that with a for loop [2] resulting in the desired array.

[1]
`var animals = [`
`  { name: 'Fluffykins',  species: 'rabbit' },`
`  { name: 'Caro',        species: 'dog' },`
`  { name: 'Hamilton',    species: 'dog' },`
`  { name: 'Harold',  species: 'fish' },`
`  { name: 'Ursula',  species: 'cat' },`
`  { name: 'Jimmy',  species: 'fish' }`
`]`

[2]
`var dogs = []`
`for (var i = 0; i < animals.length; i++) {`
`  if (animals[i].species === 'dog')`
`    dogs.push(animals[i])`
`}`


We will now do the same thing with filter

`var dogs = animals.filter(function(animal){`
`  return animal.species === 'dog'`
`})`


The filter function accepts one argument, another function. Functions that you send into other functions are called callback functions because the host function will call back to them.

Filter will loop through each item in the original array and for each item it will pass it into the callback function. It’s going to expect the callback function to return either true or false to tell filter whether or not this item should be in the new array. In this case it’s asking for just dogs and so the new array will have just dogs.

The filter function is a lot less code than the for loop. Not just because it’s less code and thus a smaller program in kb, it’s actually less code, less logic. When we write our software in small simple functions they compose together which allows us to reuse functions in other places easily.

The only real heavy lifting the filter function we wrote does is in this line

` return animal.species === 'dog'`


The other part of this program, the creating a new array and stuffing it with the dog species as shown above, is what the for loop gets done with these lines

`for (var i = 0; i < animals.length; i++) {`
` ` 
`    dogs.push()`

That’s handled with the filter function with the following code

`filter`

So it’s less code and it’s actually, and more importantly, less logic.


-- Now let’s breakout this call back into a separate variable.

`var isDog = function(animal) {`
`  return animal.species === 'dogs'`
`}`
` `
`var dogs = animals.filter(isDog)`


isDog is just a function that checks that an object is a dog. It doesn’t have anything do with filtering at all so we can use the isDog function elsewhere to do other things

reject is another high-order function that does the inverse of filter and will check for and deny anything that passes the test passed into it, in this case dogs.

`var notDogs = animals.reject(isDog)`


The for loop is not the best code for this situation because it’s a lot of code that locks two solutions together thereby not letting us easily debug the code itself or use either of the two pieces elsewhere.

Using filter allows us to separate the two things happening here. 1: find the dogs in the animals array. 2: create a new array with just the dogs.

In closing, in JavaScript, functions are values. You can exploit this by dividing your code into small and simple functions and composing them together using higher-order functions.

# Part 2: Map

Review: Functions are values, you can exploit this by making functions that take other functions as their arguments, which is called a higher order function. Filter is an example of this. Filter is a method on the array object that takes another function as its argument and uses that function to filter the array.

Setup: Map, like filter is a higher order function and a method on the array object. Unlike filter, map doesn’t remove/catch things from an array but instead transforms them.

Goal: We have an array of animals [1] (identical to Part 1) and we want to grab only the names of the animals.

`var animals = [`
`  { name: 'Fluffykins',  species: 'rabbit' },`
`  { name: 'Caro',        species: 'dog' },`
`  { name: 'Hamilton',    species: 'dog' },`
`  { name: 'Harold',  species: 'fish' },`
`  { name: 'Ursula',  species: 'cat' },`
`  { name: 'Jimmy',  species: 'fish' }`
`]`
[1]

Let’s do this first using a for loop [2]

`var names = []`
`for (var i = 0; i< animals.length; i++) {`
`  names.push(animals[i].name)`
`}`
`console.log(names)`
[2]

This for loop loops through the animal array, and for each animal it just picks the name property and pushes it into the names array and the console log prints the list of names.

`["fluffkins", "Caro", "Hamilton", "Harold", "Ursula", "jimmy"]`

Filter and map differ a lot in the way they work. Filter expected its callback function to return a true or false value to determine whether or not each item should be pushed into the array.

Map will include all items but expects the callback function to return transformed items instead of the original items, in this case: the name and not the entire object.

`var names = animals.map(function(animal){`
`  return animal.name`
`})`
`console.log(names)`

This gives us the exact same result

`["fluffkins", "Caro", "Hamilton", "Harold", "Ursula", "jimmy"]`

Using map to return a subset of an object is a very common use.

Let’s get fun here though and add text that adds the species to each name item in the array.

`var names = animals.map(function(animal)[`
`  return animal.name + ' is a ' + animal.species`
`])`
`console.log(names)`

result: 
`["fluffkins is a rabbit ", "Caro is a dog", "Hamilton is a dog", "Harold is a fish", "Ursula is a cat", "jimmy is a fish"]`

Nice.

Now let's do it with arrow functions

First let's shorten the code to fit on one line

`var names = animals.map(function (animal) { return animal.name })`

Great. Now let’s make it an arrow function by removing the word function and placing a => immediately after the function name.

`var names = animals.map((animal) => { return animal.name })`

Now, if an arrow function can fit on one line you can go a step further and remove the return command and the curly brackets and it will be implicitly returned.

`var names = animals.map((animal) => animal.name) console.log(names)`

You can even make it shorter! With functional programming we can use an x for the variable name

`var names = animals.map((x) => x.name) console.log(names)`
Is a lot shorter than 
`var names = []`
`for (var i = 0; i < animals.length; i++) {`
`  names.push(animals[i].name)`
`}`
`console.log(names)`


# Part 3: Reduce

To review, the following methods on the array object are list transformations

map: takes an array and makes a new array of the same length but with each item transformed in some way.
filter: takes an array and returns a new smaller array based on passed conditions
reject: takes an array and returns a new smaller array based on failed conditions
find: takes an array and returns a single item based on passed conditions

reduce is new. The previous methods are all pretty specific but reduce is not. Reduce is the mutli-tool of list transformations and can be used to express any list transformations. Reduce can be used to do anything.

Set up: you have an array of orders with numbers as values and you want to find the sum of the amounts.

`var orders = [`
`  { amount: 250 },`
`  { amount: 400 },`
`  { amount: 100 },`
`  { amount: 325 }`
`]`

First, for loop

`var totalAmount = 0;`
`for (var i = 0; i < orders.length; i++) {`
`  totalAmount += orders[i].amount`
`}`
`console.log (totalAmount)`

And now the reduce method
`var totalAmount = orders.reduce(function(sum, order){`
`  return sum + order.amount`
`}, 0)`
`console.log(totalAmount)`

Let’s break down what’s happening with the reduce method with this video (https://www.youtube.com/watch?v=g1C40tDP0Bk)

orders.reduce takes a callback function with two parameters (sum and order)
The first argument to the reduce method is a callback function
And the second argument is the initial value for order, 0.

Every time we call through the reduce method, reduce assigns sum and order new values. At the beginning of a call sum is defined as the total of the previous call, so at the beginning of the 2nd call sum sits at 650, order is set to 100 so when added together the 2nd call sum is given the “sum” of 750. Sum starts the 3rd call set to that previous sum of 750 and so on. (250 + 400 = 650. 650+100=750.) and every time the reduce method loops through.


# Part 4: More Reduce
--stopped here--