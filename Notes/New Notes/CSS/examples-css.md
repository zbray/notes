### Code Examples

#### This code will add red border to images without alt text

CSS:
img:not([alt]){
border: 5px solid red;
}

### Smooth scrolling

html {
scroll-behaivor: smooth;
}

### CSS Flex - 4 layouts

HTML:

<form>
  <input type="text" placeholder="Name">
  <input type="email" placeholder="Email Address">
  <input type="submit" value="Subscribe">
</form>
CSS:
form {
  display: flex;
  flex-wrap: wrap;
  
  & > input {
    flex: 1 1 10ch;
    margin: .5rem;
    
    &[type="email"] {
      flex: 3 1 30ch;
    }
  }
}
`


### Center

