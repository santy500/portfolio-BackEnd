
package com.ap.portfolio.model;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Token {
    
    private String accessToken;
    private String tokenType;
    private Long expirityDuration;

    public Token() {
    }

    public Token(String accessToken, String tokenType, Long expirityDuration) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.expirityDuration = expirityDuration;
    }
    
    
}
