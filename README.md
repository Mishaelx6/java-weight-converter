# Java Weight Converter

A simple Java application that converts weight bidirectionally between pounds (lbs) and kilograms (kgs).

## Environment
- Java Version: 26
- Build Tool: Manual compilation (no Maven required)
- Project Structure: Standard Maven layout
- Repository: https://github.com/Mishaelx6/java-weight-converter

## Project Structure
```
JavaProject/
├── src/
│   └── main/
│       └── java/
│           └── WeightConverter.java
├── build/
│   └── classes/
├── pom.xml
├── build.bat
├── run.bat
└── README.md
```

## Features
- Bidirectional conversion: pounds to kilograms and kilograms to pounds
- Interactive menu-driven interface
- Input validation for positive numbers
- Continuous conversion within each mode
- Easy navigation between conversion modes
- Graceful exit option

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
javac src/main/java/WeightConverter.java -d build/classes

# Run
java -cp build/classes WeightConverter
```

### Using Maven (if Maven is installed)
```bash
# Compile
mvn compile

# Run
mvn exec:java -Dexec.mainClass="WeightConverter"
```

## Usage Example
```
=== Weight Converter ===
Bidirectional weight conversion tool

Select conversion direction:
1. Pounds (lbs) to Kilograms (kgs)
2. Kilograms (kgs) to Pounds (lbs)
3. Quit
Enter your choice (1-3): 1

--- Pounds to Kilograms ---
Enter weight in pounds (or 'back' to return to menu): 150
150.00 lbs = 68.04 kgs

Enter weight in pounds (or 'back' to return to menu): back

Select conversion direction:
1. Pounds (lbs) to Kilograms (kgs)
2. Kilograms (kgs) to Pounds (lbs)
3. Quit
Enter your choice (1-3): 2

--- Kilograms to Pounds ---
Enter weight in kilograms (or 'back' to return to menu): 70
70.00 kgs = 154.32 lbs

Enter weight in kilograms (or 'back' to return to menu): back

Select conversion direction:
1. Pounds (lbs) to Kilograms (kgs)
2. Kilograms (kgs) to Pounds (lbs)
3. Quit
Enter your choice (1-3): 3
Goodbye!
```

## Version History
- **v1.0** - Initial setup with HelloWorld application
- **v2.0** - Enhanced with bidirectional weight conversion functionality

## Next Steps
- Add more Java classes to `src/main/java/`
- Add dependencies in `pom.xml` as needed
- Use your IDE (IntelliJ, Eclipse, VS Code) to import this Maven project
- Consider adding other unit conversions (miles to kilometers, etc.)

## Contributing
Feel free to submit issues or pull requests to improve this weight converter application!
