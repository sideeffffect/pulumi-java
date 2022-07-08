// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.appengine.v1beta.outputs.ApiEndpointHandlerResponse;
import com.pulumi.googlenative.appengine.v1beta.outputs.ScriptHandlerResponse;
import com.pulumi.googlenative.appengine.v1beta.outputs.StaticFilesHandlerResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UrlMapResponse {
    /**
     * @return Uses API Endpoints to handle requests.
     * 
     */
    private final ApiEndpointHandlerResponse apiEndpoint;
    /**
     * @return Action to take when users access resources that require authentication. Defaults to redirect.
     * 
     */
    private final String authFailAction;
    /**
     * @return Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
     * 
     */
    private final String login;
    /**
     * @return 30x code to use when performing redirects for the secure field. Defaults to 302.
     * 
     */
    private final String redirectHttpResponseCode;
    /**
     * @return Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script&#34;: &#34;auto&#34;.
     * 
     */
    private final ScriptHandlerResponse script;
    /**
     * @return Security (HTTPS) enforcement for this URL.
     * 
     */
    private final String securityLevel;
    /**
     * @return Returns the contents of a file, such as an image, as the response.
     * 
     */
    private final StaticFilesHandlerResponse staticFiles;
    /**
     * @return URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    private final String urlRegex;

    @CustomType.Constructor
    private UrlMapResponse(
        @CustomType.Parameter("apiEndpoint") ApiEndpointHandlerResponse apiEndpoint,
        @CustomType.Parameter("authFailAction") String authFailAction,
        @CustomType.Parameter("login") String login,
        @CustomType.Parameter("redirectHttpResponseCode") String redirectHttpResponseCode,
        @CustomType.Parameter("script") ScriptHandlerResponse script,
        @CustomType.Parameter("securityLevel") String securityLevel,
        @CustomType.Parameter("staticFiles") StaticFilesHandlerResponse staticFiles,
        @CustomType.Parameter("urlRegex") String urlRegex) {
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
     * @return Uses API Endpoints to handle requests.
     * 
     */
    public ApiEndpointHandlerResponse apiEndpoint() {
        return this.apiEndpoint;
    }
    /**
     * @return Action to take when users access resources that require authentication. Defaults to redirect.
     * 
     */
    public String authFailAction() {
        return this.authFailAction;
    }
    /**
     * @return Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
     * 
     */
    public String login() {
        return this.login;
    }
    /**
     * @return 30x code to use when performing redirects for the secure field. Defaults to 302.
     * 
     */
    public String redirectHttpResponseCode() {
        return this.redirectHttpResponseCode;
    }
    /**
     * @return Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script&#34;: &#34;auto&#34;.
     * 
     */
    public ScriptHandlerResponse script() {
        return this.script;
    }
    /**
     * @return Security (HTTPS) enforcement for this URL.
     * 
     */
    public String securityLevel() {
        return this.securityLevel;
    }
    /**
     * @return Returns the contents of a file, such as an image, as the response.
     * 
     */
    public StaticFilesHandlerResponse staticFiles() {
        return this.staticFiles;
    }
    /**
     * @return URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    public String urlRegex() {
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

        public Builder apiEndpoint(ApiEndpointHandlerResponse apiEndpoint) {
            this.apiEndpoint = Objects.requireNonNull(apiEndpoint);
            return this;
        }
        public Builder authFailAction(String authFailAction) {
            this.authFailAction = Objects.requireNonNull(authFailAction);
            return this;
        }
        public Builder login(String login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }
        public Builder redirectHttpResponseCode(String redirectHttpResponseCode) {
            this.redirectHttpResponseCode = Objects.requireNonNull(redirectHttpResponseCode);
            return this;
        }
        public Builder script(ScriptHandlerResponse script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }
        public Builder securityLevel(String securityLevel) {
            this.securityLevel = Objects.requireNonNull(securityLevel);
            return this;
        }
        public Builder staticFiles(StaticFilesHandlerResponse staticFiles) {
            this.staticFiles = Objects.requireNonNull(staticFiles);
            return this;
        }
        public Builder urlRegex(String urlRegex) {
            this.urlRegex = Objects.requireNonNull(urlRegex);
            return this;
        }        public UrlMapResponse build() {
            return new UrlMapResponse(apiEndpoint, authFailAction, login, redirectHttpResponseCode, script, securityLevel, staticFiles, urlRegex);
        }
    }
}
