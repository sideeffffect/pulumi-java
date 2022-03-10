// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline;

import io.pulumi.aws.codepipeline.inputs.WebhookAuthenticationConfigurationArgs;
import io.pulumi.aws.codepipeline.inputs.WebhookFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebhookArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookArgs Empty = new WebhookArgs();

    /**
     * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
     * 
     */
    @InputImport(name="authentication", required=true)
      private final Input<String> authentication;

    public Input<String> getAuthentication() {
        return this.authentication;
    }

    /**
     * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
     * 
     */
    @InputImport(name="authenticationConfiguration")
      private final @Nullable Input<WebhookAuthenticationConfigurationArgs> authenticationConfiguration;

    public Input<WebhookAuthenticationConfigurationArgs> getAuthenticationConfiguration() {
        return this.authenticationConfiguration == null ? Input.empty() : this.authenticationConfiguration;
    }

    /**
     * One or more `filter` blocks. Filter blocks are documented below.
     * 
     */
    @InputImport(name="filters", required=true)
      private final Input<List<WebhookFilterArgs>> filters;

    public Input<List<WebhookFilterArgs>> getFilters() {
        return this.filters;
    }

    /**
     * The name of the webhook.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
     * 
     */
    @InputImport(name="targetAction", required=true)
      private final Input<String> targetAction;

    public Input<String> getTargetAction() {
        return this.targetAction;
    }

    /**
     * The name of the pipeline.
     * 
     */
    @InputImport(name="targetPipeline", required=true)
      private final Input<String> targetPipeline;

    public Input<String> getTargetPipeline() {
        return this.targetPipeline;
    }

    public WebhookArgs(
        Input<String> authentication,
        @Nullable Input<WebhookAuthenticationConfigurationArgs> authenticationConfiguration,
        Input<List<WebhookFilterArgs>> filters,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags,
        Input<String> targetAction,
        Input<String> targetPipeline) {
        this.authentication = Objects.requireNonNull(authentication, "expected parameter 'authentication' to be non-null");
        this.authenticationConfiguration = authenticationConfiguration;
        this.filters = Objects.requireNonNull(filters, "expected parameter 'filters' to be non-null");
        this.name = name;
        this.tags = tags;
        this.targetAction = Objects.requireNonNull(targetAction, "expected parameter 'targetAction' to be non-null");
        this.targetPipeline = Objects.requireNonNull(targetPipeline, "expected parameter 'targetPipeline' to be non-null");
    }

    private WebhookArgs() {
        this.authentication = Input.empty();
        this.authenticationConfiguration = Input.empty();
        this.filters = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.targetAction = Input.empty();
        this.targetPipeline = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authentication;
        private @Nullable Input<WebhookAuthenticationConfigurationArgs> authenticationConfiguration;
        private Input<List<WebhookFilterArgs>> filters;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> targetAction;
        private Input<String> targetPipeline;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.authenticationConfiguration = defaults.authenticationConfiguration;
    	      this.filters = defaults.filters;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.targetAction = defaults.targetAction;
    	      this.targetPipeline = defaults.targetPipeline;
        }

        public Builder authentication(Input<String> authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }

        public Builder authentication(String authentication) {
            this.authentication = Input.of(Objects.requireNonNull(authentication));
            return this;
        }

        public Builder authenticationConfiguration(@Nullable Input<WebhookAuthenticationConfigurationArgs> authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        public Builder authenticationConfiguration(@Nullable WebhookAuthenticationConfigurationArgs authenticationConfiguration) {
            this.authenticationConfiguration = Input.ofNullable(authenticationConfiguration);
            return this;
        }

        public Builder filters(Input<List<WebhookFilterArgs>> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }

        public Builder filters(List<WebhookFilterArgs> filters) {
            this.filters = Input.of(Objects.requireNonNull(filters));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder targetAction(Input<String> targetAction) {
            this.targetAction = Objects.requireNonNull(targetAction);
            return this;
        }

        public Builder targetAction(String targetAction) {
            this.targetAction = Input.of(Objects.requireNonNull(targetAction));
            return this;
        }

        public Builder targetPipeline(Input<String> targetPipeline) {
            this.targetPipeline = Objects.requireNonNull(targetPipeline);
            return this;
        }

        public Builder targetPipeline(String targetPipeline) {
            this.targetPipeline = Input.of(Objects.requireNonNull(targetPipeline));
            return this;
        }
        public WebhookArgs build() {
            return new WebhookArgs(authentication, authenticationConfiguration, filters, name, tags, targetAction, targetPipeline);
        }
    }
}
