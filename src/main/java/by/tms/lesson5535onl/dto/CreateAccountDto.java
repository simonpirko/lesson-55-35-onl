package by.tms.lesson5535onl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author simonpirko
 * @version 1.0
 * @since 14.11.2025
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAccountDto {
    private String username;
    private String password;
}
