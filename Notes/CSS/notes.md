# CSS Basics

## Tips

`<br>` and `br { display: none; }`

Prevent CMS users abusing multiple line breaks for spacing.

## What is CSS?

CSS is a style sheet language used to selectively style HTML elements.

```css
p {
  color: red;
}
```

CSS code includes a Selector and a Declaration.

The Selector (`p` tag in this example) selects the HTML element to be stylized and the Declaration is the rule.

The Declaration here is made of the Property and Property Value, here the `color` property is being set to `red`

## How is it used?

### **Inline CSS**

Inline styles are defined within the "style" attribute of the individual element to be stylized, although this is not recommended.

```html
<p style="background:blue"></p>
```

### **Internal CSS**

Internal style sheets can be used when a specific HTML page has unique style rules, although this is not recommended

```html
<style>
  body {
    background-color: black;
  }
</style>
```

### **External CSS**

External style sheets are separate files that can store many rules and can be used for multi-page websites. This usage is most common.

To connect the HTML document to the external CSS document you will add a link element to the head of the html.

```html
<link rel="stylesheet" href="./styles.css"  />
```

The link element needs two properties: the `rel` which determines the role the linked file has in relationship to the HTML file and the `href` which lists the directory

```html
<link href="./styles.css" rel="stylesheet" />
```

## CSS Selectors

Selectors are used to select parts of the html to apply CSS code to.

CSS code is made of 3 parts

selector (paragraph tags), property (color) and value (blue)

```css
selector {
  property: value;
}

### Types of Selectors

**Element Selector** A selector that applies to every occurance of a selector

```css
h2 {
  color: red;
}
```

This will make the color property of every h2 element red.

**Class Selector** A selector that applies to a certain class of elements

```css
.blue-heading {
  color: blue;
}
```

This will make the color property of all html elements with the class red-heading red.

What is a class?

A class is an attribute that can be added to html elements to group the same css rules.

```html
<h3 class="blue-heading">Heading</h3> <h3>Heading</h3>
```

The html code above will make the h3 element with the class blue-heading blue

**Id Selector** should only be applied to a single element in an entire html document. That html element should only have one id applied to it, this should be a unique element.

```css
#main {
  color: grey;
}
```

This will make the color property of the html element with the main id grey.

**Attribute selector** can be used to specify elements with specific attributes or attribute values.

```css
p[draggable="false"] {
  color: red;
}
```

The code above will make all `p` elements with the draggable value of `false` red.

**Universal Selector** will apply to every element

```css
* {
  color: blue;
}
```

Universal Selector This will select everything

```css
* {
  color: black;
}
```

### Element Selector

This will select every element of a given type

```css
img {
  width: 100px;
  height: 100px;
}
```

### Colors

Color attribute will style the color of the text of text elements

Names: Browsers support 140 different color names to be used as values for color attributes

```css
p {
  color: red;
}
```

RGB: three digits that result in over 16 million color options

Hex: same color model as RGB but represented with hexadecimal (0-9 and A-F) The first two places in a hexadecimel represent the red, the middle 2 green, and the last two blue.

### General Notes

Alignment properties only move things within the confines of the content.

For example if you give an h2 tag a align right property but also a "width:50%" the h2 tag will align right but only within it's scope of 50% of the page.

### Text Properties

font-weight: controls the boldness or lightness of a given piece of text (400 is normal and 700 is bold) (not all font-weight numbers exist for all fonts)

text-decoration: controls the appearance of lines on text (under, over, through; colored, dotted, etc)

text-align: sets the horizontal alignment inside a block element or table-cell box

line-height: controls the height of a text box.

letter-spacing: sets horizontal spacing between characters

font-family: used as a list of fonts in order of preference for users to fall back on if they are not available.
(first font: specific
second font: less specific/2nd option
family)

### Font Size

There are different units for font sizes.

#### Relative

EM:
REM:
VH:
VW:
%:

#### Absolute

PX: pixels, most commonly used absolute unit. not recommended for responsive websites
PT: points,
CM: centimeters
IN: inches
MM: milimeters

<https://blog.revathskumar.com/2014/04/css-understanding-em-and-rem.html>

### CSS Variables

Larger, complicated websites can contain a lot of CSS code. Many of the CSS rules will be repeated sometimes in hudreds of places. In order to reduce the change for errors and to streamline the process of repeating and editing CSS rules we can use Variables and define them in one place to use the same property at many locations.

For example if our main text color is a certain shade of blue instead of typing in the color everytime we can define the color once, and then referenced throughout our code. Another benefit to this is readability, ``--main-text-color`` is easier to read than a hexadecimal color.

### Offsets

There are 4 offset properties, `top`,`bottom`, `left` and `right` that will tell the browser how far to offset an item relative to where it would be in the normal flow of the html document in the direction away from the named property.

## CSS Properties

### CSS Text Properties

`font-weight`: controls the boldness or lightness of a given piece of text (400 is normal and 700 is bold) (not all font-weight numbers exist for all fonts)

`text-decoration`: controls the appearance of lines on text (under, over, through; colored, dotted, etc)

`text-align`: sets the horizontal alignment inside a block element or table-cell box

`text-align: justify;`

`line-height`: controls the height of a text box.

`letter-spacing`: sets horizontal spacing between characters

`font-family`: used as a list of fonts in order of preference for users to fall back on if they are not available.
(first font: specific
second font: less specific/2nd option
family)

line-height
This changes the height of each line in a block of text. This changes the amount of vertical space each line of text gets.

#### text-transform

The `text-transform` property in CSS is used to change the appearance of text. It's a convenient way to make sure text on a webpage appears consistently, without having to change the text content of the actual HTML elements.

The below values and their effect on the text "Transform me"

`lowercase` => "transform me"
`uppercase` => "TRANSFORM ME"
`capitalize` => "Transform Me"
`initial` => uses the default value
`inherit` => uses the value from the parent element
`none` => Default: uses the original text

### Shapes and Shading

The `box-shadow` property creates a rectangular shadow behind an element's entire box

`drop-shadow` filter function creates a shadow that conforms to the shape (alpha channel) of the image itself
