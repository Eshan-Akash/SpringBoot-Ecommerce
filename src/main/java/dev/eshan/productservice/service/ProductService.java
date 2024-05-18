package dev.eshan.productservice.service;

import dev.eshan.productservice.dtos.GenericProductDto;
import dev.eshan.productservice.exceptions.NotFoundException;

import java.util.List;

public interface ProductService {
    List<GenericProductDto> getProducts();
    GenericProductDto getProductById(String id, Long userIdTryingToAccess) throws NotFoundException;
    List<GenericProductDto> getProductsInCategory(String categoryId) throws NotFoundException;
    GenericProductDto createProduct(GenericProductDto genericProductDto);
    GenericProductDto updateProduct(String id, GenericProductDto genericProductDto) throws NotFoundException;
    GenericProductDto deleteProduct(String id) throws NotFoundException;
}
