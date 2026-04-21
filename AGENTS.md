# AGENTS.md

This file provides guidance for AI coding agents working on this repository.

## Repository Overview

A simple Java project containing a `Main` class that prints a greeting and counts from 1 to 5.

## Project Structure

```
src/
  Main.java    # Entry point: prints a greeting and loops 1–5
```

## Building and Running

Compile with `javac`:

```bash
javac src/Main.java -d out/
```

Run with `java`:

```bash
java -cp out Main
```

## Coding Conventions

- Java source files live under `src/`.
- Compiled `.class` files go into `out/` (excluded from version control).
- Keep changes minimal and focused on the stated requirement.
