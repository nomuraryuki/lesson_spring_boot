package com.example.lesson;

import com.example.lesson.entity.ProductRecord;
import com.example.lesson.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LessonApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(LessonApplication.class, args);

		// newが不要でインスタンスを取得できる
		var productsService = context.getBean(ProductService.class);
//		var list = productsService.findAll();
//		list.stream().forEach(System.out::println);
//
//		var products = productsService.findById(1); // IDが1のユーザーのみを取得
//		System.out.println(products);

		var newProductsRecord = new ProductRecord(1,"のり",100 );
		var products = productsService.insert(newProductsRecord);
		System.out.println(products);

//		var newProductsRecord = new ProductRecord(5,"はがき",108 );
//		var products = productsService.update(newProductsRecord);
//		System.out.println(products);

//		var products = productsService.delete(5);
//		System.out.println(products);
	}

}
