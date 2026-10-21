# UML Class Diagram

Here is a UML class diagram, specified using [Mermaid][mer].

```mermaid
classDiagram
    Order <|-- Customer: places
    OrderItem <|-- Order: includes

    Customer : name
    Customer : address
    Customer: placeOrder()

    class Order{
      orderNumber
      datePlaced
      deliveryDate
      checkStock()
      takePayment()
    }
    class OrderItem{
      name
      description
    }
```


[mer]: https://mermaid.js.org/
