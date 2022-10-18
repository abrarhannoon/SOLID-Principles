# SOLID-Principles

---------------------------------
-Single Responsibility Principle

Before applying SRP, the class Invoice has three responsibilities to do:Add,Delete,and send email .They are separated in classes with implement interfaces to achieve the reuse and call them in Invoice class .except  send email because it's extra responsibility. MailMessage class also achieved the SRP before it didn't. in the constructor they have to validate and store the values so separated the Validate function  and I add send email to this  class because it consider responsibility to this class.
![image](https://user-images.githubusercontent.com/92648528/196514431-62dfc9c1-d1ad-4431-9bcf-e4a71f65b437.png)
