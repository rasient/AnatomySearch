package org.semmelweis.university.anatomysearch;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class SearchDto {
    private String pictureName;
    private Integer selectorImageId;
}
