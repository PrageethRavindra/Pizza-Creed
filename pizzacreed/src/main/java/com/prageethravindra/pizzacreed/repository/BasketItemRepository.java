package com.prageethravindra.pizzacreed.repository;

import com.prageethravindra.pizzacreed.dao.BasketItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketItemRepository extends JpaRepository<BasketItem, Long> {

    void deleteAllByShoppingBasketId(Long basketId);
}
