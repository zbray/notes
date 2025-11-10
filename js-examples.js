// Examples of Functions
// Write a function where an even number returns “Even” and an odd number returns “Odd”


function even_or_odd(number) {
  if (number % 2 === 0) {
    return "Even";
  } else {
    return "Odd";
  }


// Write a function that returns a string with all the vowels removed

function  disemvowel(str) {
  Return str.replace(/[aeiou]/gi, ‘’);
}


// Abbreviate a Two Word Name


function abbrevName(name) {
    const [firstName, lastName] = name.split(' ');
    return `${firstName[0].toUpperCase()}.${lastName[0].toUpperCase()}`;
}
}
