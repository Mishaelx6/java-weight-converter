@echo off
echo Running Java project...

REM Check if compiled classes exist
if not exist "build\classes\WeightConverter.class" (
    echo Classes not found. Please run build.bat first.
    pause
    exit /b 1
)

REM Run the application
java -cp build\classes WeightConverter

pause
