package com.example.myapplication;
import static android.os.Trace.isEnabled;

import static androidx.core.content.MimeTypeFilter.matches;

import org.junit.Test;
public class MainActivityTest {
    @Test
    public void testButtonEnabled() {
        onView(withId(R.id.btnLogin))

                .check(matches(isEnabled()));
    }