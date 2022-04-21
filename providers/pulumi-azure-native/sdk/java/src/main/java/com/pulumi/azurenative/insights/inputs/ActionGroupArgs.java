// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A pointer to an Azure Action Group.
 * 
 */
public final class ActionGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionGroupArgs Empty = new ActionGroupArgs();

    /**
     * The resource ID of the Action Group. This cannot be null or empty.
     * 
     */
    @Import(name="actionGroupId", required=true)
    private Output<String> actionGroupId;

    public Output<String> actionGroupId() {
        return this.actionGroupId;
    }

    /**
     * the dictionary of custom properties to include with the post operation. These data are appended to the webhook payload.
     * 
     */
    @Import(name="webhookProperties")
    private @Nullable Output<Map<String,String>> webhookProperties;

    public Optional<Output<Map<String,String>>> webhookProperties() {
        return Optional.ofNullable(this.webhookProperties);
    }

    private ActionGroupArgs() {}

    private ActionGroupArgs(ActionGroupArgs $) {
        this.actionGroupId = $.actionGroupId;
        this.webhookProperties = $.webhookProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionGroupArgs $;

        public Builder() {
            $ = new ActionGroupArgs();
        }

        public Builder(ActionGroupArgs defaults) {
            $ = new ActionGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder actionGroupId(Output<String> actionGroupId) {
            $.actionGroupId = actionGroupId;
            return this;
        }

        public Builder actionGroupId(String actionGroupId) {
            return actionGroupId(Output.of(actionGroupId));
        }

        public Builder webhookProperties(@Nullable Output<Map<String,String>> webhookProperties) {
            $.webhookProperties = webhookProperties;
            return this;
        }

        public Builder webhookProperties(Map<String,String> webhookProperties) {
            return webhookProperties(Output.of(webhookProperties));
        }

        public ActionGroupArgs build() {
            $.actionGroupId = Objects.requireNonNull($.actionGroupId, "expected parameter 'actionGroupId' to be non-null");
            return $;
        }
    }

}
