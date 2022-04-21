// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSpacecraftArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSpacecraftArgs Empty = new GetSpacecraftArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Spacecraft ID
     * 
     */
    @Import(name="spacecraftName", required=true)
    private String spacecraftName;

    public String spacecraftName() {
        return this.spacecraftName;
    }

    private GetSpacecraftArgs() {}

    private GetSpacecraftArgs(GetSpacecraftArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.spacecraftName = $.spacecraftName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSpacecraftArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSpacecraftArgs $;

        public Builder() {
            $ = new GetSpacecraftArgs();
        }

        public Builder(GetSpacecraftArgs defaults) {
            $ = new GetSpacecraftArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder spacecraftName(String spacecraftName) {
            $.spacecraftName = spacecraftName;
            return this;
        }

        public GetSpacecraftArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.spacecraftName = Objects.requireNonNull($.spacecraftName, "expected parameter 'spacecraftName' to be non-null");
            return $;
        }
    }

}
