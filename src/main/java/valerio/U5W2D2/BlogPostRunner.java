package valerio.U5W2D2;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import valerio.U5W2D2.entities.BlogPost;
import valerio.U5W2D2.services.BlogPostService;

import java.util.function.Supplier;

@Component
public class BlogPostRunner implements CommandLineRunner {
Faker faker =new Faker();
@Autowired
private BlogPostService blogPostService;

@Override
    public void run (String... args) throws  Exception{
    Supplier<BlogPost> supplierPost = () -> new BlogPost(faker.random().nextInt(12311111),
                faker.music().genre(),
                faker.lorem().sentence(),
                faker.internet().url(),
                faker.lorem().paragraph(),
                faker.number().numberBetween(1, 1000));

    for (int i = 0; i < 5; i++){
        BlogPost blogPost= supplierPost.get();
        blogPostService.saveBlogPost(blogPost);
        System.out.println(blogPost);
    }
}
}

