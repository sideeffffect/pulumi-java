// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.appengine_v1.outputs.ApiEndpointHandlerResponse;
import io.pulumi.googlenative.appengine_v1.outputs.ScriptHandlerResponse;
import io.pulumi.googlenative.appengine_v1.outputs.StaticFilesHandlerResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UrlMapResponse {
    /**
     * Uses API Endpoints to handle requests.
     * 
     */
    private final ApiEndpointHandlerResponse apiEndpoint;
    /**
     * Action to take when users access resources that require authentication. Defaults to redirect.
     * 
     */
    private final String authFailAction;
    /**
     * Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
     * 
     */
    private final String login;
    /**
     * 30x code to use when performing redirects for the secure field. Defaults to 302.
     * 
     */
    private final String redirectHttpResponseCode;
    /**
     * Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example "script": "auto".
     * 
     */
    private final ScriptHandlerResponse script;
    /**
     * Security (HTTPS) enforcement for this URL.
     * 
     */
    private final String securityLevel;
    /**
     * Returns the contents of a file, such as an image, as the response.
     * 
     */
    private final StaticFilesHandlerResponse staticFiles;
    /**
     * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    private final String urlRegex;

    @OutputCustomType.Constructor({"apiEndpoint","authFailAction","login","redirectHttpResponseCode","script","securityLevel","staticFiles","urlRegex"})
    private UrlMapResponse(
        ApiEndpointHandlerResponse apiEndpoint,
        String authFailAction,
        String login,
        String redirectHttpResponseCode,
        ScriptHandlerResponse script,
        String securityLevel,
        StaticFilesHandlerResponse staticFiles,
        String urlRegex) {
        this.apiEndpoint = apiEndpoint;
        this.authFailAction = authFailAction;
        this.login = login;
        this.redirectHttpResponseCode = redirectHttpResponseCode;
        this.script = script;
        this.securityLevel = securityLevel;
        this.staticFiles = staticFiles;
        this.urlRegex = urlRegex;
    }

    /**
     * Uses API Endpoints to handle requests.
     * 
    */
    public ApiEndpointHandlerResponse getApiEndpoint() {
        return this.apiEndpoint;
    }
    /**
     * Action to take when users access resources that require authentication. Defaults to redirect.
     * 
    */
    public String getAuthFailAction() {
        return this.authFailAction;
    }
    /**
     * Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
     * 
    */
    public String getLogin() {
        return this.login;
    }
    /**
     * 30x code to use when performing redirects for the secure field. Defaults to 302.
     * 
    */
    public String getRedirectHttpResponseCode() {
        return this.redirectHttpResponseCode;
    }
    /**
     * Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example "script": "auto".
     * 
    */
    public ScriptHandlerResponse getScript() {
        return this.script;
    }
    /**
     * Security (HTTPS) enforcement for this URL.
     * 
    */
    public String getSecurityLevel() {
        return this.securityLevel;
    }
    /**
     * Returns the contents of a file, such as an image, as the response.
     * 
    */
    public StaticFilesHandlerResponse getStaticFiles() {
        return this.staticFiles;
    }
    /**
     * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
    */
    public String getUrlRegex() {
        return this.urlRegex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiEndpointHandlerResponse apiEndpoint;
        private String authFailAction;
        private String login;
        private String redirectHttpResponseCode;
        private ScriptHandlerResponse script;
        private String securityLevel;
        private StaticFilesHandlerResponse staticFiles;
        private String urlRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiEndpoint = defaults.apiEndpoint;
    	      this.authFailAction = defaults.authFailAction;
    	      this.login = defaults.login;
    	      this.redirectHttpResponseCode = defaults.redirectHttpResponseCode;
    	      this.script = defaults.script;
    	      this.securityLevel = defaults.securityLevel;
    	      this.staticFiles = defaults.staticFiles;
    	      this.urlRegex = defaults.urlRegex;
        }

        public Builder setApiEndpoint(ApiEndpointHandlerResponse apiEndpoint) {
            this.apiEndpoint = Objects.requireNonNull(apiEndpoint);
            return this;
        }

        public Builder setAuthFailAction(String authFailAction) {
            this.authFailAction = Objects.requireNonNull(authFailAction);
            return this;
        }

        public Builder setLogin(String login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }

        public Builder setRedirectHttpResponseCode(String redirectHttpResponseCode) {
            this.redirectHttpResponseCode = Objects.requireNonNull(redirectHttpResponseCode);
            return this;
        }

        public Builder setScript(ScriptHandlerResponse script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }

        public Builder setSecurityLevel(String securityLevel) {
            this.securityLevel = Objects.requireNonNull(securityLevel);
            return this;
        }

        public Builder setStaticFiles(StaticFilesHandlerResponse staticFiles) {
            this.staticFiles = Objects.requireNonNull(staticFiles);
            return this;
        }

        public Builder setUrlRegex(String urlRegex) {
            this.urlRegex = Objects.requireNonNull(urlRegex);
            return this;
        }
        public UrlMapResponse build() {
            return new UrlMapResponse(apiEndpoint, authFailAction, login, redirectHttpResponseCode, script, securityLevel, staticFiles, urlRegex);
        }
    }
}
