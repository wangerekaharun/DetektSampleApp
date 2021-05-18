package com.raywenderlich.android.detektsampleapp

import org.junit.Test

class CustomRuleTest {
    @Test
    internal fun nonCompliantCodeShouldWarn() {
        val findings = com.raywenderlich.android.customrules.CustomRule().lint(
            """
                @Test
                @Test
                
                """.trimIndent()
        )
        assert(findings.isEmpty())

    }
}