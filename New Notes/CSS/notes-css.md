### CSS

#### What is it?

Cascading Style Sheets - the way that style is applied cascades like a waterfall - starting at the most general, moving to the most specific.

#### How is it used?

CSS can be added to a webpage in 3 different ways

**Inline** CSS can be added to an html element:

```html
<tag style="css" />
```

remember, normally attributes have the name of the attribute, equals sign, and value for the attribute
here the name is "style" and the valule is the css code.
the fist part here is the property we want to change, "background" and the value we want to set it to "blue

```html
<html style="background:blue"></html>
```

Inline is only used for a single element and not common.

**Internal** CSS

```html
<style>
  css
</style>
```

Internal CSS is done by utilizing a special html element called the style element
All code between the open and closing style tags are read as CSS

While Inline CSS applies to a specific element, Internal applies to the entire html document. The below code applies the red value to the background property to all p elements in the html document.

Internal CSS is only used for single page webpages.

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
<link ref="stylesheet" href="style.css" />
```

External CSS styling is useful for multi-page websites

This CSS code lives in an external file, usually styles.css or main.css

To connect the html document to the external css code you will add a link element to the head of the html.

The link element needs two properties: the "rel" which determines the role the linked file has in relationship to the html file and the "href" which lists the directory

External is most common.

```html
<link ref="stylesheet" href="./styles.css" />
```
