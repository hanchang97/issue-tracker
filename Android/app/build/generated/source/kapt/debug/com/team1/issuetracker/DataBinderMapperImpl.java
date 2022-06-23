package com.team1.issuetracker;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.team1.issuetracker.databinding.ActivityLoginBindingImpl;
import com.team1.issuetracker.databinding.ActivityMainBindingImpl;
import com.team1.issuetracker.databinding.FragmentAddLabelBindingImpl;
import com.team1.issuetracker.databinding.FragmentAddMilestoneBindingImpl;
import com.team1.issuetracker.databinding.FragmentIssueBindingImpl;
import com.team1.issuetracker.databinding.FragmentLabelBindingImpl;
import com.team1.issuetracker.databinding.FragmentMilestoneBindingImpl;
import com.team1.issuetracker.databinding.FragmentMyBindingImpl;
import com.team1.issuetracker.databinding.ItemIssueBindingImpl;
import com.team1.issuetracker.databinding.ItemLabelBindingImpl;
import com.team1.issuetracker.databinding.ItemMilestoneBindingImpl;
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
  private static final int LAYOUT_ACTIVITYLOGIN = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_FRAGMENTADDLABEL = 3;

  private static final int LAYOUT_FRAGMENTADDMILESTONE = 4;

  private static final int LAYOUT_FRAGMENTISSUE = 5;

  private static final int LAYOUT_FRAGMENTLABEL = 6;

  private static final int LAYOUT_FRAGMENTMILESTONE = 7;

  private static final int LAYOUT_FRAGMENTMY = 8;

  private static final int LAYOUT_ITEMISSUE = 9;

  private static final int LAYOUT_ITEMLABEL = 10;

  private static final int LAYOUT_ITEMMILESTONE = 11;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(11);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.team1.issuetracker.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.team1.issuetracker.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.team1.issuetracker.R.layout.fragment_add_label, LAYOUT_FRAGMENTADDLABEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.team1.issuetracker.R.layout.fragment_add_milestone, LAYOUT_FRAGMENTADDMILESTONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.team1.issuetracker.R.layout.fragment_issue, LAYOUT_FRAGMENTISSUE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.team1.issuetracker.R.layout.fragment_label, LAYOUT_FRAGMENTLABEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.team1.issuetracker.R.layout.fragment_milestone, LAYOUT_FRAGMENTMILESTONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.team1.issuetracker.R.layout.fragment_my, LAYOUT_FRAGMENTMY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.team1.issuetracker.R.layout.item_issue, LAYOUT_ITEMISSUE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.team1.issuetracker.R.layout.item_label, LAYOUT_ITEMLABEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.team1.issuetracker.R.layout.item_milestone, LAYOUT_ITEMMILESTONE);
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
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDLABEL: {
          if ("layout/fragment_add_label_0".equals(tag)) {
            return new FragmentAddLabelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_label is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDMILESTONE: {
          if ("layout/fragment_add_milestone_0".equals(tag)) {
            return new FragmentAddMilestoneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_milestone is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTISSUE: {
          if ("layout/fragment_issue_0".equals(tag)) {
            return new FragmentIssueBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_issue is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLABEL: {
          if ("layout/fragment_label_0".equals(tag)) {
            return new FragmentLabelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_label is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMILESTONE: {
          if ("layout/fragment_milestone_0".equals(tag)) {
            return new FragmentMilestoneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_milestone is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMY: {
          if ("layout/fragment_my_0".equals(tag)) {
            return new FragmentMyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_my is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMISSUE: {
          if ("layout/item_issue_0".equals(tag)) {
            return new ItemIssueBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_issue is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLABEL: {
          if ("layout/item_label_0".equals(tag)) {
            return new ItemLabelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_label is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMILESTONE: {
          if ("layout/item_milestone_0".equals(tag)) {
            return new ItemMilestoneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_milestone is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "issue");
      sKeys.put(2, "item");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(11);

    static {
      sKeys.put("layout/activity_login_0", com.team1.issuetracker.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", com.team1.issuetracker.R.layout.activity_main);
      sKeys.put("layout/fragment_add_label_0", com.team1.issuetracker.R.layout.fragment_add_label);
      sKeys.put("layout/fragment_add_milestone_0", com.team1.issuetracker.R.layout.fragment_add_milestone);
      sKeys.put("layout/fragment_issue_0", com.team1.issuetracker.R.layout.fragment_issue);
      sKeys.put("layout/fragment_label_0", com.team1.issuetracker.R.layout.fragment_label);
      sKeys.put("layout/fragment_milestone_0", com.team1.issuetracker.R.layout.fragment_milestone);
      sKeys.put("layout/fragment_my_0", com.team1.issuetracker.R.layout.fragment_my);
      sKeys.put("layout/item_issue_0", com.team1.issuetracker.R.layout.item_issue);
      sKeys.put("layout/item_label_0", com.team1.issuetracker.R.layout.item_label);
      sKeys.put("layout/item_milestone_0", com.team1.issuetracker.R.layout.item_milestone);
    }
  }
}
