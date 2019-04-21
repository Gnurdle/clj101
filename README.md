# clojure 101 - skewed for VSCode repl

The point is to build the minimal skin for a clojure application
with a slant of using it with visual studio code, for rank 
beginners.

You should equip your VSCode with 2.0.0 or greater Calva Plugin.

One of the first things I do is set a couple of repl workhorse keys
for Calva, because the key bindings are cruddy and I'm opiniated

Specifically I set these:

{
    "key": "meta+n",
    "command": "calva.setREPLNamespace"
}
{
    "key": "meta+f",
    "command": "calva.evaluateCurrentTopLevelForm"
}
{
    "key": "meta+x",
    "command": "calva.evaluateFile"
}
{
    "key": "meta+e",
    "command": "calva.evaluateSelection"
}

The rest I don't care about, but these are crucial to the repl experience for me to be as short as possible

    