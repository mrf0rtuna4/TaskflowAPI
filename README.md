<h1 align="center">TaskFlow Manager (TaskFlowAPI)</h1>  

<div align="center">
  <a href="https://github.com/mrf0rtuna4/TaskFlowAPI/actions">
    <img src="https://img.shields.io/github/actions/workflow/status/mrf0rtuna4/TaskFlowAPI/build.yml">
  </a>
  <a href="https://www.oracle.com/java/technologies/javase-jdk22-doc-downloads.html">
    <img src="https://img.shields.io/badge/java-22-blue">
  </a>
  <a href="LICENSE">
    <img src="https://img.shields.io/github/license/mrf0rtuna4/TaskFlowAPI">
  </a>
</div>

TaskFlow Manager — это RESTful API для управления задачами с поддержкой CRUD операций, JWT-аутентификации и фильтрации задач по статусу и дате.  

---

## 🚀 Основные возможности  

- **CRUD операции:** Создание, чтение, обновление и удаление задач.  
- **Фильтрация:** По статусу (`PENDING`, `IN_PROGRESS`, `COMPLETED`) и дате завершения.  
- **Аутентификация:** С использованием JWT для безопасности и контроля доступа.  
- **Документация:** Swagger для удобного тестирования и ознакомления с API.  

---

## 🛠 Стек технологий  

- **Java 22**  
- **Spring Boot**  
- **Hibernate**  
- **PostgreSQL**  
- **Swagger** для автогенерации документации  
- **JWT** для аутентификации и авторизации  

---

## 📦 Установка и запуск  

### 1. Клонирование репозитория  
```bash
git clone https://github.com/mrf0rtuna4/TaskflowAPI.git
cd TaskflowAPI
```

### 2. Настройка базы данных  
Измените `application.properties` для подключения к вашей базе данных PostgreSQL:  
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/taskflow
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 3. Сборка и запуск проекта  
Используйте Maven для запуска приложения:  
```bash
mvn spring-boot:run
```

---

## 🔗 API Эндпоинты  

| Метод | Эндпоинт             | Описание                          |
|-------|----------------------|------------------------------------|
| GET   | `/api/tasks`          | Получить список всех задач         |
| POST  | `/api/tasks`          | Создать новую задачу               |
| GET   | `/api/tasks/{id}`     | Получить задачу по ID              |
| PUT   | `/api/tasks/{id}`     | Обновить задачу по ID              |
| DELETE| `/api/tasks/{id}`     | Удалить задачу по ID               |
| GET   | `/api/tasks/filter`   | Фильтрация по статусу и дате       |

---

## 🔒 Безопасность  

### Важные моменты:
- Все защищённые эндпоинты требуют JWT-токена в заголовке:  
  ```http
  Authorization: Bearer <ваш-токен>
  ```
- **Рекомендация:** Никогда не храните JWT-токены в небезопасных местах (например, локально в открытом виде). Следует использовать безопасные методы передачи и хранения.

---

## 📖 Документация  

Swagger-документация доступна по адресу:  
```
http://localhost:8080/swagger-ui/index.html
```

---

## 📋 TODO  

- [x] Создать базовую структуру проекта.  
- [ ] Добавить CRUD для задач.  
- [ ] Добавить фильтрацию задач.  
- [ ] Настроить JWT-аутентификацию.  
- [ ] Добавить Swagger для документации.  
- [ ] Реализовать валидацию данных.  
- [ ] Обработать ошибки и исключения.  
- [ ] Написать тесты для сервисного слоя.  
- [ ] Обновить документацию.  

---

## 🤝 Вклад в проект  

Pull requests приветствуются! Пожалуйста, ознакомьтесь с [CONTRIBUTING.md](CONTRIBUTING.md) перед началом работы.

---

## 📜 Лицензия  

Этот проект лицензирован под [Apache License 2.0](LICENSE).
