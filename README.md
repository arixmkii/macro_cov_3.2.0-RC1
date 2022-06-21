## sbt project compiled with Scala 3

Highlights that coverage report can't be created for code, which uses macro enabled libraries.

### Usage

Run `sbt cov` to reproduce the isssue of missing source for macro code parts.
Will fail with error
```
No source root found for '<redacted>/modules/core/shared/src/main/scala-3/io/circe/Derivation.scala'
```
