# Firework-android
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
### Check if the firework is finished
```java
boolean isFinished = firework.isFinished();
```

## Update firework
```java
firework.update(canvas,paint);

```
