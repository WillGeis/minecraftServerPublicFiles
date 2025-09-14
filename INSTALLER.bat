@echo off
echo Compiling InstallerWindowMain.java...
javac INSTALLER\InstallerWindowMain.java

echo Running Installer . . .
java -cp . INSTALLER.InstallerWindowMain

pause
