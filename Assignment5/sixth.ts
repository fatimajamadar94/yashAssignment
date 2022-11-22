//Create a class of item (itemid, itemname, itemprice, category) and create object of the 
//class and print each detail of item. With arrow functions.

var Item = /** @class */ (function () // Here Item class is created 
{
    function Item(itemid, itemname, itemprice, category) 
	{
        this.itemid = itemid;
        this.itemname = itemname;
        this.itemprice = itemprice;
        this.category = category;
    }
    return Item;
}());


var getItemDetails = function (item) {
    console.log("itemid :" + item.itemid);
    console.log("itemname :" + item.itemname);
    console.log("itemprice :" + item.itemprice);
    console.log("category :" + item.category);
};
var itemObj = new Item(101, 'DairyMilk', 5, 'cadburry');

getItemDetails(itemObj);