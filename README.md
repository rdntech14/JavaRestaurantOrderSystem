Restaurant Order System in Java
=====

This sample program demonstrates how to create a simple Restaurant Order System

**Program Input** 

```
		Order order = new Order();

		order.addItem(VEG_BURGER);
		order.addItem(COKE);
		order.addItem(CHICKEN_BURGER);
		order.addItem(COKE);

		order.printBill();
```

**Program Output**

```
Adding item : 
itemName : Veg Burger
ItemDetails [itemName=Veg Burger, itemPrice=4.25]

Adding item : 
itemName : Coke
ItemDetails [itemName=Coke, itemPrice=1.5]

Adding item : 
itemName : Chicken Burger
ItemDetails [itemName=Chicken Burger, itemPrice=5.25]

Adding item : 
itemName : Coke
ItemDetails [itemName=Coke, itemPrice=1.5]

######### Order Bill ############
Item      Quantity       Price
Veg Burger : 1 : 4.25
Coke : 2 : 3.0
Chicken Burger : 1 : 5.25
Total Price : 12.5
###################################
```
