# Lab 1.Flutter

—— Introduce the Flutter

- 刘茵
- 1813075

[TOC]

### 简介

Flutter是谷歌的移动UI框架，可以快速在iOS和Android上构建高质量的原生用户界面。

Flutter可以与现有的代码一起工作、Flutter正在被越来越多的开发者和组织使用。

Flutter是完全免费、开源的。

[快速开始](https://flutterchina.club/get-started/install/)

### 特点

#### 1 快速开发

Flutter的热重载可帮助用户快速地进行测试、构建UI、添加功能并更快地修复错误。在iOS和Android模拟器或真机上可以在亚秒内重载，并且不会丢失状态

#### 2 富有表现力和灵活的UI

快速发布聚焦于原生体验的功能。分层的架构允许用户完全自定义，从而实现难以置信的快速渲染和富有表现力、灵活的设计。

<img src="D:\大三下\智能移动开发\IMD\assignment\lab1\screenshot-1.png" style="zoom:50%;" />         <img src="https://flutterchina.club/images/homepage/screenshot-2.png" style="zoom:50%;" />         <img src="https://flutterchina.club/images/homepage/ios-friendlychat.png" style="zoom:50%;" />

#### 3 原生性能

Flutter包含了许多核心的widget，如滚动、导航、图标和字体等，这些都可以在iOS和Android上达到原生应用一样的性能。

#### 4 现代的，响应式框架

使用Flutter的现代、响应式框架，和一系列基础widget，轻松构建用户界面。使用功能强大且灵活的API（针对2D、动画、手势、效果等）解决艰难的UI挑战。

访问平台功能非常简单。以下是[interop example（互操作示例）](https://github.com/flutter/flutter/tree/master/examples/platform_channel)中的一个片段：

```dart
Future<Null> getBatteryLevel() async {
  var batteryLevel = 'unknown';
  try {
    int result = await methodChannel.invokeMethod('getBatteryLevel');
    batteryLevel = 'Battery level: $result%';
  } on PlatformException {
    batteryLevel = 'Failed to get battery level.';
  }
  setState(() {
    _batteryLevel = batteryLevel;
  });
}
```

#### 5 统一的应用开发体验

Flutter拥有丰富的工具和库，可以帮助用户轻松地同时在iOS和Android系统中实现用户的想法和创意。 如果用户没有任何移动端开发体验，Flutter是一种轻松快捷的方式来构建漂亮的移动应用程序。

如果用户是一位经验丰富的iOS或Android开发人员，则可以使用Flutter作为视图(View)层， 并可以使用已经用Java / ObjC / Swift完成的部分（Flutter支持混合开发）。

- 构建

  | 漂亮的用户界面                  | 流畅的编码体验             | 全功能的应用程序           |
  | ------------------------------- | -------------------------- | -------------------------- |
  | 丰富的2D GPU加速API             | 亚秒级，有状态的热重载     | 与移动操作系统API和SDK交互 |
  | Material组件和Cupertino widgets | IntelliJ: 代码重构、补全等 | Maven/Java                 |
  | 响应式框架                      | Dart语言和核心库           | Cocoapods/ObjC/Swift       |
  | 动画/运动API                    | 包管理器                   |                            |

- 优化

  | 测试       | 调试                 | 性能分析           |
  | ---------- | -------------------- | ------------------ |
  | 单元测试   | IDE 调试器           | 时间线（Timeline） |
  | 集成测试   | 基于Web的调试器      | CPU和内存          |
  | 设备上测试 | async/await aware    | 应用内性能图标     |
  |            | Expression evaluator |                    |

  

### 进一步了解学习

- ["flutter中文网"]( https://flutterchina.club/get-started/)	



