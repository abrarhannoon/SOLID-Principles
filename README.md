# SOLID-Principles

---------------------------------
-Single Responsibility Principle

Before applying SRP, the class Invoice has three responsibilities to do:Add,Delete,and send email .They are separated in classes with implement interfaces to achieve the reuse and call them in Invoice class .except  send email because it's extra responsibility. MailMessage class also achieved the SRP before it didn't. in the constructor they have to validate and store the values so separated the Validate function  and I add send email to this  class because it consider responsibility to this class.
![image](https://user-images.githubusercontent.com/92648528/196514431-62dfc9c1-d1ad-4431-9bcf-e4a71f65b437.png)

- Open-Closed Principle:

Calculator class is open for extension close for modification, operation calculate function encapsulate for each operation and implement from Interface ,when adding a new operation in the future it is just needed to extend from the class without need to modify the calculate and operation creation functions.   
![image](https://user-images.githubusercontent.com/92648528/196538438-93e9cbb6-ecbb-4bec-873f-88b403e3df8e.png)
-Liskov Substitution Principle :

 the objects of customer class not behaving the same way as the objects of customer in add offer function,so the solution was made more general class they are inheret from it. so that way the general class customer offerable to behave as child classes.
![image](https://user-images.githubusercontent.com/92648528/196537133-a28de284-adfa-41f0-95b3-d30f0382c077.png) 
 -Interface Segregation Principle:
 
the eagle and Penguin class Breaks This principle  and another like LSP,RSP when implement behaviours which don't need it,so with benefit of the reuse in the inheritance, the behaviours separated in interfaces and the common behaviour "Molt" and attributes collected in parent class bird. 
![image](https://user-images.githubusercontent.com/92648528/196530362-20f0a4c0-b86a-4855-8765-3298c7461f83.png)

-Dependency Inversion Principle

High level class Windows machine depend on low level classes Keyboard and Monitor result to break this principle, so  both of them  become depend on Interface as s solution contain the Simler behavior of Keyboard and Monitor.  
![image](https://user-images.githubusercontent.com/92648528/196536266-a66c12c0-f30e-4a39-b3a1-a753973e7197.png)
