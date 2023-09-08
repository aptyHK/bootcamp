package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @AllArgsConstructor
// @NoArgsConstructor
// @Builder
// @Getter
// @Setter
// @ToString
// @EqualsAndHashCode
@Data // this annotation included: Getter Setter ToString EqualsAndHashCode RequiredArgsConstructor
// But if you use Data, you cannot exclude setter.
@AllArgsConstructor
@Builder
public class Book {
    private String author;
    private double weight;


}
