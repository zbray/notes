# CSS Basics

### CSS Variables
Larger, complicated websites can contain a lot of CSS code. Many of the CSS rules will be repeated sometimes in hundreds of places. In order to simplify the process of repeating necessary code, in order to make it easier to change CSS rules by only having to change one line of code and to make the repeated rules more familiar and easier to read we use variables.



Declaration of the custom property - 

`element {`
`  --main-bg-color: red;`
`}`

Re-using the custom property - 

`elmenet 2 {`
`  color: var(--main-bg-color);`
`}`

`(--main-bg-color)` can be used many times throughout the CSS file but if it needs to be changed it only needs to happen once, in the declaration. A global search for red in this instance could result in many more instances than needed. `(--main-bg-color)` also tells the peruser of the code semantically what the property is being used for.


### Compatibility Improvements

