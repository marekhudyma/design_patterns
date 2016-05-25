<br />Rules:
<br />1) Open-Close open for extension, close for modification
<br />-> easy to add new functionality (without changing existing code) -> backwards compatibility, -> tested code is tested -> you can share code.
<br />
<br />2) Dependency Inversion – elements of application know about themselves only a little, use interfaces and factories to inject
<br />Idea: decouple
<br />Components know about each other
<br />- each element should know about each other as less as possible
<br />- module higher shouldn’t depend on implementation of lower modules
<br />- Easy solution: use interfaces, factories
<br />
<br />3) Interface Segregation – split interfaces to smaller, class doesn’t have to implement empty methods
<br />
<br />4) Single Responsibility – one interface, one way of growing
<br />
<br />5) Liskov’s Substitution – generally Class that extens can be put in place of base class and everything should work correctly.
<br />
<br />
<br />

<b>behavioral</b>
<ul>
<li>chainOfResponsibility</li>  
<li>command</li>  
<li>composite</li>
<li>iterator</li>  
<li>mediator</li>  
<li>memento</li>
<li>observer</li>  
<li>state</li>  
<li>strategy</li>  
<li>templateMethod</li>
<li>visitor</li>
</ul>

<b>structural</b>    
<ul>
<li>adapter</li>
<li>bridge</li>
<li>decorator</li>
<li>facade</li>  
<li>flyweight</li>
<li>proxy</li>  
<li>templateMethod</li>
</ul>

<b>creational</b>    
<ul>    
<li>builder</li>
<li>classicBuilder</li>
<li>factory</li>  
<li>prototype</li>
<li>singleton</li>
</ul>
<br /> mvc
