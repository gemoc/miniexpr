# Miniexpr
Minimalist and reusable expression language for GraalVM.

Requires GraalVM 20.1.0.

## Setup

To enable the miniexpr language on GraalVM, download the archive available [here](https://github.com/gemoc/miniexpr/releases/tag/v1.0.0), extract it in a folder of your choice, and run the graalvm-setup.sh script. The archive also contain an eclipse update site (packaged as a zip file) which you can use to install the miniexpr editors into your Eclipse IDE, providing auto-completion and syntax highlighting.

## Syntax

Currently, miniexpr supports arithmetic (`+`, `-`, `*`, `/`, `%`), boolean operators (`<`, `<=`, `>`, `>=`, `==`, `!=`, `&&`, `||`, `!`), the array size operator (e.g. `|[0,1,2]|`, `|a|`), and the array access operator (e.g. `a[42]`, `a[|a|/2]`).
Values can be integers, floating numbers (e.g. `0.333`), as well as `true`, `false`, vectors (e.g. `[1+1, 3, 2*2]`), and, when evaluated in the context of an ongoing execution, symbols accessible from local or global scopes of the program under execution.
When such symbols refer to objects with properties, these properties can be accessed through the `.` operator (e.g. `req.session.uuid`).

