# Bottom Navigation Implementation With Navigation Component
Navigation Component is pretty useful as it maintains its own stack and easy to manage as compared to Fragments, where we had
to manage the stack using addToBackstack or replaceWithBackstack using Fragment Manager.

Why do we find Navigation Components useful ?

1.It is more that Activities are inherently limited in unfixable ways.
2.Trying to use property animations? Not with activities. 
3.Trying to pop multiple activities off the stack as an atomic operation? Nope. 
4.Want a consistent default animation? Not with manufacturer customizations

