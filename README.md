<center>
    <h1>App Boot Starter</h1>
</center>

应用起步

## 介绍

使用Spring Boot搭建一个应用，
你需要去处理错误页面，
虽然，Spring Boot为我们提供了默认的方式，
但是，这并不是我们想要的，
多数情况，我们都会去自己处理。
基于此，我想把这一部分抽离出来，
只为下一个应用，
一个引入，就可以解决这些问题。

## 使用

你只需要两步，即可使用：

#### 第一步，添加远程仓库

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

#### 第二步，添加依赖

```xml
<dependency>
    <groupId>{预留}</groupId>
    <artifactId>app-boot-starter</artifactId>
    <version>{NewVersion}</version>
</dependency>
```

