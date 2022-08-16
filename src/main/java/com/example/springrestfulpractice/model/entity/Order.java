package com.example.springrestfulpractice.model.entity;

import com.example.springrestfulpractice.model.entity.Meal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column
    //@ElementCollection(targetClass = Meal.class)
    private int id;
    @Column
    private int totalPrice;
    @Column
    private String waiter;



    @Column
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    //@ElementCollection(targetClass = Meal.class)
    @JoinTable(
            name = "order_meals",
            joinColumns = @JoinColumn(name = "order_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "meal_id",referencedColumnName = "id"))
    //List<Meal> orderMeals;
    private List<Meal> mealList;
}
