# Java Project

A simple Java coding environment setup.

## Environment
- Java Version: 26
- Build Tool: Manual compilation (no Maven required)
- Project Structure: Standard Maven layout

## Project Structure
```
JavaProject/
├── src/
│   └── main/
│       └── java/
│           └── HelloWorld.java
├── target/
│   └── classes/
├── pom.xml
└── README.md
```

## How to Compile and Run

### Easy Way (Batch Scripts)
```bash
# Build and run in one step
build.bat

# Or just run if already compiled
run.bat
```

### Manual Compilation
```bash
# Compile
javac src/main/java/HelloWorld.java -d build/classes

# Run
java -cp build/classes HelloWorld
```

### Using Maven (if Maven is installed)
```bash
# Compile
mvn compile

# Run
mvn exec:java -Dexec.mainClass="HelloWorld"
```

## Next Steps
- Add more Java classes to `src/main/java/`
- Add dependencies in `pom.xml` as needed
- Use your IDE (IntelliJ, Eclipse, VS Code) to import this Maven project
