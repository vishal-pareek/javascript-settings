package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object JavaScript_Template : Template({
    uuid = "a43becd4-87e9-4155-9c2f-36b67a84ec02"
    id = "JavaScript_Template"
    name = "Template"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    }

    steps {
        script {
            name = "npm install"
            id = "RUNNER_4"
            scriptContent = "npm install"
        }
        script {
            name = "Browser Test"
            id = "RUNNER_6"
            scriptContent = "npm test -- --single-run --Browsers %Browser% --colors false --reporters teamcity"
        }
        stepsOrder = arrayListOf("RUNNER_4", "RUNNER_6")
    }

    triggers {
        vcs {
            id = "vcsTrigger"
            branchFilter = ""
        }
    }
})
