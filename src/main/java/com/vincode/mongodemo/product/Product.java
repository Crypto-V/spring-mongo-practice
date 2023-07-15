package com.vincode.mongodemo.product;

import com.vincode.mongodemo.category.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@Builder //Create a builder for product class which is design pattern.
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private List<String> tags;

    @DBRef
    private Category category;
}
