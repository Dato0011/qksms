package com.bitblocker.messenger.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;

import com.bitblocker.messenger.data.ConversationLegacy;

public class MarkReadService extends IntentService {

    public MarkReadService() {
        super("MarkReadService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        long threadId = extras.getLong("thread_id");

        ConversationLegacy conversation = new ConversationLegacy(this, threadId);
        conversation.markRead();
    }
}
