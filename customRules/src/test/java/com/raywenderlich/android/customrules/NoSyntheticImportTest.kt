package com.raywenderlich.android.customrules

import com.raywenderlich.android.customrules.rules.NoSyntheticImportRule
import io.gitlab.arturbosch.detekt.test.lint
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class NoSyntheticImportTest {

    @Test
    fun noSyntheticImports() {
        val findings = NoSyntheticImportRule().lint("""
        import a.b.c
        import kotlinx.android.synthetic.main.activity_synthetic_rule.*
        """.trimIndent())

        assertThat(findings).hasSize(1)
        assertThat(findings[0].message).isEqualTo("Importing 'kotlinx.android.synthetic.main.activity_synthetic_rule.*' which is a Kotlin Synthetics import.")
    }
}