package by.bsuir.dc.lab2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EditorRequestTo {

    private BigInteger id = BigInteger.valueOf(-1);

    private String login = "";

    private String password = "";

    private String firstname = "";

    private String lastname = "";
}
