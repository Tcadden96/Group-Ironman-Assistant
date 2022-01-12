package com.groupironmanassistant.classes;

import com.groupironmanassistant.helpers.DataBuilder;
import net.runelite.api.*;

import javax.annotation.Nullable;

public class CustomItem implements ItemComposition {

    private Item _item;
    private int _value;

    public CustomItem(int id, int quantity) {
        InventoryID.BANK
    }

    public void setValue(int _value) {
        this._value = _value;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int getNote() {
        return 0;
    }

    @Override
    public int getLinkedNoteId() {
        return 0;
    }

    @Override
    public int getPlaceholderId() {
        return 0;
    }

    @Override
    public int getPlaceholderTemplateId() {
        return 0;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getHaPrice() {
        return 0;
    }

    @Override
    public boolean isMembers() {
        return false;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public boolean isTradeable() {
        return false;
    }

    @Override
    public String[] getInventoryActions() {
        return new String[0];
    }

    @Override
    public int getShiftClickActionIndex() {
        return 0;
    }

    @Override
    public void setShiftClickActionIndex(int shiftClickActionIndex) {

    }

    @Override
    public void resetShiftClickActionIndex() {

    }

    @Override
    public int getInventoryModel() {
        return 0;
    }

    @Nullable
    @Override
    public short[] getColorToReplaceWith() {
        return new short[0];
    }

    @Nullable
    @Override
    public short[] getTextureToReplaceWith() {
        return new short[0];
    }

    @Override
    public IterableHashTable<Node> getParams() {
        return null;
    }

    @Override
    public void setParams(IterableHashTable<Node> params) {

    }

    @Override
    public int getIntValue(int paramID) {
        return 0;
    }

    @Override
    public void setValue(int paramID, int value) {

    }

    @Override
    public String getStringValue(int paramID) {
        return null;
    }

    @Override
    public void setValue(int paramID, String value) {

    }
}
