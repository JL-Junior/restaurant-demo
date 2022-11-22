package restaurante.data.entity;

import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String address;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "shop_menu_item", 
        joinColumns = @JoinColumn(
            referencedColumnName = "id", 
            name = "id_shop", 
            columnDefinition = "uuid"),
        inverseJoinColumns = @JoinColumn(
            referencedColumnName = "id",
            name = "id_menu_item"
        ))
    private Set<MenuItem> menuItems;
}
