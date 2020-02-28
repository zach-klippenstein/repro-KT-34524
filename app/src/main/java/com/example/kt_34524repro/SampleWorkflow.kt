package com.example.kt_34524repro

import com.squareup.workflow.RenderContext
import com.squareup.workflow.StatelessWorkflow

/**
 * This file demonstrates the bug filed at https://youtrack.jetbrains.com/issue/KT-34524.
 */
class SampleWorkflow : StatelessWorkflow<Unit, Nothing, Unit>() {
    override fun render(props: Unit, context: RenderContext<Nothing, Nothing>) {
        // Note that the IDE does not even suggest to import this function.
        action {}

        // Nothing under the call will be parsed or analyzed for errors.
        Nothing here is parsed .
    }
}
