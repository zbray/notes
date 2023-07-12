## CSS

### What is CSS?

CSS is a language used for describing how documents are arranged and sytled visually.

#### How is it used?

CSS is used in three different ways (inline, internal, or external) and applies styling rules to elements on an html document

**Inline** CSS can be added to an html element NOT RECOMMENDED

```html
<tag style="css" />
```

here the name is "style" and the valule is the css code.
the fist part here is the property we want to change, "background" and the value we want to set it to "blue

```html
<html style="background:blue"></html>
```

Inline is only used for a single element and not common.

**Internal** CSS is written inside a <style> element. NOT RECOMMENDED

```html
<style>
  css
</style>
```

While Inline CSS applies to a specific element, Internal applies to the entire html document. The below code applies the red value to the background property to all p elements in the html document.

```html
<html>
  <head>
    <style>
      p {
        background: red;
      }
    </style>
  </head>
</html>
```

**External** CSS links to an external CSS document

```html
<link href="./styles.css" rel="stylesheet" />
```

External CSS styling is useful for multi-page websites

This CSS code lives in an external file, usually styles.css or main.css

To connect the html document to the external css code you will add a link element to the head of the html.

The link element needs two properties: the "rel" which determines the role the linked file has in relationship to the html file and the "href" which lists the directory

External is most common.

```html
<link href="./styles.css" rel="stylesheet" />
```

### CSS Selectors

Selectors are used to select parts of the html to apply CSS code to.

CSS code is made of 3 parts

selector (paragraph tags), property (color) and value (blue)

#### Types of Selectors

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
<h3 class="blue-heading">Heading</h3>
<h3>Heading</h3>
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

````css
p[draggable="false"]{
  color:red;
}```
````

This css will make all p elements with the draggable value of false red.

**Universal Selector** will apply to every element

````css
* {
  color: blue;
}```
````
