// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.WebHookActivityMethod;
import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.azurenative.datafactory.inputs.WebActivityAuthenticationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * WebHook activity.
 * 
 */
public final class WebHookActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebHookActivityArgs Empty = new WebHookActivityArgs();

    /**
     * Authentication method used for calling the endpoint.
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<WebActivityAuthenticationArgs> authentication;

    public Optional<Output<WebActivityAuthenticationArgs>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="body")
    private @Nullable Output<Object> body;

    public Optional<Output<Object>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Optional<Output<List<ActivityDependencyArgs>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: &#34;headers&#34; : { &#34;Accept-Language&#34;: &#34;en-us&#34;, &#34;Content-Type&#34;: &#34;application/json&#34; }. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="headers")
    private @Nullable Output<Object> headers;

    public Optional<Output<Object>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * Rest API method for target endpoint.
     * 
     */
    @Import(name="method", required=true)
    private Output<Either<String,WebHookActivityMethod>> method;

    public Output<Either<String,WebHookActivityMethod>> method() {
        return this.method;
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * When set to true, statusCode, output and error in callback request body will be consumed by activity. The activity can be marked as failed by setting statusCode &gt;= 400 in callback request. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="reportStatusOnCallBack")
    private @Nullable Output<Object> reportStatusOnCallBack;

    public Optional<Output<Object>> reportStatusOnCallBack() {
        return Optional.ofNullable(this.reportStatusOnCallBack);
    }

    /**
     * The timeout within which the webhook should be called back. If there is no value specified, it defaults to 10 minutes. Type: string. Pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * Type of activity.
     * Expected value is &#39;WebHook&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * WebHook activity target endpoint and path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
    private Output<Object> url;

    public Output<Object> url() {
        return this.url;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable Output<List<UserPropertyArgs>> userProperties;

    public Optional<Output<List<UserPropertyArgs>>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    private WebHookActivityArgs() {}

    private WebHookActivityArgs(WebHookActivityArgs $) {
        this.authentication = $.authentication;
        this.body = $.body;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.headers = $.headers;
        this.method = $.method;
        this.name = $.name;
        this.reportStatusOnCallBack = $.reportStatusOnCallBack;
        this.timeout = $.timeout;
        this.type = $.type;
        this.url = $.url;
        this.userProperties = $.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebHookActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebHookActivityArgs $;

        public Builder() {
            $ = new WebHookActivityArgs();
        }

        public Builder(WebHookActivityArgs defaults) {
            $ = new WebHookActivityArgs(Objects.requireNonNull(defaults));
        }

        public Builder authentication(@Nullable Output<WebActivityAuthenticationArgs> authentication) {
            $.authentication = authentication;
            return this;
        }

        public Builder authentication(WebActivityAuthenticationArgs authentication) {
            return authentication(Output.of(authentication));
        }

        public Builder body(@Nullable Output<Object> body) {
            $.body = body;
            return this;
        }

        public Builder body(Object body) {
            return body(Output.of(body));
        }

        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(List<ActivityDependencyArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder headers(@Nullable Output<Object> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(Object headers) {
            return headers(Output.of(headers));
        }

        public Builder method(Output<Either<String,WebHookActivityMethod>> method) {
            $.method = method;
            return this;
        }

        public Builder method(Either<String,WebHookActivityMethod> method) {
            return method(Output.of(method));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder reportStatusOnCallBack(@Nullable Output<Object> reportStatusOnCallBack) {
            $.reportStatusOnCallBack = reportStatusOnCallBack;
            return this;
        }

        public Builder reportStatusOnCallBack(Object reportStatusOnCallBack) {
            return reportStatusOnCallBack(Output.of(reportStatusOnCallBack));
        }

        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder url(Output<Object> url) {
            $.url = url;
            return this;
        }

        public Builder url(Object url) {
            return url(Output.of(url));
        }

        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        public Builder userProperties(List<UserPropertyArgs> userProperties) {
            return userProperties(Output.of(userProperties));
        }

        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public WebHookActivityArgs build() {
            $.method = Objects.requireNonNull($.method, "expected parameter 'method' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
