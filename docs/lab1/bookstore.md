# Bookstore UML Diagram

```mermaid
classDiagram
direction LR
class SaleableItem { <<interface>> +double getPrice() +void sellItem() }
class Editable { <<abstract>> +void edit() +void initialize() }
class Publication { <<abstract>> -String title -double price -int copies +double getPrice() +void sellItem()* }
class Book { -String author }
class Magazine { -int orderQty -LocalDate currentIssue }
class DiscMag { -boolean hasDisc }
class Ticket { -int id -String description -double price }
class CashTill { -double runningTotal +void sellItem(SaleableItem) +void showTotal() }

Editable <|-- Publication
Publication <|-- Book
Publication <|-- Magazine
Magazine <|-- DiscMag
SaleableItem <|.. Publication
SaleableItem <|.. Ticket
CashTill ..> SaleableItem : uses

