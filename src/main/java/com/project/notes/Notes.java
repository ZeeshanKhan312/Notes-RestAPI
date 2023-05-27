package com.project.notes;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "notes_table")
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notes_id_generator")
    @SequenceGenerator(name = "notes_id_generator", initialValue = 1, allocationSize = 1, sequenceName = "notes_id_sequence")
    int id;

    @NonNull
    @Column(name = "title")
    String title;
    @Column(name = "text")
    @NonNull
    String text;

}
