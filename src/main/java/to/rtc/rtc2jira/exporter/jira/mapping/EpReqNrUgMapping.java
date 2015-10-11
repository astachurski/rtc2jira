/*
 * Copyright (c) 2015 BISON Schweiz AG, All Rights Reserved.
 */
package to.rtc.rtc2jira.exporter.jira.mapping;

import to.rtc.rtc2jira.exporter.jira.entities.Issue;
import to.rtc.rtc2jira.storage.StorageEngine;

/**
 * @author gustaf.hansen
 *
 */
public class EpReqNrUgMapping implements Mapping {

  @Override
  public void map(Object value, Issue issue, StorageEngine storage) {
    if (value != null) {
      Integer epReqNrUg = (Integer) value;
      if (epReqNrUg > 0) {
        issue.getFields().setEpReqNrUg(epReqNrUg);
      }
    }
  }
}
