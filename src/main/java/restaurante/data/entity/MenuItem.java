package restaurante.data.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "menu_item")
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private Integer number;

    @Column(unique = true, nullable = false)
    private String name;

    @Column
    private String description;

    @ManyToMany(mappedBy = "menuItems")
    private Set<Shop> shops;

    @ManyToMany(mappedBy = "menuItems")
    private Set<Ingredient> ingredients;
}
