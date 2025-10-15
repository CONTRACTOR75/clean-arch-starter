# 🧱 Clean Architecture Starter - Spring Boot 3.1
> Un template Spring Boot prêt à l'emploi basé sur la **Clean Architecture**, avec une séparation claire des responsabilités :
> - API Layer (controllers + DTOs)
> - Interfaces (ports)
> - Use Cases (business logic)
> - Models (domain)
> - Infrastructure (repositories)
> - Utils & Exception handling
---

## 📦 Technologies utilisées
- ✅ Java 21
- ✅ Spring Boot 3.1
- ✅ Spring Web (REST API)
- ✅ Spring Data JPA
- ✅ H2 Database (in-memory)
- ✅ Lombok
- ✅ Spring Validation
- ✅ Exception Handling global
- ✅ Architecture modulaire et évolutive

---

## 🧠 Architecture du projet

Ce projet suit la **Clean Architecture** (inspirée de Uncle Bob) avec les couches suivantes :
```pgsql
src/
├── application/ # Cas d’usage (Use cases) + interfaces de service
├── domain/ # Modèles métier purs (Entities)
├── infrastructure/ # Accès aux données (ex: JPA Repositories)
├── presentation/ # Web layer : contrôleurs, DTOs
├── exceptions/ # Gestion centralisée des exceptions
├── utils/ # Mapping, helpers, etc.
```
Chaque couche dépend uniquement des couches **inférieures** (ex: application → domain, mais pas l'inverse).

---

## 🚀 Lancement du projet

### Cloner le repo
```bash
git clone https://github.com/CONTRACTOR75/clean-arch-starter.git
cd clean-arch-starter 
```

###  Lancer l'application
```bash
./mvnw spring-boot:run
```

> Accès H2 console : http://localhost:8080/h2-console

## 🧪 Endpoints REST disponibles
| Méthode | Endpoint      | Description              |
| ------: | ------------- | ------------------------ |
|     GET | `/users/{id}` | Récupérer un utilisateur |
|    POST | `/users`      | Créer un utilisateur     |
|     PUT | `/users/{id}` | Modifier un utilisateur  |
|  DELETE | `/users/{id}` | Supprimer un utilisateur |

## 🧰 Exemple de requêtes
### ➕ POST ` /users `
```json
{
  "username": "johnny_test",
  "email": "johnny-test@yahoo.fr"
}
```

### ✅ Réponse
```json
{
  "id": 1,
  "username": "johnny_test",
  "email": "johnny-test@yahoo.fr"
}
```

## 📁 Structure complète du projet
```pgsql
org.template_example
│
├── application/
│   ├── usecases/
│   │   ├── CreateUserUseCase.java
│   │   ├── GetUserByIdUseCase.java
│   │   ├── UpdateUserUseCase.java
│   │   └── DeleteUserUseCase.java
│   └── interfaces/
│       └── UserService.java
│
├── domain/
│   └── models/
│       └── User.java
│
├── infrastructure/
│   └── repositories/
│       └── JpaUserRepository.java
│
├── presentation/
│   ├── controllers/
│   │   └── UserController.java
│   └── dtos/
│       ├── UserRequest.java
│       └── UserResponse.java
│
├── exceptions/
│   ├── GlobalExceptionHandler.java
│   └── UserNotFoundException.java
│
└── utils/
    └── Mapper.java
```

## 📌 Personnalisation rapide

- 🛠 Renomme org.example par ton propre package : com.tonentreprise.nomprojet
- 🛠 Modifie ou ajoute des entités (ex: Product, Order, etc.)
- 🛠 Crée de nouveaux UseCases : CreateProductUseCase, etc.
- 🛠 Ajoute de nouveaux endpoints dans un ProductController par exemple

## ✅ Idéal pour :
- 🚀 Créer rapidement une API REST solide et scalable 
- 🎓 Apprendre ou enseigner la Clean Architecture en Java 
- 🧪 Débuter des projets POCs ou MVPs 
- 🔁 Réutiliser une base saine pour plusieurs projet

## 🙏 Contribution
Ce projet est un template de démarrage. Tu peux :

- Le forker
- Le cloner 
- L’améliorer Proposer une PR 
- Créer ta propre version custom
