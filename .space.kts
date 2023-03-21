/**
* JetBrains Space Automation
* This Kotlin-script file lets you automate build activities
* For more info, see https://www.jetbrains.com/help/space/automation.html
*/

job("build_deps") {
    startOn {
        gitPush { 
          enabled = true,
          branchFilter {
            +"refs/heads/master"
        }
          tagFilter {
            +"20[2-9][0-9]-[0-9][0-9]-[0-9][0-9]"
    }
}
