// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.appengine_v1.enums.UrlMapAuthFailAction;
import io.pulumi.googlenative.appengine_v1.enums.UrlMapLogin;
import io.pulumi.googlenative.appengine_v1.enums.UrlMapRedirectHttpResponseCode;
import io.pulumi.googlenative.appengine_v1.enums.UrlMapSecurityLevel;
import io.pulumi.googlenative.appengine_v1.inputs.ApiEndpointHandlerArgs;
import io.pulumi.googlenative.appengine_v1.inputs.ScriptHandlerArgs;
import io.pulumi.googlenative.appengine_v1.inputs.StaticFilesHandlerArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * URL pattern and description of how the URL should be handled. App Engine can handle URLs by executing application code or by serving static files uploaded with the version, such as images, CSS, or JavaScript.
 * 
 */
public final class UrlMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final UrlMapArgs Empty = new UrlMapArgs();

    /**
     * Uses API Endpoints to handle requests.
     * 
     */
    @InputImport(name="apiEndpoint")
      private final @Nullable Input<ApiEndpointHandlerArgs> apiEndpoint;

    public Input<ApiEndpointHandlerArgs> getApiEndpoint() {
        return this.apiEndpoint == null ? Input.empty() : this.apiEndpoint;
    }

    /**
     * Action to take when users access resources that require authentication. Defaults to redirect.
     * 
     */
    @InputImport(name="authFailAction")
      private final @Nullable Input<UrlMapAuthFailAction> authFailAction;

    public Input<UrlMapAuthFailAction> getAuthFailAction() {
        return this.authFailAction == null ? Input.empty() : this.authFailAction;
    }

    /**
     * Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
     * 
     */
    @InputImport(name="login")
      private final @Nullable Input<UrlMapLogin> login;

    public Input<UrlMapLogin> getLogin() {
        return this.login == null ? Input.empty() : this.login;
    }

    /**
     * 30x code to use when performing redirects for the secure field. Defaults to 302.
     * 
     */
    @InputImport(name="redirectHttpResponseCode")
      private final @Nullable Input<UrlMapRedirectHttpResponseCode> redirectHttpResponseCode;

    public Input<UrlMapRedirectHttpResponseCode> getRedirectHttpResponseCode() {
        return this.redirectHttpResponseCode == null ? Input.empty() : this.redirectHttpResponseCode;
    }

    /**
     * Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example "script": "auto".
     * 
     */
    @InputImport(name="script")
      private final @Nullable Input<ScriptHandlerArgs> script;

    public Input<ScriptHandlerArgs> getScript() {
        return this.script == null ? Input.empty() : this.script;
    }

    /**
     * Security (HTTPS) enforcement for this URL.
     * 
     */
    @InputImport(name="securityLevel")
      private final @Nullable Input<UrlMapSecurityLevel> securityLevel;

    public Input<UrlMapSecurityLevel> getSecurityLevel() {
        return this.securityLevel == null ? Input.empty() : this.securityLevel;
    }

    /**
     * Returns the contents of a file, such as an image, as the response.
     * 
     */
    @InputImport(name="staticFiles")
      private final @Nullable Input<StaticFilesHandlerArgs> staticFiles;

    public Input<StaticFilesHandlerArgs> getStaticFiles() {
        return this.staticFiles == null ? Input.empty() : this.staticFiles;
    }

    /**
     * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    @InputImport(name="urlRegex")
      private final @Nullable Input<String> urlRegex;

    public Input<String> getUrlRegex() {
        return this.urlRegex == null ? Input.empty() : this.urlRegex;
    }

    public UrlMapArgs(
        @Nullable Input<ApiEndpointHandlerArgs> apiEndpoint,
        @Nullable Input<UrlMapAuthFailAction> authFailAction,
        @Nullable Input<UrlMapLogin> login,
        @Nullable Input<UrlMapRedirectHttpResponseCode> redirectHttpResponseCode,
        @Nullable Input<ScriptHandlerArgs> script,
        @Nullable Input<UrlMapSecurityLevel> securityLevel,
        @Nullable Input<StaticFilesHandlerArgs> staticFiles,
        @Nullable Input<String> urlRegex) {
        this.apiEndpoint = apiEndpoint;
        this.authFailAction = authFailAction;
        this.login = login;
        this.redirectHttpResponseCode = redirectHttpResponseCode;
        this.script = script;
        this.securityLevel = securityLevel;
        this.staticFiles = staticFiles;
        this.urlRegex = urlRegex;
    }

    private UrlMapArgs() {
        this.apiEndpoint = Input.empty();
        this.authFailAction = Input.empty();
        this.login = Input.empty();
        this.redirectHttpResponseCode = Input.empty();
        this.script = Input.empty();
        this.securityLevel = Input.empty();
        this.staticFiles = Input.empty();
        this.urlRegex = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApiEndpointHandlerArgs> apiEndpoint;
        private @Nullable Input<UrlMapAuthFailAction> authFailAction;
        private @Nullable Input<UrlMapLogin> login;
        private @Nullable Input<UrlMapRedirectHttpResponseCode> redirectHttpResponseCode;
        private @Nullable Input<ScriptHandlerArgs> script;
        private @Nullable Input<UrlMapSecurityLevel> securityLevel;
        private @Nullable Input<StaticFilesHandlerArgs> staticFiles;
        private @Nullable Input<String> urlRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapArgs defaults) {
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

        public Builder apiEndpoint(@Nullable Input<ApiEndpointHandlerArgs> apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
            return this;
        }

        public Builder apiEndpoint(@Nullable ApiEndpointHandlerArgs apiEndpoint) {
            this.apiEndpoint = Input.ofNullable(apiEndpoint);
            return this;
        }

        public Builder authFailAction(@Nullable Input<UrlMapAuthFailAction> authFailAction) {
            this.authFailAction = authFailAction;
            return this;
        }

        public Builder authFailAction(@Nullable UrlMapAuthFailAction authFailAction) {
            this.authFailAction = Input.ofNullable(authFailAction);
            return this;
        }

        public Builder login(@Nullable Input<UrlMapLogin> login) {
            this.login = login;
            return this;
        }

        public Builder login(@Nullable UrlMapLogin login) {
            this.login = Input.ofNullable(login);
            return this;
        }

        public Builder redirectHttpResponseCode(@Nullable Input<UrlMapRedirectHttpResponseCode> redirectHttpResponseCode) {
            this.redirectHttpResponseCode = redirectHttpResponseCode;
            return this;
        }

        public Builder redirectHttpResponseCode(@Nullable UrlMapRedirectHttpResponseCode redirectHttpResponseCode) {
            this.redirectHttpResponseCode = Input.ofNullable(redirectHttpResponseCode);
            return this;
        }

        public Builder script(@Nullable Input<ScriptHandlerArgs> script) {
            this.script = script;
            return this;
        }

        public Builder script(@Nullable ScriptHandlerArgs script) {
            this.script = Input.ofNullable(script);
            return this;
        }

        public Builder securityLevel(@Nullable Input<UrlMapSecurityLevel> securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }

        public Builder securityLevel(@Nullable UrlMapSecurityLevel securityLevel) {
            this.securityLevel = Input.ofNullable(securityLevel);
            return this;
        }

        public Builder staticFiles(@Nullable Input<StaticFilesHandlerArgs> staticFiles) {
            this.staticFiles = staticFiles;
            return this;
        }

        public Builder staticFiles(@Nullable StaticFilesHandlerArgs staticFiles) {
            this.staticFiles = Input.ofNullable(staticFiles);
            return this;
        }

        public Builder urlRegex(@Nullable Input<String> urlRegex) {
            this.urlRegex = urlRegex;
            return this;
        }

        public Builder urlRegex(@Nullable String urlRegex) {
            this.urlRegex = Input.ofNullable(urlRegex);
            return this;
        }
        public UrlMapArgs build() {
            return new UrlMapArgs(apiEndpoint, authFailAction, login, redirectHttpResponseCode, script, securityLevel, staticFiles, urlRegex);
        }
    }
}
