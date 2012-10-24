Here is a simple 2 step process to replicate the issue:

1) Checkout the Example app.

```
git clone https://github.com/codeconsole/broken-groovy; cd broken-groovy
git checkout fatjar
```
2) Build the Exploded War

```
./gradlew clean gaeExplodeWar
```

Notice the error message:
```
* What went wrong:
Execution failed for task ':fatJarPrepareFiles'.
> String index out of range: 24
```