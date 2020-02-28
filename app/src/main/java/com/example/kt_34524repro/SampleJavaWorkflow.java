package com.example.kt_34524repro;

import com.squareup.workflow.RenderContext;
import com.squareup.workflow.StatelessWorkflow;

/**
 * The bug also affects Java files, not just Kotlin ones.
 */
class SampleJavaWorkflow extends StatelessWorkflow<Void, Void, Void> {

    public Void render(Void props, RenderContext<Void, Void> context) {
        return null;
    }
}
