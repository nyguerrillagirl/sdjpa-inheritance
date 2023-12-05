package guru.springframework.sdjpainheritence.tableperclass;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Mammal {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private Integer bodyTemp;

    private String speciies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(Integer bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public String getSpeciies() {
        return speciies;
    }

    public void setSpeciies(String speciies) {
        this.speciies = speciies;
    }
}
