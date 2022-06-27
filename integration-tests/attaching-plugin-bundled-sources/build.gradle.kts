// Copyright 2000-2022 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

intellij {
    type.set("GO")
    version.set("2021.2.4")
    plugins.set(listOf("org.jetbrains.plugins.go"))
    // explicit override of the default false value when the "CI" environment variable exists:
    downloadSources.set(true)

    tasks {
        buildSearchableOptions {
            enabled = false
        }
    }
}
