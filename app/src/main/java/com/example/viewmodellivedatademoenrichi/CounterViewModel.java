package com.example.viewmodellivedatademoenrichi;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    // MutableLiveData = donnée observable modifiable
    private final MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    public CounterViewModel() {

        // Valeur initiale
        countLiveData.setValue(0);
    }

    public void increment() {

        Integer current = countLiveData.getValue();

        if (current != null) {
            countLiveData.setValue(current + 1);
        }
    }

    public void decrement() {

        Integer current = countLiveData.getValue();

        if (current != null) {
            countLiveData.setValue(current - 1);
        }
    }

    public void reset() {

        countLiveData.setValue(0);
    }

    // Lecture seule exposée à l'Activity
    public LiveData<Integer> getCount() {

        return countLiveData;
    }
}