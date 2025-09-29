# Collection Pipeline

## Questions

## First Encounters

- What is bliki?

bliki is a term that Martin Fowler first used in 2003 to refer to something that is a cross between a wiki and a blog

- What is grep?

Grep is a command that can search for matching patterns in a file. Grep is short for "global regular expression print"
(Note: I've used this before while building and troubleshooting my NAS)
The core behavior of grep uses the syntax `grep PATTERNS FILE` with the ability to insert an OPTION before PATTERNS

`OPTION` can be many things including `-i` which will ignore case, `-w` which will find the exact word or `-c` which will count the number of occurrences of the pattern input
`PATTERNS` will be the search terms
`FILE` will be the file being queried

### Query 
Martin starts off by explaining a cli query using grep that will find 3 top posts by word count on his bliki that mention "nosql"

`grep -l 'nosql' bliki/entries/* | xargs wc -w | sort -nr | head -4 | tail -3`

He mentions trying something similar in the Smalltalk programming language:

- What is Smalltalk?
An object-oriented programming language designed in the 1970s for eductional and business use. Hugely influential still today, almost all OOLs have been influenced by Smalltalk (Objective-C, Java, Python, Ruby)

`someArticles select: [ :each | each tags includes: #nosql]`

He then stretches the code out to sort what's returned, similar to the unix code example

`((someArticles
      select: [ :each | each tags includes: #nosql])
      sortBy: [:a :b | a words > b words])
      copyFrom: 1 to: 3`

He then breaks this down into ruby and common lisp and compares syntax

- What is common lisp?
A programmable programming language, the modern descendant of the Lisp language, which was first created in 1956. Known for parenthesized syntax that can represent both code and data. Used in academia and AI.

### Usage
Martin then explains the structure of the code, and the difference in syntax between lisp and Smalltalk/ruby. He mentions that fans of functional programming brag about the collection pipeline feature that OO languages lack. He pushes back saying that in fact Smalltalk used them widely but modern OO languages like C++, Java and C# didn't adopt Smalltalk's use of lambdas so the collection methods weren't possible in these new, popular languages and in fact did die out for most OO programmers. He flags Ruby's support of collection pipelines as a main reason he started using it. Lambdas have been used in C# and Java for a while now so collection pipelines are possible in more languages.


Note: in OO languages, a function is merely a class with one method.


Question

- What is a lamba?

## Defining Collection Pipeline

Collection Pipeline is, to Martin, "a pattern of how we modularize and compose software,"

> A collection pipeline lays out a sequence of operations that pass a collection of items between them. Each operation takes a collection as an input and emits another collection (except the last operation, which may be a terminal that emits a single value). The individual operations are simple, but you can create complex behavior by stringing together the various operations, much as you might plug pipes together in the physical world, hence the pipeline metaphor.

Question 

- What about this article impacts or informs your work or the work of the team/org?

- Is this just a series of arguments used as gates to return a small amount or singular piece of data?

Martin explains how he came to the term and how it is similar to the Pipes amd Filters pattern and also acklowedges a Collection Pipeline can be compared to "composing higher-order functions, where the functions all act on some form of sequence data structure"

### Main Forms
There are three main contexts that operations and collections take place that determine the form they take:

#### Unix : the collection is a text file amd the items are the lines in the file. each line is then broken out into values, separated by whitespace. the operations are unix processes and collections are composed by lining up one pipeline operator's output as the input for the next






















