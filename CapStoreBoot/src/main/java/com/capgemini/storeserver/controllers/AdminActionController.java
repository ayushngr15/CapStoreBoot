package com.capgemini.storeserver.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.storeserver.beans.Coupon;
import com.capgemini.storeserver.beans.Customer;
import com.capgemini.storeserver.beans.Discount;
import com.capgemini.storeserver.beans.Merchant;
import com.capgemini.storeserver.beans.Product;
import com.capgemini.storeserver.services.AdminServices;

@Controller	
public class AdminActionController {
	

	@Autowired
	private AdminServices adminService;
	
	@ModelAttribute("merchant")
	public Merchant getMerchant() {
		return new Merchant();
		
	}
	@ModelAttribute("productList")
	public List<Product> getProductList() {
		return new ArrayList<Product>();
	}
	
	@RequestMapping(value="/")
	public String getIndexPage() {
		return "IndexPage";
	}
//	//Working
//	@RequestMapping(value="/addMerchant")
//	public ModelAndView addMerchant(@Valid@ModelAttribute("merchant") Merchant merchant) {
//		try {
//		merchant = adminService.addMerchant(merchant);
//		}catch (Exception e) {
//			return new ModelAndView("ErrorPage");
//		}
//		return new ModelAndView("", "merchant", merchant);
//	}
//	
//	@RequestMapping(value="/removeMerchant")
//	public ModelAndView removeMerchant(@RequestParam("merchantId")int merchantId) {
//		
//		adminService.removeMerchant(merchantId);
//		return null;
//	}
//	
//	@RequestMapping(value = "/getAllProduct")
//	public List<Product> getAllProduct() {
//		List<Product> product = adminService.viewAllProducts();
//		Iterator<Product> iterator = product.iterator();
//		while (iterator.hasNext())
//			System.out.println(iterator.next());
//		return adminService.viewAllProducts();
//	}
//
//	@RequestMapping(value = "/updateCategory", method = RequestMethod.POST)
//	public void updateCategory(@RequestParam("categoryId") int categoryId,
//			@RequestParam("categoryName") String categoryName, @RequestParam("type") String type) {
//		adminService.updateCategory(categoryId, categoryName, type);
//	}
//	
//	@RequestMapping(value="/addCoupon", method=RequestMethod.POST)
//	public void addCoupon(@RequestBody Coupon coupon) {
//		
//		adminService.addCoupon(coupon);
//	}
//	
//	@RequestMapping(value="/removeCoupon")
//	public void removeCoupon(int couponId) {
//		adminService.removeCoupon(couponId);
//	}
//	
//	@RequestMapping(value="/getAllCustomer", method=RequestMethod.GET)
//	public List<Customer>getAllCustomer()
//	{
//		List<Customer> cust = adminService.viewAllCustomer();
//				Iterator<Customer> it=cust.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
//		return adminService.viewAllCustomer();
//	}
//	@RequestMapping(value="/addDiscount", method=RequestMethod.POST)
//	public void addDiscount(@RequestBody Discount discount) {
//		
//		adminService.addDiscount(discount);
//	}
//	
//	@RequestMapping( value="/removeDiscount", method=RequestMethod.GET)
//	public void removeDiscount(@RequestParam("discountId")int discountId)  {
//		adminService.removeDiscount(discountId);
//	}
}
