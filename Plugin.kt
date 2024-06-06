// Utiliser un entier pour les numéros de version
version = 1

cloudstream {
    language = "fr"
    // Toutes ces propriétés sont optionnelles, vous pouvez les supprimer en toute sécurité

    description = "WIFLIX, le site grâce auquel vous allez pouvoir regarder vos films et séries préférées"
    authors = listOf("Votre nom")

    /**
     * Statut int comme suit:
     * 0: Hors ligne
     * 1: OK
     * 2: Lent
     * 3: Beta uniquement
     */
    status = 1 // sera 3 si non spécifié
    tvTypes = listOf(
        "TvSeries",
        "Movie"
    )

    // Utilisez le lien du site Web de streaming que vous avez fourni comme base URL
    val baseUrl = "http://wiflix.promo"
}
