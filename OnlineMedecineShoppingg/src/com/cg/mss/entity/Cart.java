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

@Table(name="CartDetails")
public class Cart {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="cart_id")
	private int cartId;
	@Column(name="userid")
	private String userid;
    @Column(name="cart_info")
    private Map<ProductDAO,Integer>cart;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getUser() {
		return userid;
	}
	public void setUser(String user) {
		this.userid = user;
	}
	public Map<ProductDAO, Integer> getCart() {
		return cart;
	}
	public void setCart(Map<ProductDAO, Integer> cart) {
		this.cart = cart;
	}

}
