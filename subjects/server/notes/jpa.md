# JPA (Java Persistence Api)

JPA es óptimo para aplicaciones pequeñas
te ahorras las consultas a la base de datos

te hace la consulta y te lo mapea

surgió como solución al estándar para el mapeo objeto-relacional



usaremos `Hibernate`

jpa es un conjunto de interfaces de clases abstractas

comunicarse con la bbdd

jpa no es de java

## pasos para usarlo
- añadir la dependencia

```js
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```
<br>

- se puede configurar desde el aplicacition properties
```js
// determina como hibernate maneja la creacion y actualizacion de la estructura de la bbdd
spring.jpa.hibernate.ddl.auto=true

// habilitar logs de consultas SQL
spring.jpa.show.sql=true
```
<br>

---

## Imports

`Entity` => 
<br>

JPA usa sus propias entidades que mapean en una tabla de bbdd

`Table` => 
<br>
jpa intenta conectar la entidad con la tabla correspondiente

___@Table___ indica nombre de la tabla 

```js
@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
public class BookEntity {
```
<br>

`Id` =>
<br>
indica que el atributo es la clave primaria
<br>

`GeneratedValue` =>
<br>
indica que el valor de las claves primarias se generade automáticamente por la bbdd
<br>

`Generation.Type.IDENTITY` =>
<br>
estrategia de generación de valores
<br>
eficiente en autoincrementables

```js
@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
public class BookEntity {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    private String titleEs;
    ...
```
<br>

`Column` =>
<br>
indica el nombre de la columna en la bbdd
<br>
debe coincidir con la bbd

```js
@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
public class BookEntity {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    @Column(name = "title_es")
    private String titleEs;
    ...
```
<br>

---

## Relaciones entre entidades

podemos representar relaciones entre entidades para facilitar el tratamiento de los datos

`@OneToOne` (1 a 1) => relación uno a uno
<br>

`@OneToMany` (1 a n) => relación uno a muchos
<br>

`@ManyToOne` (n a 1) => relación muchos a uno
<br>

`@ManyToMany` (n a n) => relación muchos a muchos
<br>


___para saber la diferencia entre OneToMany y ManyToOne es___ 
<br>
___mirando donde está la n dependiendo de donde esté___
<br>

