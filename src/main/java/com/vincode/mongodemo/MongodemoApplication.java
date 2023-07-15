package com.vincode.mongodemo;

import com.vincode.mongodemo.category.Category;
import com.vincode.mongodemo.category.CategoryRepository;
import com.vincode.mongodemo.product.Product;
import com.vincode.mongodemo.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongodemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodemoApplication.class, args);
    }

//    @Bean
    public CommandLineRunner commandLineRunner(ProductRepository repository, CategoryRepository categoryRepository) {

        return args -> {

            var category = Category.builder().name("cat1").description("cat 1").build();
            var category2 = Category.builder().name("cat2").description("cat 2").build();

            categoryRepository.insert(category);
            categoryRepository.insert(category2);

        };
    }

}
