// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookState extends com.pulumi.resources.ResourceArgs {

    public static final WebhookState Empty = new WebhookState();

    /**
     * The unique ID for an Amplify app.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The Amazon Resource Name (ARN) for the webhook.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name for a branch that is part of the Amplify app.
     * 
     */
    @Import(name="branchName")
    private @Nullable Output<String> branchName;

    public Optional<Output<String>> branchName() {
        return Optional.ofNullable(this.branchName);
    }

    /**
     * The description for a webhook.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The URL of the webhook.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private WebhookState() {}

    private WebhookState(WebhookState $) {
        this.appId = $.appId;
        this.arn = $.arn;
        this.branchName = $.branchName;
        this.description = $.description;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookState $;

        public Builder() {
            $ = new WebhookState();
        }

        public Builder(WebhookState defaults) {
            $ = new WebhookState(Objects.requireNonNull(defaults));
        }

        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder branchName(@Nullable Output<String> branchName) {
            $.branchName = branchName;
            return this;
        }

        public Builder branchName(String branchName) {
            return branchName(Output.of(branchName));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public WebhookState build() {
            return $;
        }
    }

}
