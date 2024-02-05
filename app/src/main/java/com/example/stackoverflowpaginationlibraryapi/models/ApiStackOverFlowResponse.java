package com.example.stackoverflowpaginationlibraryapi.models;

import android.content.ClipData;
import android.net.Uri;

import androidx.core.view.accessibility.AccessibilityViewCommand;

import java.security.acl.Owner;
import java.util.List;

public class ApiStackOverFlowResponse {

    private List<Item> items;
    private boolean has_more;
    private int quota_max;
    private int quota_remaining;
    private class Item {
        private ApiStackOverFlowResponse.Owner owner;
        private boolean is_accepted;
        private long answer_id;
        private String content_license;
        private long creation_date;
        private long last_activity_date;
        private long question_id;
    }

    private class Owner {
        private String user_type;
        private String reputation;
        private long user_id;
        private int accept_rate;
        private String profile_image;
        private String display_name;
        private String link;
    }

}
