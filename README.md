# Firework-android
Simple and easy-to-use Android library for creating fireworks
## Download
### Step 1. Add the JitPack repository 
Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```
or in settings.gradle file:

```gradle
dependencyResolutionManagement {
	repositories {
		maven { url 'https://jitpack.io' }
    	}
}
```

### Step 2. Add the dependency
```gradle
dependencies {
	implementation 'com.github.slavce14:firework-android:1.0'
}
```
[![](https://jitpack.io/v/SlaVcE14/Firework-android.svg)](https://jitpack.io/#SlaVcE14/Firework-android)

## [Example code](https://github.com/SlaVcE14/Firework-android/tree/main/app/src/main)

## Create a firework
```java
Firework firework = new Firework(x,y,color1,color2).create();
```
### Available constructors
```java
Firework(x, y);

Firework(x, y, color);
  
Firework(x, y, color1, color2);
 
```
### Set color
```java
firework.setColor1(color);

firework.setColor2(color);

firework.setColor(color1, color2);
```
### Set number of lines
```java
firework.setLineNum(lineNum);
```
### Example
```java
Firework firework = new Firework(x,y)
	.setColor(0xFFC18B30,0xFFFFDA94)
	.setLineNum(30)
	.create();
```
## Update firework

```java
firework.update(canvas,paint);
```

### Check if the firework is finished
```java
boolean isFinished = firework.isFinished();
```

## License
```
MIT License

Copyright (c) 2023 SlaVcE

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
