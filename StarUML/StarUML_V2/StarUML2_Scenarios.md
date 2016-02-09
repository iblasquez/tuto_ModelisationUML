# Prise en main StarUML V2 : Vue Scénarios et diagrammes de Use Case <a id="ScenariosUC"></a>

**La vue Scenarios** est la vue de référence (***la vue dite +1***): elle va permettre de partager les informations collectées entre les **4 autres vues** (Logical, Development, Process et Physical)  

**La vue Scenarios est destinée à contenir le(s) diagramme(s) de Use Case.**  
Rappelons, en effet, qu'une des premières étapes de la modélisation consiste en la découverte des use case à partir du cahier des charges.  La vue Scenarios sera donc une vue "*plus abstraite*" que technique.


Par défaut, un diagramme de Use Case est déjà disponible dans la vue scénario lorsqu'une approche par vue 4+1 a été sélectionnée.
Pour l'afficher en tant que fenêtre de travail active, il suffit de double-cliquer sur **Scenarios** dans le **Model Explorer** (à droite de votre écran.  
La vue scénario s'ouvre alors et un objet `Scénarios` précédé d'une icône verte représentant un *stickman encadré* est disponible dans cette vue : ![Scenarios](/images/Scenarios.png)

Double-cliquer dessus afin d'ouvrir une nouvelle fenêtre de travail, au centre de votre espace de travail, qui devient alors la fenêtre active.  
Vous remarquerez dans le même temps, la partie **Working Diagram** en haut à gauche a été mise à jour et dispose désormais de ce nouveau diagramme `Scénarios`.

Deux diagrammes sont donc désormais accessible depuis la partie **Working Diagram**:
- un **Logical View** qui est le diagramme disponible par défaut à la création du projet  
- et un **Scenarios** qui est le diagramme que nous venons de sélectionner.

Le diagramme actif de notre espace de travail (celui sur lequel on va travailler) est celui qui est surligné dans le **Working Diagramm**.  
Un petit coup d'oeil sur la partie **Toolbox** (juste en dessous de **Working Diagramm**) peut également nous indiquer quel type de diagramme est actif.  
Si c'est un diagramme de type **Scenarios**, les outils disponibles dans la Toolbox seront  relatifs aux **Use Case**.  
Si c'est un diagramme de type **Logical View**, les outils disponibles dans la Toolbox seront plutôt relatifs aux **Classes** et aux **Packages**.


Dans ce tutoriel, nous allons nous intéresser aux différents points suivants :

* [Renommer un modèle](#name)
* [Acteur](#acteur_UC)
* [...](#....)
* [...](#....)
* [...](#....)
* [...](#....)
* [...](#....)
* [...](#....)
* [...](#....)
* [...](#....)
* [...](#....)
* [...](#....)
* [...](#....)
* [...](#....)
* [...](#....)
* 

Pour en savoir plus, la documentation en ligne relative aux diagrammes de Use Case est disponible dans [Working with Use Case Diagram](http://docs.staruml.io/en/latest/modeling-with-uml/working-with-use-case-diagram.html)

## Renommer un modèle <a id="name"></a>

Depuis le **Model Explorer**, double cliquez sur le scénario à renommer :  ![Scenarios](/images/Scenarios.png) 

Dans la partie **Editor** (juste en dessous du **Model Explorer**, il suffit de renseigner le champs `name` de **Properties** pour attribuer un nouveau nom au modèle.
Nous appelerons par exemple, ce modèle **`Bookinons`**.

Pour vérifier que ce nouveau nom est bien été pris en compte, il suffit de consulter le **Working Diagram** et le **Model Explorer** qui prennent immédiatement en compte le changement de nom.

***N'oubliez pas de sauvegarder régulièrement votre projet au cours de ce tutoriel (`File -> Save`) (ou plus rapidement `Ctrl+S`)***

## Acteur <a id="acteur_UC"></a>

*Avant de continuer, assurez-vous bien que votre modèle actif est le **Scenario** `Bookinons` en double-cliquant dessus dans le **Model Explorer** ou dans le **Working Diagram***

Pour ajouter objet sur un diagramme, nous allons utiliser la **Toolbox** (à droite, en dessous du ** Working Diagram**).

### Création d'un acteur
Pour ajouter un nouvel **acteur** sur votre **diagramme de Use Case**, commencez par sélectionne, à l'aide d'un clic gauche, **Actor** dans la **Toolbox**.  
Rendez-vous ensuite sur votre fenêtre active (diagramme à créer). Un **clic gauche**  permet de faire apparaître un **acteur** sur ce diagramme sous sa forme **stick man** :  
![Acteur](/images/Acteur.png) 


Un nom par défaut est attribué à cet acteur. Vous pouvez renommer l'acteur dès sa création.
Par exemple, en ce qui nous concerne, nous souhaitons créer par un acteur dont le rôle est *Internaute*. Remplacez donc `Actor1` par **`Internaute`** puis appuyer sur entrée ou bien cliquer ailleurs dans la fenêtre de travail pour valider.

Consultez ensuite le **Model Explorer** pour constater que l'acteur **Internaute** a bien été ajouté au diagramme, puisqu'il apparaît désormais comme objet de `Bookinons` dans la vue **Scénarios** et qu'il est précédé d'une icône de représentant un *stickman*.  


A tout moment, vous pouvez renommer cet acteur via la fenêtre **Editors** (en bas à droite, en dessous du **Model Explorer**). Cette fenêtre permet de formatter les éléments d'un diagramme.  
Lorsqu'on clique sur l'acteur **Internaute** nouvellement créer, on remarque que l'**Editors** propose 3 rubriques :
* Styles
* Properties
* Documentation

Le nom de l'acteur est contenu dans le champ `name` de **Properties**.
Il est donc également possible de changer le nom de l'acteur en utilisant l'éditor.

Nous explorerons les différentes propriétés possibles au fur et à mesure de notre avancement du tutoriel.  
Pour en savoir plus sur le style, vous pouvez consulter la partie [Editing Elements and Diagrams](http://docs.staruml.io/en/latest/editing-elements-and-diagrams.html)
de la documentation en ligne.

***Remarque:*** En double cliquant sur l'acteur **Internaute**, vous retrouvez tous les boutons de la configuration initiale et vous vous pourrez ainsi paramétrer également l'acteur directement depuis le diagramme, comme nous le montrerons par la suite.


### Choix du stéréotype d'un acteur
<!-- ICI -->


### *Tutoriel en cours de réaction ...*
Reportez-vous pour le moment aux tutoriels disponibles pour la version STARL UML 1.









