# Prise en main de [ObjectAid UMLExplorer](http://www.objectaid.com)


> [*The ObjectAid UML Explorer is an agile and lightweight code visualization tool for the Eclipse IDE.  
> It shows your Java source code and libraries in live UML class and sequence diagrams that automatically update as your code changes.*](http://www.objectaid.com/)  
 
Extrait du site [objectaid.com](http://www.objectaid.com/)

## Installation d'ObjectAid UML Explorer

Deux installations sont possibles :  
- soit à partir d'Eclipse via le menu `Install New Software...`  
- soit à partir de l'[Eclipse market place](https://marketplace.eclipse.org)


#### Depuis le menu `Install New Software...` sous Eclipse

L'installation de [ObjectAid UMLExplorer](http://www.objectaid.com) depuis le menu (`Help ->Install New Software ...`) est décrite et illustrée à l'adresse suivante : [http://www.objectaid.com/installation](http://www.objectaid.com/installation)

#### Depuis l'Eclipse marketPlace en ligne 

[ObjectAid UMLExplorer](http://www.objectaid.com) est disponible sur le site de l'Eclipse MarketPlace à l'adresse suivante : [http://marketplace.eclipse.org/content/objectaid-uml-explorer](http://marketplace.eclipse.org/content/objectaid-uml-explorer)

Rendez-vous sur cette page, puis faites un *drag an drop* du bouton **Install** vers votre IDE. Une boîte de dialogue `Eclipse MarketPlace` s'ouvre.
Vérifiez que tout est coché et cliquez sur `Confirm`. Acceptez la licence afin de dévérouiller le bouton `Finish`.


Dans les deux cas, vous devez relancer Eclipse pour que [ObjectAid UMLExplorer](http://www.objectaid.com) soit désormais pris en compte dans Eclipse.


## Diagramme de classes à partir d'ObjectAid UML Explorer

Il faut tout d'abord disposer d'un projet.
Récuperez un projet ou utilisez un projet à vous existant.

**Remarque :** Pour récupérer un projet, vous pouvez vous rendre par exemple sur [Github](https://github.com/) et faire une recherche par exemple **`pokemon java`**, il ne vous reste plus qu'à choisir le projet de votre choix ;-).


A partir de (`File -> New -> Other...`) (que l'on peut atteindre directement avec le raccourci clavier `Ctrl+N`), ouvrez **ObjectAid UML Diagram** pour pouvoir sélectionner le wizard `Class Diagram`.

Entrer le nom du fichier que vous souhaitez donner à ce diagramme de classe, par exemple `model`. Un fichier `model.ucls`.

Faites glisser (*drag*) les classes du Package Explorer que vous souhaitez visualiser vers le fichier `model.ucs`

Dorénavant, lorsque le code java est modifié, le diagramme de classes l'est aussi !

*Remarque :* Une image du diagramme de classes peut être sauvegardé à tout moment grâce au menu `Save As Image ...` obtenu par un simple clic droit sur le fichier.

La documentation concernant le diagramme de classe est disponible à l'adresse suivante : [http://www.objectaid.com/class-diagram](http://www.objectaid.com/class-diagram)  
avec un complément dans la section [http://www.objectaid.com/diagram-add-on](http://www.objectaid.com/diagram-add-on)

## Diagramme de séquences à partir d'ObjectAid UML Explorer

Récuperez un projet ou utilisez un projet existant.

A partir de (`File -> New -> Other...`) (que l'on peut atteindre directement avec le raccourci clavier `Ctrl+N`), ouvrez **ObjectAid UML Diagram** pour pouvoir sélectionner le wizard `Sequence Diagram`.

Entrer le nom du fichier que vous souhaitez donner à ce diagramme de classe, par exemple `empty`. Un fichier `model.ucls`.

Dommage sur cette fonctionnalité soit payante...

## Liens utiles
[http://www.objectaid.com](http://www.objectaid.com)  
[https://marketplace.eclipse.org/content/objectaid-uml-explorer](https://marketplace.eclipse.org/content/objectaid-uml-explorer)