@echo off
SETLOCAL

:: Navigate to frontend directory and build
cd frontend
echo Building frontend...
cmd /c npm run build || exit /b
PAUSE
cd ..

:: Copy frontend build to backend's static folder
echo Copying frontend build to backend's static folder..
xcopy /E /I /Y ".\frontend\dist\*" ".\src\main\resources\static\"
PAUSE

:: Build Backend using Maven
echo Building backend with Maven...
mvn -B package --file pom.xml
PAUSE

echo Script completed.