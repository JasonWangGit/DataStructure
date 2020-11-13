# 数据结构与算法

- 数组
  - 无序数组
    - 插入快
    - 查找、删除慢
  - 有序数组
    - 查找快
    - 插入、删除慢
  - 1aa

### 01.数据结构和算法的概述

#### 逻辑结构

- 有集合
- 线性结构
- 树型结构
- 图型结构

#### 存储结构

- 顺序存储结构（数组）
- 链式存储结构（链表）
- 索引存储结构
  - 直接存储地址
- 散列存储结构
  - 计算获得地址

#### 时间复杂度和空间复杂度

- 时间复杂度：是用程序执行的次数来衡量，不是程序执行的时间
- 空间复杂度：用程序执行所需要的最大内存
- 程序的设计中要不就是时间换空间，要不就是用空间去换时间

### 02.无序数组

- 插入
  - 数组尾部，O(1)
  - 注意数组长度+1
- 查找
  - 遍历，O(n)
- 删除
  - 遍历，O(n)
  - 从前开始，当前位置元素等于后一个位置元素
  - 注意数组长度-1

### 03.有序数组和二分查找

- 插入
  - 遍历，O(n)
  - 从后开始，当前位置元素等于前一个位置元素
  - 注意数组长度+1
- 查找
  - 二分，O(logn)：
    - 指针：lower、upper
    - 循环体内（while循环lower小于upper）
      - 当前位置=（lower+upper）/2
      - 如果当前位置元素等于目标值：找到
      - 如果当前位置元素大于目标值：upper=当前位置-1
      - 如果当前位置元素小于目标值：lower=当前位置+1
- 删除
  - 遍历，O(n)
  - 从前开始，当前位置元素等于后一个位置元素
  - 注意数组长度-1

### 04.数组排序和稀疏数组

#### 冒泡排序

- 指针：inner、outer

- 循环体内（outer从数组尾部开始，outer大于**1**）
  - 循环体内（for循环，inner从0开始，inner小于outer）
    - 如果inner位置元素大于后一个位置元素：交换
  - inner重置为0

#### 选择排序

- 指针：inner、outer、min
- 循环体内（outer从0开始，outer小于**数组长度-1**）
  - min初始指向outer
  - 循环体内（for循环，inner从outer+1开始，inner小于数组长度）
    - 如果inner位置元素小于min位置元素：min指向当前位置
  - min位置元素与outer位置元素交换

#### 插入排序

- 指针：inner、outer
- temp
- 循环体内（outer从**1**开始，outer小于数组长度）
  - inner初始指向outer
  - outer位置元素放在temp
  - 循环体内（while循环，inner大于0，inner前一个位置元素大于temp）
    - inner位置元素与前一个位置元素交换
    - inner--
  - temp插入inner位置

### 05.纯手写ArrayList集合源码

#### ArrayList源码

- 默认长度

```java
private static final int DEFAULT_CAPACITY = 10;
```

- 扩容50%（填充null）

```java
int newCapacity = oldCapacity + (oldCapacity >> 1);
elementData = Arrays.copyOf(elementData, newCapacity);
```

#### 手写ArrayList

- System.arrayCopy( arr1, 2, arr2, 5, 10); 
  - 意思是：将arr1数组里从索引为2的元素开始, 复制到数组arr2里的索引为5的位置, 复制的元素个数为10个
  - 删除可以采用此方法将后面元素前移

### 06.栈

- 指针：top（初始-1）
- 压入push（插入）
  - `if(!isFull()) elementData[++top] = data`
  - 数组尾部，O(1)
- peek（查找）
  - `if(!isEmpty()) return elementData[top];`
  - 数组尾部，O(1)
- 弹出pop（删除）
  - `if(!isEmpty()) elementData[top--] = null;`
  - 数组尾部，O(1)
- 空栈isEmpty
  - `return size == 0;`
- 满栈isFull
  - `return size == maxSize;`

#### 抛出异常

```java
throw new EmptyStackException();
```

### 07.队列

- 单向队列
- 双向队列
- 优先级队列

#### 单向队列

- 指针：rear（初始-1）、front（初始0）
- 入队add（插入）
  - `if(rear == maxSize - 1) rear = -1;`
  - `if(!isFull()) elementData[++rear] = data`
  - 尾部，O(1)
- peek（查找）
  - `if(!isEmpty()) return elementData[front];`
  - 头部，O(1)
- 出队remove（删除）
  - `if(!isEmpty()) elementData[front++] = null;`
  - `if(front == maxSize) front = 0;`
  - 头部，O(1)
- 空队isEmpty
  - `return size == 0;`
- 满队isFull
  - `return size == maxSize;`

#### 双端队列

- 取模（基于数组长度是2的整数次幂）
  - `head = (head - 1) & (maxSize - 1)`;

- 指针：head（初始0）、tail（初始0）

- 头部入队addFirst（插入）
  - `if(!isFull()) elementData[head = (head - 1) & (maxSize - 1)] = data;`
  - 头部，O(1)
- 尾部入队addLast（插入）
  - `if(!isFull()) elementData[tail= (tail + 1) & (maxSize - 1)] = data;`
  - 尾部，O(1)
- 头部peekFirst（查找）
  - `if(!isEmpty()) return elementData[head];`
  - 头部，O(1)
- 尾部peekLast（查找）
  - `if(!isEmpty()) return elementData[tail];`
  - 尾部，O(1)
- 头部出队removeFirst（删除）
  - `if(!isEmpty()) elementData[head = (head + 1) & (maxSize - 1)] = null;`
  - 头部，O(1)
- 尾部出队removeLast（删除）
  - `if(!isEmpty()) elementData[tail= (tail - 1) & (maxSize - 1)] = null;`
  - 尾部，O(1)
- 空队isEmpty
  - `return size == 0;`
- 满队isFull
  - `return size == maxSize;`