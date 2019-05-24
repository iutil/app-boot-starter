
[![](https://jitpack.io/v/iutil/app-boot-starter.svg)](https://jitpack.io/#iutil/app-boot-starter)


<h1 style="text-align:center;">App Boot Starter</h1>

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
    <groupId>com.github.iutil</groupId>
    <artifactId>app-boot-starter</artifactId>
    <version>1.0.0.BUILD</version>
</dependency>
```

## 自定义错误页面

错误页面命名：

`404.html`

`500.html`

`error.html`

路径：

```
.
└── src
    └── resources
        └── templates
            └── error
                ├── 404.html
                ├── 500.html
                └── error.html
```

