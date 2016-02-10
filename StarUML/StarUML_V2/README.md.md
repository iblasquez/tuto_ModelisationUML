# Prise en main de StarUML 2 (1ère partie)
<!-- => retour à la ligne, 2 espaces .... -->

 
*[UML](https://fr.wikipedia.org/wiki/UML_%28informatique%29) (Unified Modeling Language ou langage de modélisation unifié) est un langage de modélisation graphique à base de pictogrammes conçu pour fournir une méthode normalisée pour visualiser la conception d'un système. Il est couramment utilisé en développement logiciel et en conception orientée objet.* (Extrait : [https://fr.wikipedia.org/wiki/UML_%28informatique%29](https://fr.wikipedia.org/wiki/UML_%28informatique%29))  

Le site [uml.org](http://www.uml.org/) propose de nombreuses resources autour d'UML dont 
les spécifications officielles qui sont disponibles à partir de [http://www.omg.org/spec/UML/](http://www.omg.org/spec/UML/)

De nombreux outils destinés à la modélisation graphique du langage UML existent. Une comparaison de ces différents logiciels UML est disponible sur Wikipédia [https://fr.wikipedia.org/wiki/Comparaison_des_logiciels_d'UML](https://fr.wikipedia.org/wiki/Comparaison_des_logiciels_d'UML)


Nous nous intéressons dans ce tutoriel à Start UML ([staruml.io](http://staruml.io/)), un projet open source qui, à son origine, était destiné à se substituer à des solutions commerciales comme [IBM Rational Rose ](https://fr.wikipedia.org/wiki/Rational_Rose)

[StarUML](http://staruml.io/) supporte la plupart des diagrammes spécifiés par UML 2.0.
Il permet également de générer des "squelettes" de code dans un langage objet (Java, C++, C#). Et depuis la version 2, StarUML est multi-plateforme.


Ce tutoriel va vous guider dans l'utilisation de [StarUML 2](http://staruml.io/)selon une démarche pseudo-RUP basé sur une approche "vue 4+1". L'application à modéliser sera celle de l'étude de case *bookinons*, inspirée du livre de Pascal Roques [UML 2 : Modéliser une application web](http://www.eyrolles.com/Informatique/Livre/uml-2-9782212123890).


Dans ce tutoriel, nous vous proposons d'aborder les points suivants :

## Sommaire
* [Installer de Star UML](#Installation)
* [Créer un Projet : différents templates](#differentsTemplates)
* [Créer nouveau projet *4+1 View Model*](#NouveauProjet) 
* [A propos de la documentation](#documentation)   
* [Axe Fonctionnel : Vue Scénarios et diagrammes de Use Case](#ScenariosUC)


## Installation de Star UML <a id="Installation"></a> 

Rendez-vous sur le site [http://staruml.io/](http://staruml.io/) dans la rubrique [Download ](http://staruml.io/download)
Téléchargez et exécuter le fichier correspondant à votre plate-forme afin d'installer starUML 2.

*Remarque:* Pour information, la version initiale de StarUML est toujours accessible via la rubrique [V1](http://staruml.sourceforge.net/v1/) du site [staruml.io](http://staruml.io/). Cette version, uniquement destinée à Windows, n'est plus maintenue et est remplacée par la version 2 multi-plateforme.

## Créer un Projet : différents templates <a id="differentsTemplates"></a>
Ouvrez StarUML via l'icône 
<img src="/images/staruml_logo_small.png" alt="Icone Star UML" width="80">
<!--[Icone Star UML](/images/staruml_logo_small.png)-->

**Par défaut**, l'espace de travail est le suivant.
![Espace de travail Star UML par défaut](/images/StarUML_ParDefaut.png)

Par défaut, StarUML propose un espace de travail blanc avec un fichier de type *Model* appelé *Main* (informations disponible dans la rubrique appelée **Working Diagrams** en haut à gauche de l'espace de travail.
Un *Model* correspond à un diagramme de classes. D'ailleurs, la rubrique **Toolbox** (en gauche, en dessous de **Working Diagrams**) propose l'ensemble des *outils* graphiques qui peuvent être déposés sur le fenêtre de travail blanche au centre de l'interface afin de créer le diagramme de classes voulu (nous ferons cette manipulation un peu plus tard dans le tutoriel).

A droite de l'espace de travail se trouve une rubrique **Model Explorer** qui n'est autre qu'un explorateur qui permettra de créer une arborescence sur le modèle pour sauvegarder de manière organisée les différents diagrammes. En la rubrique **Editors** permettra de mettre en forme les différents diagrammes.

**A partir du menu (`File -> New From Template`)**, Star UML propose **plusieurs approches de modélisation prédéfinies** : 

* **UMLMinimal** : un simple modèle avec un UML Standard Profile.
* **UMLConventional** : 5 modèles (Use Case Model, Analysis Model, Design Model, Implementation Model et Deployment Model ) avec un UML Standard Profile.
* **4+1 View Model**  : Le modèle de Kruchten dit [modèle des 4 + 1 vues](https://fr.wikipedia.org/wiki/Architecture_logicielle#Le_mod.C3.A8le_des_4_.2B_1_vues), adopté dans l'[Unified Process](https://fr.wikipedia.org/wiki/Unified_process)
* **Rational** : une approche de l'outil Rational Rose.

Le **Model Explorer** permet de visualiser l'organisation de chaque approche. 
Nous nous intéressons par la suite uniquement à L’approche *UML conventional* et à l'approche *4+1 View Model*.

**L’approche *UML conventional*** propose 5 vues organisées autour :  
- diagrammes des cas d'utilisation (**Use Case Model**)  
- diagrammes de séquences(**Analysis Model**)  
- diagrammes de classes(**Design Model**)   
- diagrammes d'implémentation (ou de composants)(**Implementation Model**)    
- diagrammes de déploiement (**Deployment Model**)  
Une vue supplémentaire est disponible depuis la version 2 de Star UML c'est la vue 
**UMLStandardProfile**

Cette approche pourrait être suffisante pour initialiser un projet, mais nous préférerons utiliser une approche par vue 4+1.


**L’approche *4+1 View Model*** propose 5 vues :  
-	**Scenarios** : cette vue, appelée aussi vue des cas d'utilisation, guide toutes les autres vues car elle décrit les besoins attendus par chaque acteur du système. On dit souvent que
la vue scénario constitue  la "colle" qui unifie les 4 autres vues  
-	**Logical View** : cette vue décrit le comportement du système vu de l'intérieur. De haut niveau, cette vue se concentre sur l'abstraction et l'encapsulation : elle modélise les éléments et les mécanismes principaux du système.  
-	**Developpment View** : cette vue décrit l'organisation logicielle du projet. De bas niveau (aussi appelée vue de réalisation), cette vue identifie les modules qui réalisent (physiquement) les classes de la vue logique, elle montre également l'organisation entre les composants et leurs dépendances.   
-	**Physical View** : cette vue l'organisation matérielle du projet.Elle est très importante dans les environnements distribués.  
-	**Process View** : cette vue est intéressante dans les environnements multitâches car elle montre la décomposition du système en terme de processus.  



## Créer un nouveau projet *4+1 View Model* <a id="NouveauProjet"></a>


Pour la suite de ce tutoriel nous allons choisir l'*approche vues 4+1*.
A partir de (`File -> New From Template`), choisissez **4+1 View Model**.
Le **Model Explorer** en haut à droite de votre espace de travail contient désormais l'arborexence suivante :

![Model explorer de l'approche 4+1](/images/ModelExplorer_4Plus1.png)

 
A partir de (`File -> Save As ...`), sauvegardez votre projet en lui donnant par exemple le nom de ***bookinons***
Dans la version 2 de StarUML, les projets sont sauvegardés avec l'extension `.mdj`


***Remarque sur le choix de cette approche*** : L'*approche vues 4+1* permet de faire le lien entre la conception UML et la méthodologie (démarche) que nous allons adopter pour mener à bien notre projet. Cette démarche permettra de réaliser lors de différentes itérations, un enrichissement de l'étude basée sur UML : l'idée étant de partir des besoins utilisateurs et d'aller vers le code. Chaque étape permettra de mieux comprendre / modéliser le Système d'information.  
Il est intéressant de remarquer que les approches objets basées sur UML ont pour caractéristique et avantage de « proposer » sans « imposer ».   
Nous choisissons une **approche vue 4+1* pour organiser notre démarche et "classer nos diagrammes" mais les différents diagrammes UML pourraient tout aussi bien trouver leur place dans une autre approche.



## A propos de la documentation <a id="documentation"></a>

Une documentation en ligne est accessible à l'adresse suivante depuis l'onglet [Support](http://staruml.io/support) du site [staruml.io](http://staruml.io/) : [http://staruml.io/support](http://staruml.io/support)

Tout au long de ce tutoriel, nous nous référerons à la documentation officielle ([http://docs.staruml.io/en/latest/](http://docs.staruml.io/en/latest/).

Cette documentation est également directement accessible depuis le logiciel de StarUML  à partir de (`Help -> Documentation`)

Pour de plus amples informations n'hésitez pas à la consulter, et plus spécialement les parties [Modeling with UML](http://docs.staruml.io/en/latest/modeling-with-uml/modeling-with-uml.html) et [Editing Elements and Diagrams](http://docs.staruml.io/en/latest/editing-elements-and-diagrams.html).

**Remarque : Model vs Diagram** : Avant de continuer, nous souhaitions revenir sur la notion de *Model* et de *Diagram*. La partie [Model vs Diagram](http://docs.staruml.io/en/latest/basic-concepts.html#model-vs-diagram) de la documentation en ligne propose les définitions suivantes :

> **Model or software model** is a description of any aspect of a software system such as structure, behavior, requirement, and so on. A software model can be represented in textual, mathmatical or visual form. A Model element is a building block of a software model.

>**A Diagram** is a visual geometric symbolic representation of a software model. A software model can be represented in one or more diagrams with different aspects. For example, a diagram can focus on class hierarchical structure while another diagram can focus on interaction between objects. Diagrams consists of view elements, which are visual representations of a model element.


## Axe Fonctionnel : Vue Scénarios et diagrammes de Use Case <a id="ScenariosUC"></a>

Cette partie est détaillé [ici](/StarUML2_Scenarios.md).

### *Tutoriel en cours de réaction ...*
Reportez-vous pour l'instant aux tutoriels disponibles pour la version STARL UML 1.


##Quelques liens utiles :
[http://www.uml.org/](http://www.uml.org/)  
[http://staruml.io/](http://staruml.io/)

[https://fr.wikipedia.org/wiki/UML_%28informatique%29](https://fr.wikipedia.org/wiki/UML_%28informatique%29)  
[https://fr.wikipedia.org/wiki/Comparaison_des_logiciels_d'UML](https://fr.wikipedia.org/wiki/Comparaison_des_logiciels_d'UML)

