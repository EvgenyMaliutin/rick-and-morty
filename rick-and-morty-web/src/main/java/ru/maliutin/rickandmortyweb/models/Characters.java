package ru.maliutin.rickandmortyweb.models;

import lombok.Data;

import java.util.List;

/**
 * Сущность с данными о персонажах.
 */
@Data
public class Characters {
     /**
      * Данные о пагинации.
      */
     Info info;
     /**
      * Список персонажей.
      */
     List<Result> results;

     public Info getInfo() {
          return info;
     }

     public void setInfo(Info info) {
          this.info = info;
     }

     public List<Result> getResults() {
          return results;
     }

     public void setResults(List<Result> results) {
          this.results = results;
     }
}
