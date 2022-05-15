# Code4Fun Common

Code4Fun Common is a common library that **used as a code layout and a template for coding style**. Code4Fun Common serves a service interface that strictly implements SRP (Single Responsibility Interface) for business logic and data transformation. Every process will be execute in a single handy method using a single input, and will be only produce a single output. 

It also applies for model structure such as : 
* entity for data model.
* request as input model.
* response as output model.  
* provide some of common model classes that can be re-used without re-ivent similar codes. 

Here is the minimum requirements to use this library
1. Lombok
1. JDK v11
1. Spring (Spring Data JPA and Swagger Docs) 

## Installation

Use the maven command [mvn](https://maven.org/) to install Code4Fun.

```xml
<dependency>
    <groupId>id.codefun.common</groupId>
    <artifactId>codefun-common</artifactId>
    <version>${codefun-common.version}</version>
</dependency>
```

## Usage

Request model class
```java
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyRequest extends BaseRequest {

    //attributes

}
```

Response model class
```java
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyResponse extends BaseResponse {

    //attributes

}
```

Data model class
```java
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyData extends BaseEntity {

    //attributes

}
```

Business logic class
```java
public class MyService implements BaseService<MyRequest, MyResponse> {

    public MyResponse execute(MyRequest request) {
        return ...
    }

}
```

Data transformation class e.g from data model to request model
```java
public class MyTransformation implements MessageTransformer<MyModel, MyRequest> {

    public MyRequest transform(MyModel input) {
        return ...
    }

}
```

## Contributing
For major changes, please open an issue first to discuss what you would like to change. Currently the author is trying to complete the full detail documentation on his Confluence for a further development.

## License
[MIT](https://choosealicense.com/licenses/mit/)