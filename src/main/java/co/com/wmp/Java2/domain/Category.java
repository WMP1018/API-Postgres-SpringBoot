package co.com.wmp.Java2.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Genera get and set
@NoArgsConstructor //Genera constructor sin argumentos
@AllArgsConstructor //Genera constructor con argumentos
@Entity //Entidad de la base de datos
@Table(name = "categories") //La tabla que representa en la base de datos
@Builder //Patron de diseño
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "category_id")
    private Long categoryId;

    @Column(columnDefinition = "category_name", unique = true, length = 100, nullable = false)
    private String categoryName;

    @Column(columnDefinition = "description", length = 255)
    private String description;
}
