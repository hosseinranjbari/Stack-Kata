# Stack (Pile) Kata :
En informatique, une pile (en anglais stack) est une structure de données fondée sur le principe
« dernier arrivé, premier sorti » (en anglais LIFO pour last in, first out), ce qui veut dire, qu&#39;en
général, le dernier élément, ajouté à la pile, sera le premier à en sortir.

**`Primitives`**

Voici les primitives communément utilisées pour manipuler des piles. Il n'existe pas de normalisation pour les primitives de manipulation de pile. Leurs noms sont donc indiqués de manière informelle. Seules les trois premières sont réellement indispensables, les autres pouvant s'en déduire.
 - « Empiler » : ajoute un élément sur la pile. Le terme anglais correspondant est push.
 - « Dépiler » : enlève un élément de la pile et le renvoie. Le terme anglais correspondant est pop.
 - « La pile est-elle vide ? » : renvoie vrai si la pile est vide, faux sinon.
 - « Nombre d'éléments de la pile » : renvoie le nombre d'éléments dans la pile. Selon les implémentations, peut être fait soit en temps constant soit en temps linéaire.
 - « Quel est l'élément de tête ? » : renvoie l'élément de tête sans le dépiler. Le terme anglais correspondant est peek ou top.
 - « Vider la liste » : dépiler tous les éléments. Selon l'implémentation, cela peut être fait en temps constant ou linéaire. Le terme anglais correspondant est clear.
 - « Dupliquer l'élément de tête » et « échanger les deux premiers éléments » : existe sur les calculatrices fonctionnant en notation polonaise inverse. Les termes anglais correspondants sont dup et swap respectivement.

Here are the tests that Uncle Bob lays out in his screencast.
Can create Stack object.
 - Newly created stacks should be empty.
 - After one push, stack size should be one.
 - After one push and one pop, should be empty.
 - When pushed passed limit, stack overflows.
 - When popped passed limit, stack underflows.
 - When two values are pushed then one is popped, size is one.
 - When one is pushed one is popped.
 - When one and two are pushed two and one are popped.
 - When creating stack with negative size, should through IllegalCapacity.
 - When creating stack with zero capacity, any push should overflow.
 - When one is pushed, one is on top.
 - When stack is empty, top throws empty.
 - With zero capacity stack, top throws empty.
 - Given stack with one two pushed, find one and two.
 - Given a stack with no two, find two returns null.
