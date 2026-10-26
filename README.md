# Java Simple Lessons

A collection of small Java examples covering core language and concurrency topics. Each top-level directory is an independent exercise with its own `src` folder.

## Topics

- Collections and iterators
- Generics, inner classes and exceptions
- Threads, locks and producer/consumer patterns
- Comparable/comparator usage

## Run an exercise

From an exercise directory:

```bash
javac -d out src/*.java
java -cp out Main
```

Some older exercises use a different class name or package; check the `main` method in `src` before running them.

Compiled `.class` files are intentionally excluded from version control.
