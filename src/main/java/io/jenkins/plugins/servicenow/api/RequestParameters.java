package io.jenkins.plugins.servicenow.api;

public interface RequestParameters {

    String API_VERSION = "api_version";
    String SCOPE = "scope";
    String APP_SCOPE = "app_scope";
    String SYSTEM_ID = "sys_id";
    String APP_SYSTEM_ID = "app_sys_id";
    String BRANCH_NAME = "branch_name";
    String APP_AUTO_UPGRADE_BASE = "auto_upgrade_base_app";
    String APP_BASE_VERSION = "base_app_version";

    String TEST_SUITE_NAME = "test_suite_name";
    String TEST_SUITE_SYS_ID = "test_suite_sys_id";
    String OS_NAME = "os_name";
    String OS_VERSION = "os_version";
    String BROWSER_NAME = "browser_name";
    String BROWSER_VERSION = "browser_version";

    String APP_VERSION = "version";
    String DEV_NOTES = "dev_notes";
}
