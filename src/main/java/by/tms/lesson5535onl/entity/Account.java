package by.tms.lesson5535onl.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author simonpirko
 * @version 1.0
 * @since 14.11.2025
 */

@Entity
@Table(name = "tb_accounts")
@Getter
@Setter
@ToString
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
}
