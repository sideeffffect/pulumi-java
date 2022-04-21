// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub;

import com.pulumi.azurenative.webpubsub.inputs.WebPubSubHubPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebPubSubHubArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebPubSubHubArgs Empty = new WebPubSubHubArgs();

    /**
     * The hub name.
     * 
     */
    @Import(name="hubName")
    private @Nullable Output<String> hubName;

    public Optional<Output<String>> hubName() {
        return Optional.ofNullable(this.hubName);
    }

    /**
     * Properties of a hub.
     * 
     */
    @Import(name="properties", required=true)
    private Output<WebPubSubHubPropertiesArgs> properties;

    public Output<WebPubSubHubPropertiesArgs> properties() {
        return this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName;
    }

    private WebPubSubHubArgs() {}

    private WebPubSubHubArgs(WebPubSubHubArgs $) {
        this.hubName = $.hubName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebPubSubHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebPubSubHubArgs $;

        public Builder() {
            $ = new WebPubSubHubArgs();
        }

        public Builder(WebPubSubHubArgs defaults) {
            $ = new WebPubSubHubArgs(Objects.requireNonNull(defaults));
        }

        public Builder hubName(@Nullable Output<String> hubName) {
            $.hubName = hubName;
            return this;
        }

        public Builder hubName(String hubName) {
            return hubName(Output.of(hubName));
        }

        public Builder properties(Output<WebPubSubHubPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(WebPubSubHubPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public WebPubSubHubArgs build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
