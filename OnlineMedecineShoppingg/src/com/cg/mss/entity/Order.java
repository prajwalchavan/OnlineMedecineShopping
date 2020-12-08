package com.cg.mss.entity;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cg.mss.dao.ProductDAO;

@Entity

@Table(name="Order_Details")

public class Order {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="order_id")
	private int orderId;
	@Column(name="userid")
	private String userid;
    @Column(name="Order_Date")
    private String orderDate;
    @Column(name="order_Status")
	private String orderStatus;
    @Column(name="Product_Info")
    private Map<ProductDAO,Integer>cart;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Map<ProductDAO, Integer> getCart() {
		return cart;
	}
	public void setCart(Map<ProductDAO, Integer> cart) {
		this.cart = cart;
	}

}
