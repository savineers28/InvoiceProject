package com.aot.orders.model;

public class Orders {
        private int orderNumber;

        private String orderDate;

        private String status;

        private int orderTotal;

        private String requestedService;

        private int shippingCost;

        private String custom1;

        private String custom2;

        private String custom3;

        private String itemName;

        private String itemSKU;

        private int itemUnitPrice;

        private int itemQuantity;

        private int itemUnitWeightInOz;

        private String warehouseBin;

        private String fullName;

        private String firstName;

        private String lastName;

        private Address Address;

        private String company;

        private String email;

        private int phone;

        private String notes;

        public int getOrderNumber() {
                return orderNumber;
        }

        public void setOrderNumber(int orderNumber) {
                this.orderNumber = orderNumber;
        }

        public String getOrderDate() {
                return orderDate;
        }

        public void setOrderDate(String orderDate) {
                this.orderDate = orderDate;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public int getOrderTotal() {
                return orderTotal;
        }

        public void setOrderTotal(int orderTotal) {
                this.orderTotal = orderTotal;
        }

        public String getRequestedService() {
                return requestedService;
        }

        public void setRequestedService(String requestedService) {
                this.requestedService = requestedService;
        }

        public int getShippingCost() {
                return shippingCost;
        }

        public void setShippingCost(int shippingCost) {
                this.shippingCost = shippingCost;
        }

        public String getCustom1() {
                return custom1;
        }

        public void setCustom1(String custom1) {
                this.custom1 = custom1;
        }

        public String getCustom2() {
                return custom2;
        }

        public void setCustom2(String custom2) {
                this.custom2 = custom2;
        }

        public String getCustom3() {
                return custom3;
        }

        public void setCustom3(String custom3) {
                this.custom3 = custom3;
        }

        public String getItemName() {
                return itemName;
        }

        public void setItemName(String itemName) {
                this.itemName = itemName;
        }

        public String getItemSKU() {
                return itemSKU;
        }

        public void setItemSKU(String itemSKU) {
                this.itemSKU = itemSKU;
        }

        public int getItemUnitPrice() {
                return itemUnitPrice;
        }

        public void setItemUnitPrice(int itemUnitPrice) {
                this.itemUnitPrice = itemUnitPrice;
        }

        public int getItemQuantity() {
                return itemQuantity;
        }

        public void setItemQuantity(int itemQuantity) {
                this.itemQuantity = itemQuantity;
        }

        public int getItemUnitWeightInOz() {
                return itemUnitWeightInOz;
        }

        public void setItemUnitWeightInOz(int itemUnitWeightInOz) {
                this.itemUnitWeightInOz = itemUnitWeightInOz;
        }

        public String getWarehouseBin() {
                return warehouseBin;
        }

        public void setWarehouseBin(String warehouseBin) {
                this.warehouseBin = warehouseBin;
        }

        public String getFullName() {
                return fullName;
        }

        public void setFullName(String fullName) {
                this.fullName = fullName;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }


        public String getCompany() {
                return company;
        }

        public void setCompany(String company) {
                this.company = company;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public int getPhone() {
                return phone;
        }

        public void setPhone(int phone) {
                this.phone = phone;
        }

        public String getNotes() {
                return notes;
        }

        public void setNotes(String notes) {
                this.notes = notes;
        }

        public Address getAddress() {
                return Address;
        }

        public void setAddress(Address address) {
                Address = address;
        }
}