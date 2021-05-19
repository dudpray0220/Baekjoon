#!/usr/bin/env python
# coding: utf-8

# In[16]:


# 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
# 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
A = int(input())
B = input()

myList = []
for i in B:
    myList.append(i)
# print(myList)

C = A*int(myList[2])
D = A*(int( myList[1] ))
E = A*(int( myList[0] ))

print(C)
print(D)
print(E)
print(C+(D*10)+(E*100))


# In[ ]:




