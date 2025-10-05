# HTML

## Links

Anchor Elements are defined by wrapping an element with an `<a>` tag - this element becomes a link.

Anchor tags require information including targets that will send the user to the linked location. An HTML attribute gives additional information to an HTML element and always goes in the element's opening tag. Anchor tags require an href attribute to provide the target to the element.

Anchor tags can link to any kind of target on the internet - videos, pdf files, images, etc.

`<a href="https://www.theodinproject.com/about">About The Odin Project</a>`

Default behavior in most browsers is to open links in the same tab, this can be changed by adding the `target` attribute

the `rel` attributes can be added to the anchor tag with the following values for added privacy and security
`noopener` = instructs browser to navigate to target without granting the new browsing context access to the page that opened it (specifically does not set `Window.opener` property on opened window)
noreferrer = instructs browser to omit `Referer` header and leak no referrer information and act as though `noopener` keyword were also specified. No information about source will carrythrough to target link.

`target="blank"` = instructs the browser to open the link in a new tab

## Absolute vs Relative links

Absolute links link to pages on other websites and are structured as follows:
`scheme://domain/path`
example: `"https://www.theodinproject.com/about"`

Relative links link to pages within our own website.
example: `"about.html"`
