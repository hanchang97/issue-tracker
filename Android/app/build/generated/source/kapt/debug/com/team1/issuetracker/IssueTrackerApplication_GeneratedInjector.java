package com.team1.issuetracker;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = IssueTrackerApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface IssueTrackerApplication_GeneratedInjector {
  void injectIssueTrackerApplication(IssueTrackerApplication issueTrackerApplication);
}
