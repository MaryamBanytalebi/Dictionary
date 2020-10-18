package com.example.dictionary.cotroller.activities.repository;

import com.example.dictionary.cotroller.activities.model.DictionaryWord;

import java.util.List;

public interface IRepository {

    void insertWord(DictionaryWord word);
    void updateWord(DictionaryWord word);
    void deleteWord(DictionaryWord word);
    List<DictionaryWord> getWords();
    DictionaryWord getWord(long inputId);
    List<DictionaryWord> searchArabic(String searchValue);
    List<DictionaryWord> searchEnglish(String searchValue);
    List<DictionaryWord> searchFrench(String searchValue);
    List<DictionaryWord> searchPersian(String searchValue);
}
