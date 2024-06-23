package name.nkonev.example.spring.data.jpa.json;

public record BookAttributes(
    String publisher,
    Long priceInCents
) { }
