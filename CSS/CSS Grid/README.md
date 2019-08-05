# Properties and Values


### Relevant to CSS Grid

`grid-template-columns`:
- The number of values dictates the number of columns.

Note: If your target elements outnumber the number of values given to `grid-template-columns` your elements will repeat left to right and then repeating under each other given the constraints of your columns. If your targeted elements are not equally divided into the number of columns you've dictated the final row will stack as expected with blank columns in the place of the "missing" elements.

Note: `auto` as a value can be thought of as the max width of the content of the individual cells.

ex: `grid-template-columns: 40% 10%;` will render the targeted elements into 2 columns. The first column will be 40% the width of the containing element and the second colum will be 10% the width of the containing element.


ex: `grid-template-columns: 200px 200px;` will render the targeted elements into 2 columns with 200px width each.

ex: `grid-template-columns: 1fr 1fr;` will render the targeted elements into 2 equally sized and responsive columns

ex: `grid-template-columsn: 1fr 2fr 3fr;` will render the targeted elements into 3 responsive columns with the first column being one half the width of the 2nd column and 1/3rd the size of the third column.

ex: `grid-template-columns: repeat(3, 1fr);` the first number will dictate how many times the attached rule will be repeated.

ex: `grid-template-columns: auto 1fr 2fr`: auto will take into consideration the max size of the content in the column given the value `auto` when determining the width of the rest - in this case the first column will be the maximum width of the columns contents, and columns two and three will take up the remaining space in the containing element with the third column taking up twice as much of that space as the second column.


`justify-items`

ex: `justify-items:end` - will justify the the content inside of the columns at the right side of the column, even if the element takes up less space than

`grid-template-rows`:
- defines the way the rows look.

`grid-gap`:
- Dictates the space between grids and other elements

