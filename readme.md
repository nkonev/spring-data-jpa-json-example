```bash
docker exec -it spring-data-jpa-json-example_postgresql_1 psql -U hibernate_json

curl -i -X POST --url 'http://localhost:8080/book' -H 'Content-Type: application/json' -d '{"title":"Java", "author": "Juergen", "jsonbContent": {"publisher": "Packt", "priceInCents": 9899}}'

curl -i -X POST --url 'http://localhost:8080/book' -H 'Content-Type: application/json' -d '{"title":"Kotlin", "author": "Roman", "jsonbContent": {"publisher": "Ast", "priceInCents": 7899}}'

curl -Ss --url 'http://localhost:8080/book/all' | jq
```

# Links
* https://dzone.com/articles/postgres-json-functions-with-hibernate-6
* https://thorben-janssen.com/java-records-embeddables-hibernate/
