# antlr4
Learning some stuff about ANTLR4

## ANTLR

ANTLR generates a function for each rule in your grammar. Writing grammar is like writing software. However, instead of using functions and methods, you use grammar rules.

Rules starting with a lowercase letter comprise the parser rules.
Rules startig with an uppercase letter comprise the lexical (token) rules.

Alternatives in a rule are separated with the `|` operator.

Using parentheses, we can group symbols into subrules, e.g. `( '*'|'\')` will match a multiplication symbol or a division symbol.

`-> channel(HIDDEN)` exists so you can preserve input and have the lexer ensure that the parser ignores the tokens. This is usefull in case you want to preserve comments or whitespaces etc.

`-> skip`: directive that tells the lexer to match and throw out the specified token

`(INT)+` or `INT+`: an arbitrarily long series of integers that cannot be empty.
`INT*`: a series of integers that can be empty
`INT?`: zero or 1 integer. One can also say and _optional_ integer.

`INT : [0-9]+ ;`: token definition for one or more digits

Fragments are reusable parts of lexer rules which cannot match on their own - they need to be referenced from a lexer rule. Examples:
`fragment DIGIT: [0-9];`: all possible digits
`fragment F_Letter: [A-Za-z] ;` : all possible upper and lowercase letters


`field : INT | STRING ;`: a field that will be an integer or a string
`('=' expr)?`: optional expression
`type: 'float' | 'int' | 'void'`: laying out a user-defined type

This or that or the other thing:
```
stmt: node_stmt
    | edge_stmt
    | attr_stmt
    | id '=' id
    | subgraph
    ;
```


`vector : '[' INT+ ']' ;` : Token dependancy. This will allow `[1]`, `[1 2]`, `[1 2 3]`, etc.


CSV parser example:
```g4
file : (row '\n')* ;        // sequence of 0 or more rows with a '\n' terminator
row: field (',' field)* ;   // sequence of 0 or more fields with a ',' separator
field: INT ;                // the field is an integer
```

Match statements in a programming language:
```g4
stats : (stat ';')* ; // match zero or more ';'-terminated statements
```

## Grammar


- sequence: sequence of elements, such as the values in an array initializer
- choice: a choice between multiple alternative phrases
- token dependence: the presence of one token requires the presence of its counterpart elsewhere in a phrase such as matching left and right parentheses.
- nested phrase: this is a self-similar language construct such as nested arithmetic expressions or nested statement blocks in a programming language

To implement these patterns, we really only need grammar rules comprised of alternatives, token references, and rule references (Backus-Naur-Format [BNF]).

optional:                           `?`
zero-or-more:                       `*`
one-or-more:                        `+`
## ANTLR install:

```
curl -O https://www.antlr.org/download/antlr-4.0-complete.jar
export CLASSPATH=".:/usr/local/lib/antlr-4.0-complete.jar:$CLASSPATH"
java -jar /usr/local/lib/antlr-4.0-complete.jar
# start antlr
java org.antlr.v4.Tool 
```

## ANTLR use:
```
# put the following aliases in vi ~/.bash_aliases
# then source it using the following
# . ~/.bashrc
# run antlr as cli
alias antlr4='java -jar /usr/local/lib/antlr-4.0-complete.jar'
antlr4 xxxx.g4

# have interactive cli made available
alias grun='java org.antlr.v4.runtime.misc.TestRig'

# starting it and feeding it some tokens:
#grun ArrayInit init -tokens
{99, 3, 451}
EOF (ctrl+D or CTRL + Z on Windows)

# show the parsed tree
grun ArrayInit init -tree
```


## Interesting links

Python grammar:
https://docs.python.org/3/reference/grammar.html