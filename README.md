# antlr4
Learning some stuff about ANTLR4

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
