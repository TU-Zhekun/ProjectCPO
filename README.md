# CPO Project
## Projet de 2ème année

> ###### Les livrables que vous devez rendre après la première séance de projet sont :
• le cahier des charges
• un planning prévisionnel (diagramme de Gantt par exemple)
• une ébauche de l'interface graphique

> Un fichier PDF regroupant les 3 documents est souhaité.
> Il devra être nommé de la manière suivante : nom1_nom2.pdf

---

### Projet n°2 : SUPERVISION DE LA TEMPÉRATURE ET DEL’HYGROMÉTRIE A L’EPF

Ce projet consiste à visualiser l’évolution de la température et de l’hygrométrie dans
différentes salles de l’EPF, plus particulièrement celles où il est susceptible de trouver du matériel
informatique (baies de brassage, serveurs, etc).

Des modules SAI60 ( http://www.loreme.fr/fichtech/SAI60.pdf ) seront utilisés. Il sera donc
nécessaire de communiquer avec eux par le réseau pour récupérer les données. Un affichage (sous
forme de graphique, par exemple) permettra de voir l’évolution de ces données.

Le projet est évolutif, c'est à dire que différentes versions peuvent être proposées, allant de la
plus simple à la plus compliquée, de façon à ce que tous puissent, à la fin du semestre, proposer un
logiciel en état de fonctionnement.

Toute autre fonctionnalité que vous pourriez ajouter sera la bienvenue et sera prise en
compte lors de la notation. L’utilisation des notions d’héritage, de listes ou d’ensemble seraient un
plus.

L'aspect graphique du logiciel est un élément important du projet.

#### Version 1
La communication (tcp ou http) permet d’afficher les données reçues d’un module SAI60 à
chaque demande par l’utilisateur (clic sur un bouton par exemple).
La visualisation sous **forme de graphique** des mesures est demandée. Les **valeurs de
température et d’hygrométrie**, ainsi que **la date** et **l’heure**, doivent apparaître.

#### Version 2
Comme la version 1, mais :

- les mesures peuvent être **sauvegardées** dans un fichier.
- on doit pouvoir **visualiser** le graphique des données issues **d’un fichier précédemment sauvegardé**.

#### Version 3
Comme la version 2, mais :

- on doit pouvoir effectuer une **mesure** de façon **périodique**, c’est à dire que les mesures ne se font
plus à la demande de l’utilisateur, mais **automatiquement**.
- la **sauvegarde** des mesures doit évidemment être également **effectuée**.
- la **fréquence** des mesures est **configurable** par **l’administrateur** (un **mot de passe** est nécessaire) et
est **sauvegardée** dans un fichier.

#### Version 4
Comme la version 3, mais :

- des **valeurs d’alarme** (pour la température et l’hygrométrie) peuvent être **saisies et sauvegardées** par l’administrateur.
- ces **valeurs d’alarmes** doivent apparaître sur les graphiques et les **dépassements** doivent être **mis en
valeur**.

#### Version 5
Comme la version 4, mais :

- **plusieurs modules** SAI60 peuvent être présents à l’EPF. La scrutation périodique se fait pour **tous**
les modules.
- la visualisation graphique doit permettre le choix de la température ou/et de l’hygrométrie, d’un ou
plusieurs modules et de la date.

#### Version 6
Comme la version 5, mais :

- des fichiers pdf représentant les graphiques sur une période de 24 heures doivent être générés et
sauvegardés automatiquement.

#### Version 7
Comme la version 6, mais :

- la visualisation des graphiques est générée automatiquement. Ces graphiques sont visibles sur les
écrans présents dans le bâtiment de l’EPF. Tous les étudiants pourront alors voir la température et le
taux d’humidité dans les salles concernées sur les dernières 24 heures ou sur le mois en cours (par
exemple).
