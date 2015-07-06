# FunctionalTestingDemo
This is a skeleton application to demostrate appium Android Functional Testing.

## Prerequisites

## Install dependencies
- Android SDK
- Install Appium 
- IDE of your choice (Intellij Idea or Eclipse)

## Step by Step installations of dependencies
### Android Setup
- Android SDK (http://developer.android.com/sdk/index.html). Once you download the file and unzip
  Once done, update the system variable to include sdk as well, Below is an example on how I do mine: 
  export ANDROID_HOME=/Users/bonganimthembu/Development/SDK
  export PATH =${PATH}:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools
- Launch the SDK manager to download relevant files to create an emulator and run the virtual device. 
  In terminal, type in android sdk
  
- This would open the SDK manager for you to download the relevant files. In the SDK manager select the below files as shown below. This will help you create a virtual device running Android 4.4.2.
image
- Select the above files and choose to install, once done close the SDK manager. In terminal then type
android avd
- This would open the Android Virtual Device Manager which would help you create the virtual devices. Click on Create on the pop up opened and follow the below snapshot for the values. Select the RAM size as per your machine configuration.
image
- Once you have selected the above options, click on OK. Once done, it will show up in the AVD manager as below.
image
- Select the AVD name and click on Start on the right. This would launch the pop up with few options, you may choose as you want.
image

### Installing Appium

- git clone https://github.com/appium/appium . $$ cd appium 
- ./reset --android --dev
- node . (This will fire up the appium server)


### Pull this existing skeleton
- git clone this repo.
- Open Intellij and open existing application, navigate to test folder and run the test.

## Done, enjoy


