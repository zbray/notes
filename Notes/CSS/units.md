# CSS Units

## Relative Units

  Relative Units get their values from something else, their parents' dimensions, current font attributes, or current dimensions of the viewport. They include: Percentages (%), Font-sizes (em & rem), Character-sizes (ex & ch), Viewport Dimensions (vw & vh), Viewport Max (vmax), and Viewport Min (xmin)

### Percentagesof the parent element `%` -

  If a parent element has a width of 300px and a child element has a width of 50%, the actual width of the child element will be 150px.

### Viewheight `vh` and Viewwidth `vw`

  Vh and vw divide the viewport into a grid system of 100x100 units regardless of viewport size. This unit locks the value to relative to the width or height of the viewport. An element with a width of 75vw will have an actual with of 75% of the viewport regardless of the size of the viewport or the placement of the element on the webpage.

### Viewport Minimum `vmin`

  This unit will respond to the lower of two dimensions of the viewport. A value of 50vmin will be equal to half of either the height or the width of a viewport depending on which dimension is currently lower. If the viewport has less height than it does width, the vmin unit will define the element’s height. If the viewport has less width than it does height, the vmin unit will define the element’s width.

### Viewport Maximum `vmax`

  This unit will respond to the higher of two dimensions of the viewport. A value of 50vmax will be equal to half of either the height or the width of a viewport depending on which dimension is currently higher. If the viewport has more height than it does width, the vmax unit will define the element’s height. If the viewport has more width than it does height, the vmax unit will define the element’s width.

### Height of x `ex`

  This unit’s value will be declared by the visible height of the lower-case x in the current font-family and font-size.
    Note: This is similar to the typography concept, x-height. X is a good choice for something like this as the character does not have an ascender or descender (parts or serifs that cross the top plane or bottom plane of the character.)

### Width of 0 `ch`

  This unit’s value will be declared by the visible width of 0 in the current font-family and font-size.

### font-size `em`

  This unit’s value will be equal to the current font-size.
    Note: ems cascade, if you set a child to 2em and put it in a parent that’s 2em, the parent’s 2em value will cascade to its children and if it has a child element that is also 2em, the child will inherit the parent’s 2em and use that to impact its own length calculation which is 2em, so it will be 4x the font-size.

### Root em `rem`

  This unit multiplies the root’s font-size. A root font-size of 16, and a rem of 2 will equal a value of 32px.
    Note: rems do not cascade.

## Absolute Lengths

Absolute lengths are self-regulating and don’t get their dimensions based on anything else on the page. These are based on real world, solid dimensions, great for use in printing. These units are Inches (in), Centimeters (cm), Millimeters (mm), Points (pts), and Picas (pc).

### Inches `in`

  Standard inch

### Centimeters `cm`

  Standard centimeter

### Millimeters `mm`

  Standard millimeter

### Point `pt`

  1/72nd of an inch

### Pica `pc`

  12 points, or 1/6th of an inch

### Pixels `px`

  1 individual pixel in code will equal to 1 individual pixel on a screen. This is the most commonly used unit of measurement, however, with the thousands of different devices on the market end result can vary based on the pixel density of the user’s screen thus this is not recommended for resonsive websites.
