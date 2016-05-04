package com.dell.gumshoe.inspector;

import com.dell.gumshoe.inspector.tools.SampleSelectionListener;

import javax.swing.event.ChangeListener;

public interface SampleSource {
    public void addListener(SampleSelectionListener listener);
    public boolean hasNext();
    public boolean hasPrevious();
    public void nextSample();
    public void previousSample();
}