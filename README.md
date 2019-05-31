
[![](https://jitpack.io/v/iutil/app-boot-starter.svg)](https://jitpack.io/#iutil/app-boot-starter)


<h1 align="center">
    App Boot Starter
</h1>

<p align="center">
	<strong>应用起步，一句代码快速拥有错误页面</strong>
</p>

<p align="center">
	<a target="_blank" href="https://www.apache.org/licenses/LICENSE-2.0.html">
		<img src="https://img.shields.io/:license-apache-blue.svg" ></img>
	</a>
	<a target="_blank" href="https://www.oracle.com/technetwork/java/javase/downloads/index.html">
		<img src="https://img.shields.io/badge/JDK-1.8+-green.svg" ></img>
	</a>
	<a target="_blank" href="https://travis-ci.org/looly/hutool">
		<img src="https://travis-ci.org/looly/hutool.svg?branch=v4-master" ></img>
	</a>
	<a target="_blank" href='https://github.com/iutil/app-boot-starter'>
		<img src="https://img.shields.io/github/stars/iutil/app-boot-starter.svg?style=social" alt="github star"></img>
	</a>
</p>

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

