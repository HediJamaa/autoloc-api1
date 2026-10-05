package tn.esprit.autoloc.autolocapi1.domain;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "agence")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    Long idAgence;

    @Column(nullable = false, length = 100)
    String nom;

    @Column(nullable = false, length = 50)
    String ville;

    @Column(nullable = false, length = 150)
    String adresse;

    @Column(length = 20)
    String telephone;
}