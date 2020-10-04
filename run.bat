@echo off
cd out
cd artifacts
cd java15_jar_test_jar
java --module-path "..\..\..\openjfx-15_windows-x64_bin-sdk\javafx-sdk-15\lib" --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.web -jar java15_jar_test.jar