package com.raywenderlich.android.detektsampleapp

val detektRules = listOf(
    RulesModel("Comments", "This rule set provides rules that address issues in comments and documentation of the code", "https://detekt.github.io/detekt/comments.html"),
    RulesModel("Complexity", "This rule set contains rules that report complex code", "https://detekt.github.io/detekt/complexity.html"),
    RulesModel("Coroutines", "The coroutines rule set analyzes code for potential coroutines problems.", "https://detekt.github.io/detekt/coroutines.html"),
    RulesModel("Empty-Blocks", "The empty-blocks ruleset contains rules that will report empty blocks of code which should be avoided.","https://detekt.github.io/detekt/empty-blocks.html"),
    RulesModel("Exceptions", "Rules in this rule set report issues related to how code throws and handles Exceptions", "https://detekt.github.io/detekt/exceptions.html"),
    RulesModel("Formatting", "This rule set provides wrappers for rules implemented by ktlint - https://ktlint.github.io/.e","https://detekt.github.io/detekt/formatting.html"),
    RulesModel("Naming", "The naming ruleset contains rules which assert the naming of different parts of the codebase.", "https://detekt.github.io/detekt/naming.html"),
    RulesModel("Performance", "The performance rule set analyzes code for potential performance problems.","https://detekt.github.io/detekt/performance.html"),
    RulesModel("Potential-Bugs", "The potential-bugs rule set provides rules that detect potential bugs.", "https://detekt.github.io/detekt/potential-bugs.html"),
    RulesModel("Class Ordering", "The Style ruleset provides rules that assert the style of the code. This will help keep code in line with the given code style guidelines", "https://detekt.github.io/detekt/style.html"),
)