object InventoryManagement {
  var itemNames: Array[String] = Array("apple", "banana", "orange")
  var itemQuantities: Array[Int] = Array(10, 20, 15)

  def displayInventory(): Unit = {
    println("Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      itemQuantities(index) += quantity
      println(s"Restocked $quantity of $itemName. New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item $itemName does not exist in the inventory.")
    }
  }

  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity of $itemName. New quantity: ${itemQuantities(index)}")
      } else {
        println(s"Not enough $itemName in inventory to sell. Available quantity: ${itemQuantities(index)}")
      }
    } else {
      println(s"Item $itemName does not exist in the inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("banana", 10)
    sellItem("apple", 5)
    sellItem("orange", 20)
    displayInventory()
  }
}
