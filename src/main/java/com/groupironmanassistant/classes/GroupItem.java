package com.groupironmanassistant.classes;

import com.groupironmanassistant.helpers.DataBuilder;


public class GroupItem extends CustomItem {


    private int _quantity = 0;


    public GroupItem(){

    }

    public GroupItem(int id, int quantity){
        this.setID(id);
        this.setQuantity(quantity);

    }

    public int getID() {
        return _id;
    }
    public void setID(int _id) {
        this._id = _id;
    }

    public int getQuantity() {
        return _quantity;
    }
    public void setQuantity(int _quantity) {
        this._quantity = _quantity;
    }

    public int totalValue(){
        return this.getValue() * this.getQuantity();
    }

    @Override
    public boolean equals(Object o)
    {
        if(o instanceof CustomItem)
        {
            CustomItem other = (CustomItem)o;
            return other != null && _id == other.getID() && _quantity == other.getQuantity();
        }

        GroupItem other = (GroupItem)o;
        return other != null && _id == other.getID() && _quantity == other.getQuantity();
    }
}
