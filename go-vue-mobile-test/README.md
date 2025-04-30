# go-vue-mobile-test

## Setup
`cd` into the `go-vue-mobile-test` directory and run `npm ci`

gomobile must also be installed via `go install golang.org/x/mobile/cmd/gomobile@latest` and `gomobile init`
along with bind via `go get golang.org/x/mobile/bind` run from the `go` directory. 

This was all quite painful as there was virtually no documentation, this Chinese forum helped me a lot: https://blog.csdn.net/sinat_22215253/article/details/138500534

## Building the Go library for Android Use

From the `go` directory, run `gomobile bind -target=android -androidapi 21 -o ../android/libs/wisdom.aar wisdom`

## Running on Android
Assuming Android Studio/SDK Meerkat is installed and configured and available at `$ANDROID_HOME`, with 
Java 21 installed and available at `$JAVA_HOME`, as well as the Android NDK and CMAKE with the NDK available at `$ANDROID_NDK_ROOT`, run:

`capacitor build` to build the app, then
`capacitor run android` to run the app

## Running on iOS
Not yet implemented

## Usage

Pressing the "Go!" button in the user interface will call the 
Go function `goTest()` in the `main.go` file in the `go-vue-mobile-test/go` directory
via the TS/Vue frontend and display the Go function's output. 
