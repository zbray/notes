# Properties and Values


### Relevant to CSS Grid

`grid-template-columns`:
- The number of values dictates the number of columns.

Note: If your target elements outnumber the number of values given to `grid-template-columns` your elements will repeat left to right and then repeating under each other given the constraints of your columns. If your targeted elements are not equally divided into the number of columns you've dictated the final row will stack as expected with blank columns in the place of the "missing" elements.

ex: `grid-template-columns: 40% 10%;` will render the targeted elements into 2 columns. The first column will be 40% the width of the containing element and the second colum will be 10% the width of the containing element.


ex: `grid-template-columns: 200px 200px;` will render the targeted elements into 2 columns with 200px width each.

ex: `grid-template-columns: 1fr 1fr;` will render the targeted elements into 2 equally sized and responsive columns

ex: `grid-template-columsn: 1fr 2fr 3fr;` will render the targeted elements into 3 responsive columns with the first column being one half the width of the 2nd column and 1/3rd the size of the third column.

ex: `grid-template-columns: repeat(3, 1fr);`


`grid-gap`:
- Dictates the space between grids and other elements

