# Weekly Exercise - Making the shelter more flexible

This exercise consists of two separate tasks. Please keep in mind that in Java you
**don't have to free any memory.** Java handles memory management for you.

## Task 1 Expanding the shelter

Up until now, the shelter would simply reject a new dog if it did not have any capacity left.
To be able to rescue all the dogs, adjust the `addDog` method so it will:
- create a new array for Dog references which has twice the size of the previous one
- copy over all existing dogs
- update the shelter's attributes

Don't forget to add the new dog to the list after all of this.

## Task 2 Handing out dogs to new owners

The getDog methods simply returned the reference to the dog matching the criteria. However, it was still
contained within our shelter. Ideally, we want the shelter to remove the dog in question from its list
of dogs before handing it out. To do this, you'll need to:
- find a matching Dog
- move any dogs after the one that matches towards the front by one to close the gap
- update the shelter's attributes

Don't forget to store the reference to the matching dog before overwriting it in the array.
