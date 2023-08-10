Component:
-  A component in anguler is a basic building block which contain's a reusable UI programetically.
- A component is a typeScript class which is having a decorator (@)component.
-** Decoretor ** will contain meta DAta aboout the anguler elements which is used
               to diffrentiate the typeScript class's and create anguler elements.
-An anguler applicatioon is a tree of component's.
-Every component in anguler is having three parts:-
    1:Buisness Logic.(in ts file).
    2:Design.(HTML)
    3:CSS.(in styles)

 According to that we can build components in two ways:-
    1:InLine component:If we have all the Buisness logic design and styles in one page than it is inline componets.
                       If it an inline component in @component then we use SLECTOR,TEMPLETE and STYLE.

    2:CodeBehind:If in the component devlopment if we cretae  saprate file for SLECTOR,TEMPLETE and STYLE. 
                 


NVVM:- It is nothing but model view and view model.
       It is a software design pattern where it is not required to thatcreate models in components.

       MODELS are configure in momory of templates whenevre it is updated there is no need to do  
       In order to access the data we use value and we have many properties configured.

FAKE ALI:- Connecting with fake store API, as a anguler devloper we will always connect with real world api 
           in order to fetch the day and display within application.we
           In general we have two types of protocoles to sahre the data:-          
           1:SOAP- SIMPLE OBJECT ACCES PROTOCOL :- It returns the data in XML fromate as request and response.
           2:REST:-REPREANTAIONAL TRANSFER PROTOCOL:-It returns the data in JSON fromate as request and response.
           and to connect its end points we use fetch method.


*****************************************DIRECTIVE'S****************************************************
      
      DIRECTIVES are used to perform DOM (document object model) menupulation.

      What is DOM?
      :Dom stands for document object model.
       -web pages content will be represented as a tree.
       -The HTML DOM is an API.
       -eg: add,edit,change value on runtime using directives.

       BUILD IN DIRECTIVES:-
        1:STYLE:-It is used to st css property values dynamically at reuntime.
                -when component value change then css property value will be change autometicaly.
                syntax (style.color="").value

        2:ng class=> It is used to css class name at run-time.
        
                  whne the value of component proprty then the css class will change autometically.        
                  used this directive to set a styles with multiple property conditionaly.

        3:ng if:The ng if display the elements if condition is true otherwise it will remove the elemen form DOM.

        4:





