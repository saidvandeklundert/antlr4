Sample project from the definitive ANTLR reference.

The following files in this dir have not been created by ANTLR:
`ArrayInit.g4`:
The grammar for this project.

`ShortToUnicodeString.java`:  
The built-in tree walker triggers callbacks in a listener upon seeing the beginning and end of the various phrases. These methods, overrides, are defined in this file.

Not ever enter/exit method needs an override, just the ones you care about.
In the file, `ctx.INT()` ias asking for the context object for the integer INT token matched by that invocation of rule value. Context objects record everything that happens during the recognition of a rule.

In the example, a few methods in the subclass of `ArrayInitBaseListener.java` have been implemented. The `ShortToUnicodeString` extends the `ArrayInitBaseListener` which implements `ArrayInitListener`, which is the interface declaration.

`Test.java`:

Program that takes stdin, feeds that to the lexer, parses it and prints it to screen.

`Translate.java`:
Lexes and parses stdin. After this, walks the tree created during the parse to trigger the callbacks that were defined in ShortToUnicodeString.


```
. ~/.bashrc
antlr4 ArrayInit.g4
grun ArrayInit init -tree

javac ArrayInit*.java Test.java
java Test

javac ArrayInit*.java Translate.java
java Translate
```

Example:
```
java Translate

{1,2,3}
"\u0001\u0002\u0003"
```