# Run test cases with command:
```bash
# Run single test class
./gradlew :app:test --tests "org.example.app.TestCase"
```

```bash
# Run signle test method
./gradlew :app:test --tests "org.example.app.TestCase.testM347_case2"
```

```bash
# run `--info --stacktrace` for details:
./gradlew :app:test --tests "org.example.app.TestCase" --info --stacktrace
./gradlew :app:test --tests "org.example.app.TestCase" --info
./gradlew :app:test --tests "org.example.app.TestCase" --stacktrace
```