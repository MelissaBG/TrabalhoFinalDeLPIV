package com.fundatec.trabalhofinaldelpiv;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.fundatec.trabalhofinaldelpiv.databinding.ActivityBottomNavigationBindingImpl;
import com.fundatec.trabalhofinaldelpiv.databinding.ActivityCharacterListBindingImpl;
import com.fundatec.trabalhofinaldelpiv.databinding.ActivityHomeBindingImpl;
import com.fundatec.trabalhofinaldelpiv.databinding.ActivityLoginBindingImpl;
import com.fundatec.trabalhofinaldelpiv.databinding.ActivityNewCharacterBindingImpl;
import com.fundatec.trabalhofinaldelpiv.databinding.ActivityProfileBindingImpl;
import com.fundatec.trabalhofinaldelpiv.databinding.ActivityRegisterUserBindingImpl;
import com.fundatec.trabalhofinaldelpiv.databinding.FragmentCharactersBindingImpl;
import com.fundatec.trabalhofinaldelpiv.databinding.ListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBOTTOMNAVIGATION = 1;

  private static final int LAYOUT_ACTIVITYCHARACTERLIST = 2;

  private static final int LAYOUT_ACTIVITYHOME = 3;

  private static final int LAYOUT_ACTIVITYLOGIN = 4;

  private static final int LAYOUT_ACTIVITYNEWCHARACTER = 5;

  private static final int LAYOUT_ACTIVITYPROFILE = 6;

  private static final int LAYOUT_ACTIVITYREGISTERUSER = 7;

  private static final int LAYOUT_FRAGMENTCHARACTERS = 8;

  private static final int LAYOUT_LISTITEM = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fundatec.trabalhofinaldelpiv.R.layout.activity_bottom_navigation, LAYOUT_ACTIVITYBOTTOMNAVIGATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fundatec.trabalhofinaldelpiv.R.layout.activity_character_list, LAYOUT_ACTIVITYCHARACTERLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fundatec.trabalhofinaldelpiv.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fundatec.trabalhofinaldelpiv.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fundatec.trabalhofinaldelpiv.R.layout.activity_new_character, LAYOUT_ACTIVITYNEWCHARACTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fundatec.trabalhofinaldelpiv.R.layout.activity_profile, LAYOUT_ACTIVITYPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fundatec.trabalhofinaldelpiv.R.layout.activity_register_user, LAYOUT_ACTIVITYREGISTERUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fundatec.trabalhofinaldelpiv.R.layout.fragment_characters, LAYOUT_FRAGMENTCHARACTERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fundatec.trabalhofinaldelpiv.R.layout.list_item, LAYOUT_LISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYBOTTOMNAVIGATION: {
          if ("layout/activity_bottom_navigation_0".equals(tag)) {
            return new ActivityBottomNavigationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_bottom_navigation is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCHARACTERLIST: {
          if ("layout/activity_character_list_0".equals(tag)) {
            return new ActivityCharacterListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_character_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNEWCHARACTER: {
          if ("layout/activity_new_character_0".equals(tag)) {
            return new ActivityNewCharacterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_new_character is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPROFILE: {
          if ("layout/activity_profile_0".equals(tag)) {
            return new ActivityProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREGISTERUSER: {
          if ("layout/activity_register_user_0".equals(tag)) {
            return new ActivityRegisterUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_register_user is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHARACTERS: {
          if ("layout/fragment_characters_0".equals(tag)) {
            return new FragmentCharactersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_characters is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEM: {
          if ("layout/list_item_0".equals(tag)) {
            return new ListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_bottom_navigation_0", com.fundatec.trabalhofinaldelpiv.R.layout.activity_bottom_navigation);
      sKeys.put("layout/activity_character_list_0", com.fundatec.trabalhofinaldelpiv.R.layout.activity_character_list);
      sKeys.put("layout/activity_home_0", com.fundatec.trabalhofinaldelpiv.R.layout.activity_home);
      sKeys.put("layout/activity_login_0", com.fundatec.trabalhofinaldelpiv.R.layout.activity_login);
      sKeys.put("layout/activity_new_character_0", com.fundatec.trabalhofinaldelpiv.R.layout.activity_new_character);
      sKeys.put("layout/activity_profile_0", com.fundatec.trabalhofinaldelpiv.R.layout.activity_profile);
      sKeys.put("layout/activity_register_user_0", com.fundatec.trabalhofinaldelpiv.R.layout.activity_register_user);
      sKeys.put("layout/fragment_characters_0", com.fundatec.trabalhofinaldelpiv.R.layout.fragment_characters);
      sKeys.put("layout/list_item_0", com.fundatec.trabalhofinaldelpiv.R.layout.list_item);
    }
  }
}
