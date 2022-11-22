package restaurante.data.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "ingredient_menu_item", 
        joinColumns = @JoinColumn(
            referencedColumnName = "id", 
            name = "id_ingredient"),
        inverseJoinColumns = @JoinColumn(
            referencedColumnName = "id",
            name = "id_menu_item"

        ))
    private Set<MenuItem> menuItems;
}
