# Cas métier — Patron Prototype
## Système de création de personnages dans un jeu vidéo
### Contexte métier
Le jeu possède une bibliothèque de personnages préconfigurés que les joueurs peuvent utiliser comme
modèles pour créer leurs propres personnages.
- **Personnages disponibles comme modèles**
• Guerrier
• Mage
• Archer
• Paladin
• Assassin
- **Caractéristiques d’un personnage**
• Équipement
• Compétences
• Statistiques
• Apparence
• Inventaire
• Caractéristiques spéciales
• Configuration de l’IA
## Besoin métier
Lorsqu’un joueur souhaite créer son personnage, il peut choisir un personnage existant comme modèle.
Par exemple : « Je veux créer un personnage basé sur le modèle Guerrier niveau 50. »
Le système doit alors créer un nouveau personnage indépendant possédant initialement les mêmes
caractéristiques que le modèle.
Le joueur peut ensuite modifier son personnage. Par exemple, il peut conserver l’équipement du modèle
tout en changeant son apparence et certaines compétences.
La modification du nouveau personnage ne doit jamais modifier le personnage modèle original.
Contrainte importante
Les personnages modèles sont complexes et déjà configurés. Le système doit pouvoir ajouter de
nouveaux modèles sans que le mécanisme général de création ait besoin de connaître précisément leur
type ou la manière de reconstruire chacune de leurs caractéristiques.
## Évolution du système
Le jeu pourra ajouter de nouveaux modèles, par exemple un Nécromancien. Le système de création doit
pouvoir utiliser ce nouveau modèle sans nécessiter une modification de la logique générale de création.
Problème à résoudre
Comment permettre au système de créer une copie indépendante d’un personnage existant, sans avoir
besoin de connaître précisément sa classe concrète ni de reconstruire manuellement toutes ses
caractéristiques ?
Objectif pédagogique
Ce cas métier illustre le problème auquel répond le patron de conception Prototype : créer un nouvel objet
à partir d’un objet existant, tout en évitant que le code client dépende des classes concrètes des objets à
créer.
