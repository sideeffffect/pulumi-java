// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexibleAppVersionApiConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionApiConfigArgs Empty = new FlexibleAppVersionApiConfigArgs();

    /**
     * Action to take when users access resources that require authentication.
     * Default value is `AUTH_FAIL_ACTION_REDIRECT`.
     * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
     * 
     */
    @Import(name="authFailAction")
    private @Nullable Output<String> authFailAction;

    public Optional<Output<String>> authFailAction() {
        return Optional.ofNullable(this.authFailAction);
    }

    /**
     * Level of login required to access this resource.
     * Default value is `LOGIN_OPTIONAL`.
     * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
     * 
     */
    @Import(name="login")
    private @Nullable Output<String> login;

    public Optional<Output<String>> login() {
        return Optional.ofNullable(this.login);
    }

    /**
     * Path to the script from the application root directory.
     * 
     */
    @Import(name="script", required=true)
    private Output<String> script;

    public Output<String> script() {
        return this.script;
    }

    /**
     * Security (HTTPS) enforcement for this URL.
     * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
     * 
     */
    @Import(name="securityLevel")
    private @Nullable Output<String> securityLevel;

    public Optional<Output<String>> securityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }

    /**
     * URL to serve the endpoint at.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private FlexibleAppVersionApiConfigArgs() {}

    private FlexibleAppVersionApiConfigArgs(FlexibleAppVersionApiConfigArgs $) {
        this.authFailAction = $.authFailAction;
        this.login = $.login;
        this.script = $.script;
        this.securityLevel = $.securityLevel;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleAppVersionApiConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleAppVersionApiConfigArgs $;

        public Builder() {
            $ = new FlexibleAppVersionApiConfigArgs();
        }

        public Builder(FlexibleAppVersionApiConfigArgs defaults) {
            $ = new FlexibleAppVersionApiConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder authFailAction(@Nullable Output<String> authFailAction) {
            $.authFailAction = authFailAction;
            return this;
        }

        public Builder authFailAction(String authFailAction) {
            return authFailAction(Output.of(authFailAction));
        }

        public Builder login(@Nullable Output<String> login) {
            $.login = login;
            return this;
        }

        public Builder login(String login) {
            return login(Output.of(login));
        }

        public Builder script(Output<String> script) {
            $.script = script;
            return this;
        }

        public Builder script(String script) {
            return script(Output.of(script));
        }

        public Builder securityLevel(@Nullable Output<String> securityLevel) {
            $.securityLevel = securityLevel;
            return this;
        }

        public Builder securityLevel(String securityLevel) {
            return securityLevel(Output.of(securityLevel));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public FlexibleAppVersionApiConfigArgs build() {
            $.script = Objects.requireNonNull($.script, "expected parameter 'script' to be non-null");
            return $;
        }
    }

}
