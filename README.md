# AngelApplications
> 该工程主要集成各种Android工具类，并规范其调用方式，方便开发使用，以下是工程结构和一些简单的使用，方便查找使用

## Gradle相关

## 工具类
1.[Glide](https://github.com/bumptech/glide) 处理图形工具
  *工程使用版本4.5.0*

2.[Butterknife](https://github.com/JakeWharton/butterknife) 绑定控件
  *工程使用版本8.8.1*

3.[permissions4m](https://github.com/jokermonn/permissions4m) 权限申请

4.[ActivityTracker](https://github.com/fashare2015/ActivityTracker) 页面查看工具

5.[dialogFragment](https://github.com/Timmy-zzh/TDialog) 对话框工具

6.[RecycleView](https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh) 下拉刷新
## 性能优化方案
1.替换HashMap:

    场景：   SparseArray： key为Int ，二分查找
            ArrapMap :二分查找
            
 2.链表
   * Collection：
   
            我们需要保存若干个对象的时候使用集合。
   * List：
            
            如果我们需要保留存储顺序, 并且保留重复元素, 使用List.
    
            如果查询较多, 那么使用ArrayList
    
            如果存取较多, 那么使用LinkedList
   
            如果需要线程安全, 那么使用Vector
            
   * Set:
            
            如果我们不需要保留存储顺序, 并且需要去掉重复元素, 使用Set.
    
            如果我们需要将元素排序, 那么使用TreeSet
    
            如果我们不需要排序, 使用HashSet, HashSet比TreeSet效率高.
    
            如果我们需要保留存储顺序, 又要过滤重复元素, 那么使用LinkedHashSet
 3.控件
    
   * 使用[Constraintlayout](https://www.jianshu.com/p/a8b49ff64cd3)代替外层布局

