// Generated by data binding compiler. Do not edit!
package com.fundatec.trabalhofinaldelpiv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.fundatec.trabalhofinaldelpiv.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityNewCharacterBinding extends ViewDataBinding {
  @NonNull
  public final Button btnSaveCharacter;

  @NonNull
  public final ConstraintLayout charContainer;

  @NonNull
  public final TextInputEditText characterType;

  @NonNull
  public final TextInputEditText etAge;

  @NonNull
  public final TextInputEditText etDate;

  @NonNull
  public final TextInputEditText etDescription;

  @NonNull
  public final TextInputEditText etName;

  @NonNull
  public final TextInputEditText etUrl;

  @NonNull
  public final ProgressBar pbLoading;

  @NonNull
  public final MaterialToolbar tbNavigation;

  @NonNull
  public final TextInputEditText universeType;

  protected ActivityNewCharacterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnSaveCharacter, ConstraintLayout charContainer, TextInputEditText characterType,
      TextInputEditText etAge, TextInputEditText etDate, TextInputEditText etDescription,
      TextInputEditText etName, TextInputEditText etUrl, ProgressBar pbLoading,
      MaterialToolbar tbNavigation, TextInputEditText universeType) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSaveCharacter = btnSaveCharacter;
    this.charContainer = charContainer;
    this.characterType = characterType;
    this.etAge = etAge;
    this.etDate = etDate;
    this.etDescription = etDescription;
    this.etName = etName;
    this.etUrl = etUrl;
    this.pbLoading = pbLoading;
    this.tbNavigation = tbNavigation;
    this.universeType = universeType;
  }

  @NonNull
  public static ActivityNewCharacterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_new_character, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNewCharacterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityNewCharacterBinding>inflateInternal(inflater, R.layout.activity_new_character, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityNewCharacterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_new_character, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNewCharacterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityNewCharacterBinding>inflateInternal(inflater, R.layout.activity_new_character, null, false, component);
  }

  public static ActivityNewCharacterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityNewCharacterBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityNewCharacterBinding)bind(component, view, R.layout.activity_new_character);
  }
}