# Démonstrations vidéo

## Vidéo 1 — Tests ViewModel & LiveData

Cette démonstration présente :

- l’incrémentation du compteur
- la rotation de l’écran
- le changement de thème sombre/clair
- le test de process death

### Résultats observés

- le compteur reste intact après rotation
- le compteur reste conservé après changement de thème
- le compteur est réinitialisé après destruction complète du processus

---

## Vidéo 2 — Test sans LiveData

Cette démonstration présente :

- la désactivation du bloc `observe()`
- les clics sur les boutons du compteur

### Résultats observés

- les données sont toujours modifiées dans le ViewModel
- l’interface utilisateur ne se met plus à jour automatiquement

### Conclusion

`LiveData` est responsable de la synchronisation automatique entre les données et l’interface utilisateur.
