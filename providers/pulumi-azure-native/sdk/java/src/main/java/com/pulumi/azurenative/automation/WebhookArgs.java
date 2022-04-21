// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.azurenative.automation.inputs.RunbookAssociationPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebhookArgs Empty = new WebhookArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the expiry time.
     * 
     */
    @Import(name="expiryTime")
    private @Nullable Output<String> expiryTime;

    public Optional<Output<String>> expiryTime() {
        return Optional.ofNullable(this.expiryTime);
    }

    /**
     * Gets or sets the value of the enabled flag of webhook.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * Gets or sets the name of the webhook.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Gets or sets the parameters of the job.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the name of the hybrid worker group the webhook job will run on.
     * 
     */
    @Import(name="runOn")
    private @Nullable Output<String> runOn;

    public Optional<Output<String>> runOn() {
        return Optional.ofNullable(this.runOn);
    }

    /**
     * Gets or sets the runbook.
     * 
     */
    @Import(name="runbook")
    private @Nullable Output<RunbookAssociationPropertyArgs> runbook;

    public Optional<Output<RunbookAssociationPropertyArgs>> runbook() {
        return Optional.ofNullable(this.runbook);
    }

    /**
     * Gets or sets the uri.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    /**
     * The webhook name.
     * 
     */
    @Import(name="webhookName")
    private @Nullable Output<String> webhookName;

    public Optional<Output<String>> webhookName() {
        return Optional.ofNullable(this.webhookName);
    }

    private WebhookArgs() {}

    private WebhookArgs(WebhookArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.expiryTime = $.expiryTime;
        this.isEnabled = $.isEnabled;
        this.name = $.name;
        this.parameters = $.parameters;
        this.resourceGroupName = $.resourceGroupName;
        this.runOn = $.runOn;
        this.runbook = $.runbook;
        this.uri = $.uri;
        this.webhookName = $.webhookName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookArgs $;

        public Builder() {
            $ = new WebhookArgs();
        }

        public Builder(WebhookArgs defaults) {
            $ = new WebhookArgs(Objects.requireNonNull(defaults));
        }

        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        public Builder expiryTime(@Nullable Output<String> expiryTime) {
            $.expiryTime = expiryTime;
            return this;
        }

        public Builder expiryTime(String expiryTime) {
            return expiryTime(Output.of(expiryTime));
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder runOn(@Nullable Output<String> runOn) {
            $.runOn = runOn;
            return this;
        }

        public Builder runOn(String runOn) {
            return runOn(Output.of(runOn));
        }

        public Builder runbook(@Nullable Output<RunbookAssociationPropertyArgs> runbook) {
            $.runbook = runbook;
            return this;
        }

        public Builder runbook(RunbookAssociationPropertyArgs runbook) {
            return runbook(Output.of(runbook));
        }

        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public Builder webhookName(@Nullable Output<String> webhookName) {
            $.webhookName = webhookName;
            return this;
        }

        public Builder webhookName(String webhookName) {
            return webhookName(Output.of(webhookName));
        }

        public WebhookArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
