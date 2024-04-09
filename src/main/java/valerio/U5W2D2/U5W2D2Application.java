package valerio.U5W2D2;

import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import valerio.U5W2D2.entities.BlogPost;
import valerio.U5W2D2.services.BlogPostService;

import java.util.function.Supplier;

@SpringBootApplication
public class U5W2D2Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W2D2Application.class, args);

//	Faker faker =new Faker();
//	BlogPostService blogPostService= new BlogPostService();
//
//
//	Supplier<BlogPost> supplierPost = () -> new BlogPost(faker.random().nextInt(12311111),
//			faker.music().genre(),
//			faker.lorem().sentence(),
//			faker.internet().url(),
//			faker.lorem().paragraph(),
//			faker.number().numberBetween(1, 1000));
//
//	for (int i = 0; i < 5; i++){
//		BlogPost blogPost= supplierPost.get();
//		blogPostService.getBlogPostList().add(blogPost);
//		System.out.println(blogPost);
//	}

	}

}
