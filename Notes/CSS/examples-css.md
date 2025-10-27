# CSS Examples

This code will add red border to images without alt text

```css
img:not([alt]) {
  border: 2px solid red;
}
```
<!-- Smooth Scrolling needs context -->
## Smooth scrolling

```css
html {scroll-behaivor: smooth;}
```

## Animate on Hove

```css
.card {
    transform: translateY(0px);
    transition: .5s;
}
.card:hover { 
    transform: translateY(-5px);
    transition: .5s;
}```

