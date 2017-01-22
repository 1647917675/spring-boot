package com.example.server;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.component.BlogProperties;
import com.example.component.CopyOfBlogProperties;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

@RestController
@RequestMapping("/task")
public class TaskControll {

	@Autowired(required=false)
	BlogProperties BlogProperties;
	
	private Mongo Mongo;
	@Autowired(required=false)
	CopyOfBlogProperties CopyOfBlogProperties;
	
	@RequestMapping("/say")
	public String say(){
		if (BlogProperties != null) {
			System.out.println(BlogProperties.toString());
//			System.out.println(new String(BlogProperties.getName().getBytes(),Charset.forName("UTF-8")));
			return BlogProperties.toString();
		}else {
			System.out.println("blogProperties can not be inited by springbootContext");
		}
		
		return "undefined";
	}
	
	@RequestMapping("/say2")
	public String say2(){
		if (CopyOfBlogProperties != null) {
			System.out.println(CopyOfBlogProperties.toString());
//			System.out.println(new String(BlogProperties.getName().getBytes(),Charset.forName("UTF-8")));
			return CopyOfBlogProperties.toString();
		}else {
			System.out.println("CopyOfBlogProperties can not be inited by springbootContext");
		}
		
		return "undefined";
	}
	
	
	@RequestMapping("/test")
	public String getDataBase(){
		System.out.println("sockettimeOut:"+template.getDb().getMongo().getMongoOptions().getSocketTimeout());
		System.out.println("socketKeepAlive:"+template.getDb().getMongo().getMongoOptions().isSocketKeepAlive());
		System.out.println("connecttionsNUM:"+template.getDb().getMongo().getMongoOptions().connectionsPerHost);
		System.out.println("connecttimeOut:"+template.getDb().getMongo().getMongoOptions().connectTimeout);
		System.out.println(""+template.getDb().getMongo().getMongoOptions());
		System.out.println(template.getDb().getMongo().getMongoOptions());  
		
		return template.getDb().getName();
	}
	
	
	@Autowired
	MongoTemplate template;
	
	@RequestMapping("/test2")
	public String getDataBaseTest() throws InterruptedException{
		Thread[] threadsPool = new Thread[30];
	
		for (int i = 1; i<= 10; i++) {
			
		 threadsPool[i] = new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(template.getCollectionNames().size());
				}
			});
		 
		 threadsPool[i].start();
//		 threadsPool[i].join();
		}
		
		return template.getDb().getName();
	}
	
	@RequestMapping(
			path="/data",
			method={RequestMethod.GET,
			RequestMethod.POST},params={"worlds"}
	)
	public String getDataBaselog(String worlds){
		
		System.out.println(worlds);
		System.out.println(template.getCollection("BAOXIAN").count());
//		DBCursor cursor =	template.getCollection("BAOXIAN").find();
		long startTime = System.currentTimeMillis();
//		while (cursor.hasNext()) {
//		System.out.println(cursor.next());
//			
//		}
//		
		System.out.println((System.currentTimeMillis()-startTime)/1000);
		return template.getDb().getName()+worlds;
	}
	
	
	@RequestMapping("/test3")
	public String getDataBaseTest3() throws InterruptedException{
		
		if (Mongo == null) {
			Mongo =template.getDb().getMongo();
		}
		
		
		DBCursor cursor = Mongo.getDB("test").getCollection("BAOXIAN").find();
		while(cursor.hasNext()){
			System.out.println(cursor.next());
			
		}
		return template.getDb().getName();
	}
	
	@RequestMapping("/test4")
	public String getDataBaseTest4() throws InterruptedException{
		
		int i =1;
		if (Mongo == null) {
			System.err.println("--------------");
			Mongo =template.getDb().getMongo();
		}
		
		
		while(i < 10000){
//			System.out.println("========================================"+(i++)+"=======================================");
			synchronized (Mongo) {
				Thread.sleep(10000);
				Mongo.getDB("test").getCollection("reset").insert(new BasicDBObject().append("random", UUID.randomUUID().toString()));
			}
			
//			System.out.println(ToStringBuilder.reflectionToString(Mongo));
		}
		
		return "undefined";
	}
	
	
}
