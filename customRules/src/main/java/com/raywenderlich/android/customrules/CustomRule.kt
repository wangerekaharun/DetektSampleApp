package com.raywenderlich.android.customrules

import io.gitlab.arturbosch.detekt.api.*
import org.jetbrains.kotlin.psi.KtAnnotationEntry
import org.jetbrains.kotlin.psi.KtImportDirective

class CustomRule(): Rule() {

    override val issue = Issue("NoInternalImport",
        Severity.Maintainability, "Don’t import from an internal "
                + "package as they are subject to change.", Debt.TWENTY_MINS)
    override fun visitImportDirective(
        importDirective: KtImportDirective
    ) {
        val import = importDirective.importPath?.pathStr
        if (import?.contains("concurrent") == true) {
            report(CodeSmell(issue, Entity.from(importDirective),
                "Importing '$import' which is an internal import."))
        }
    }
}