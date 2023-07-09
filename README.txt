This project is intended to model a civilization for a video game I am designing. The final form of the project
will be written in C# on Unity. As this is a draft intended to help me organize my thoughts, the code is a working 
progress and not all sections will be implemented or in the final product.

    - Jack D'Angelo


Planned changes:
- make Animal class and Character class, as well as few others, derivative of "Entity" class
- better defined ownership and inheritance system for structures (will differ on government type)
- implement various civilization design trees (technology, culture, government, religion)
- dynamic economies unique to each government type
- will implement a more efficient design where the "generator" classes will be singleton classes that return clones
  of the objects which they are generating. This way there don't have to be multiple existing generator objects per 
  category