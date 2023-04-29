# CSS Grid

## Set Up
All the elements that will be included in your grid will need to be wrapped in a parent div that will be given the 







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


ex: `grid-template-columns: repeat(auto-fill, 200px);` will render each column in the grid system as being 200px wide and the container/view will show as many as it can at a time given that static width of each column. The responsiveness of this value is limited as the columns are being given an unchanging width, and this value only lets the number of columns change.

ex: `'grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));` is far more responsive as it is giving the container/view more responsive control over how it renders the grid. Here the page is given less strict rules over the columns - the value here is telling the page to `repeat` (keep the same across the columns given the passed rules about width) `auto-fill` (fill the containter/view with as many columns as can fit)  `minmax(200px, 1fr)` as long as the width stays above 200px and below 1fr) so this will keep each columns width between 200px and 1fr while filling the entire width of the container. This allows for a much more responsive rendering and doesn't leave as much white space as the rule with repeat where a strict number is passed along with  auto-fill

`justify-items:start` - aligns the contents in a grid item along the row axis to the left side of the row. The row axis is each row. If the width of a column is larger than the minimum size of the items in it  and a value of `start` is given to `justify-items` the items will be left justified along the row axis. If a value of `end` is given, the items will be right justified.


___
`grid-template-rows`:
- defines the way the rows look.

`grid-gap`:
- Dictates the space between grids and other elements

