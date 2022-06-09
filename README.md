# LOTO

## Problèmes rencontrés

### Méthode randome

la fonction native de java pour générer des numéros aléatoirs peut créer deux même numéro. Pour remédier à se problème, j'ai stocké mes numéros dans un tableau "LinkedHashSet" qui n'accepte pas des doublons.



### Méthode handToken

Lorsque je récupérais un numéro des list de token, la liste historique des numéros ne se mettait pas à jour. La fonction setListData de la classe Jlist permet de récupérer la liste à jour et de l'afficher.


### Différencier le QUIN | DOUBLEQUIN | CARTON

Chaque bouton (quin, doublequin, carton) a une méthode actionPerformed() qui appeler une autre checkSelectedCase(). Ce dernier va ranger chaque bouton selectionné dans un tableau à trois dimensions. Chaque dimension correspond à une rangée de mes bouton sur le logiciel. Pour terminer les actionPerformed() va verifier si toute la rangée a été selectionné.