package com.github.zttasoiaf.gitjump.services

import com.intellij.openapi.project.Project
import com.github.zttasoiaf.gitjump.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
