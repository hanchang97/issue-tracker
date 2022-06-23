package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.team1.issuetracker.DataBinderMapperImpl());
  }
}
