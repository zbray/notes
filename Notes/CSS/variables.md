# CSS Variables

Larger, complicated websites can contain a lot of CSS code. Many of the CSS rules will be repeated sometimes in hundreds of places. In order to simplify the process of repeating necessary code, in order to make it easier to change CSS rules by only having to change one line of code and to make the repeated rules more familiar and easier to read we use variables.

Variables are available inside the element in which they are created. It is also available within any elements nested within that element. This is known as cascading. Because of cascading, many CSS variables are often defined in the :root element so as they can be used throughout the entire CSS file.

Declaration of the custom property -

`element {`
`--main-bg-color: red;`
`}`

Re-using the custom property -

`element 2 {`
`color: var(--main-bg-color);`
`}`

`(--main-bg-color)` can be used many times throughout the CSS file but if it needs to be changed it only needs to happen once, in the declaration. A global search for red in this instance could result in many more instances than needed. `(--main-bg-color)` also tells the peruser of the code semantically what the property is being used for.

Important - Sometimes the browser may not be able to find the variable so it's a good idea to give it a fall back value, declared as follows

`background: var (--main-bg-color, red);`

This can also be useful while debugging.
