# Firework-android

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