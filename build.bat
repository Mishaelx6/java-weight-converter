@echo off
echo Building Java project...

REM Create output directory if it doesn't exist
if not exist "build" mkdir build
if not exist "build\classes" mkdir build\classes

REM Compile Java files
echo Compiling Java files...
javac -d build\classes -cp build\classes src\main\java\*.java

if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed!
    exit /b 1
)

echo Compilation successful!

REM Run the application
echo Running HelloWorld...
java -cp build\classes HelloWorld

pause
