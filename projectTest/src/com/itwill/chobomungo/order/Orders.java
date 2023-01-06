package com.itwill.chobomungo.order;

import java.util.Date;
import java.util.List;

public class Orders {
	private int o_no;
	private String o_desc;
	private int o_price;
	private Date o_date;
	private String user_id;
	
	List<OrderItem> orderItemList;
}
