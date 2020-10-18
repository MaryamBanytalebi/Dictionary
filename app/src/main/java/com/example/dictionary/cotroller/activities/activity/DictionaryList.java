package com.example.dictionary.cotroller.activities.activity;

import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;

import com.example.dictionary.cotroller.activities.fragments.DictionaryListFragment;

public class DictionaryList extends SingleFragmentActivity {

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, DictionaryList.class);
        return intent;
    }
    @Override
    public Fragment createFragment() {
        DictionaryListFragment dictionaryListFragment = DictionaryListFragment.newInstance();
        return dictionaryListFragment;
    }
}