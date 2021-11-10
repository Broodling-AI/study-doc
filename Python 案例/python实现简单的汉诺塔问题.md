![image-20201124101434710](C:\Users\XQY\AppData\Roaming\Typora\typora-user-images\image-20201124101434710.png)

```python
# -*- coding = utf-8 -*-
# @Time : 2020/11/24 9:53
# @Author : XQY
# @Site : 
# @File : Tower of Hanoi.py
# @Software: PyCharm


# 一个简单的条件循环语句实现汉诺塔问题
def my_print(args):
    print(args)


def move(n, a, b, c):
    my_print((a, '-->', c)) if n == 1 else (move(n - 1, a, c, b) or move(1, a, b, c) or move(n - 1, b, a, c))


move(3, 'a', 'b', 'c')
```

