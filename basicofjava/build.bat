
@echo off
:: Ask user for the Java file name (without extension)
set /p filename=Enter Java file name (without .java): 

:: Compile the file into the 'out' folder
echo 🔧 Compiling %filename%.java...
javac -d out %filename%.java

:: Check if compilation failed
if %errorlevel% neq 0 (
    echo ❌ Compilation failed.
    pause
    exit /b
)

:: If compilation is successful, run the class
echo ✅ Compilation successful. Running %filename%...
java -cp out %filename%
pause
