# МДК.01.03 Разработка мобильных приложений
### Coroutines | 10 задач

> Решить задачи, представленные ниже. Для каждого запуска выводить информацию о времени, затраченном на выполнение программы

------------

### Задача 4
В исходном массиве nums, для каждого nums[i] найдите, сколько чисел в массиве меньше его. То есть, для каждого nums[i] нужно посчитать количество допустимых индексов j таких, что  j != i и nums[j] < nums[i]. Верните ответ в виде массива.

**Example 1:**

    Input: nums = [8,1,2,2,3]
    Output: [4,0,1,1,3]
    Explanation: 
    For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
    For nums[1]=1 does not exist any smaller number than it.
    For nums[2]=2 there exist one smaller number than it (1). 
    For nums[3]=2 there exist one smaller number than it (1). 
    For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

**Example 2:**

    Input: nums = [6,5,4,8]
    Output: [2,1,0,3]
    Example 3:
    
    Input: nums = [7,7,7,7]
    Output: [0,0,0,0]
    Constraints:
    
    2 <= nums.length <= 500
    0 <= nums[i] <= 100
