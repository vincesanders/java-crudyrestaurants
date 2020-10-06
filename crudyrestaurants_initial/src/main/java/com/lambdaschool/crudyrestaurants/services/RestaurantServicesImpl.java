package com.lambdaschool.crudyrestaurants.services;

import com.lambdaschool.crudyrestaurants.models.Restaurant;
import com.lambdaschool.crudyrestaurants.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "restaurantService")
public class RestaurantServicesImpl implements RestaurantServices {
    @Autowired
    RestaurantRepository restrepos;

    @Transactional
    @Override
    public Restaurant save(Restaurant restaurant) {
        return restrepos.save(restaurant);
    }
}
